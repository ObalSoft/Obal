/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entities.Analysis;
import Entities.Bill;
import Entities.Client;
import Entities.Order;
import Entities.Result;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import utilities.DataSource;

/**
 *
 * @author Alaa Shafshak
 */
public class BillController {

    Double total = 0.0;

    private String findClientString = "select * from Client where lower(first_name) like ?;";
    private String findOrdString = "select ordonnance.idordonnance, ordonnance.idclient, ordonnance.date, ordonnance.ispayed,"
            + "client.idclient, client.first_name, client.last_name from ordonnance join client on "
            + "ordonnance.idclient=client.idclient  where ordonnance.idclient=? and ordonnance.isPayed=false;";

   private String findAnalysisByOrdString = "select ordonnance.idordonnance, ordonnance.idclient, ordonnance.date, ordonnance.ispayed,"
            + "results.idordonnance, results.idAnalyse, analyse.idAnalyse, analyse.name,analyse.unite,analyse.price,results.particip "
            + "from ordonnance join results on "
            + "ordonnance.idordonnance=results.idordonnance join analyse on results.idAnalyse=analyse.idAnalyse "
            + "where ordonnance.idordonnance=?;";
 private String findAnalysisByOrdString2 = "select ordonnance.idordonnance, ordonnance.idclient, ordonnance.date, ordonnance.ispayed,"
            + "results.idordonnance, results.idAnalyse, analyse.idAnalyse, analyse.name,analyse.price,results.particip "
            + "from ordonnance join results on "
            + "ordonnance.idordonnance=results.idordonnance join analyse on results.idAnalyse=analyse.idAnalyse "
            + "where ordonnance.idordonnance=?;";

   
    private String findCliendId = "select idclient from Client where first_name like ? and last_name like ?;";

    private String findParticipString = "select analyse.idAnalyse, analyse.name, results.idAnalyse, results.particip "
            + "from analyse join results on analyse.idAnalyse=results.idAnalyse where analyse.idAnalyse=?; ";

    private String getAnalyseId = "select idAnalyse from analyse where name like ?";

    private String updateResultString = "update `obal`.`results` set particip=? where results.idAnalyse=? and results.idordonnance=?;";

    private String getDoctorFirst = "select ordonnance.idordonnance, ordonnance.idMedecin, "
            + "medecin.idMedecin, medecin.nom from ordonnance join medecin "
            + "on ordonnance.idMedecin=medecin.idMedecin where ordonnance.idordonnance=?;";

    private String getDoctorLast = "select ordonnance.idordonnance, ordonnance.idMedecin, "
            + "medecin.idMedecin, medecin.prenom from ordonnance join medecin "
            + "on ordonnance.idMedecin=medecin.idMedecin where ordonnance.idordonnance=?;";

    private String getBillCount = "select count(*) from facture;";
    private String insertFacture = "insert into facture values(?,?,?);";
    
    private String paidOrder="update  `obal`.`ordonnance` set isPayed=1 where idOrdonnance=?   ";
    
    
    private PreparedStatement findClientStmt;
    private PreparedStatement findOrdStmt;
    private PreparedStatement findAnalyseByOrdStmt;
    private PreparedStatement findAnalyseByOrdStmt2;
    private PreparedStatement findClientIdStmt;
    private PreparedStatement findParticipStmt;
    private PreparedStatement getAnalyseIdStmt;
    private PreparedStatement updateResultStmt;
    private PreparedStatement getDoctorFirstStmt;
    private PreparedStatement getDoctorLastStmt;
    private PreparedStatement getBillCountStmt;
    private PreparedStatement insertFactureStmt;
    private PreparedStatement paidOrderStatement;
    
    
    public BillController() {
        try {
            findClientStmt = DataSource.getConnection().prepareStatement(findClientString);
            findOrdStmt = DataSource.getConnection().prepareStatement(findOrdString);
            findAnalyseByOrdStmt = DataSource.getConnection().prepareStatement(findAnalysisByOrdString);
            findAnalyseByOrdStmt2 = DataSource.getConnection().prepareStatement(findAnalysisByOrdString2);
            findClientIdStmt = DataSource.getConnection().prepareStatement(findCliendId);
            findParticipStmt = DataSource.getConnection().prepareStatement(findParticipString);
            getAnalyseIdStmt = DataSource.getConnection().prepareStatement(getAnalyseId);
            updateResultStmt = DataSource.getConnection().prepareStatement(updateResultString);
            getDoctorFirstStmt = DataSource.getConnection().prepareStatement(getDoctorFirst);
            getDoctorLastStmt = DataSource.getConnection().prepareStatement(getDoctorLast);
            getBillCountStmt = DataSource.getConnection().prepareStatement(getBillCount);
            insertFactureStmt = DataSource.getConnection().prepareStatement(insertFacture);
            paidOrderStatement=DataSource.getConnection().prepareStatement(paidOrder);
            
        } catch (SQLException ex) {
            Logger.getLogger(BillController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<String> findClient(String subname) throws SQLException {
        List<String> ls = new ArrayList();
        if (subname == null) {
            findClientStmt.setString(1, "%%");
        } else {
            findClientStmt.setString(1, subname + "%");
            ResultSet set = findClientStmt.executeQuery();
            while (set.next()) {
                String fullName = set.getString(2) + " " + set.getString(3);
                ls.add(fullName);
            }
            set.close();
        }
        return ls;
    }

    
    public void updatePaid(int id) throws SQLException{
    paidOrderStatement.setInt(1, id);
    total=0.0;
    paidOrderStatement.executeUpdate();
        
    }
    
    
    public List<Order> findOrd(String subFirst, String subLast) throws SQLException {
        List<Order> ls = new ArrayList();

        if (subFirst == null) {
            findClientIdStmt.setString(1, "%%");
        } else {
            findClientIdStmt.setString(1, subFirst);
        }
        if (subLast == null) {
            findClientIdStmt.setString(2, "%%");
        } else {
            findClientIdStmt.setString(2, subLast);
        }
        
        ResultSet set_1 = findClientIdStmt.executeQuery();
        set_1.next();
        int clientId = set_1.getInt(1);

        findOrdStmt.setInt(1, clientId);
        ResultSet set_2 = findOrdStmt.executeQuery();

        int id;
        LocalDate date;
        while (set_2.next()) {
            id = set_2.getInt(1);
            date = set_2.getDate(3).toLocalDate();
            ls.add(new Order(id, date));
        }
        set_1.close();
        set_2.close();

        return ls;
    }

    public List<Analysis> findAnalysisByOrd(int id) throws SQLException {
        List<Analysis> ls = new ArrayList<>();

        findAnalyseByOrdStmt.setInt(1, id);
        ResultSet set = findAnalyseByOrdStmt.executeQuery();
        while (set.next()) {
            ls.add(new Analysis(set.getInt(7), set.getString(8),set.getString(9)));
        }
        set.close();
        return ls;
    }

    public String findParticip(int id) throws SQLException {
        String part = null;
        findParticipStmt.setInt(1, id);
        ResultSet set = findParticipStmt.executeQuery();
        while (set.next()) {
            part = set.getString(4);
        }
        set.close();
        return part;
    }

    public int getAnalysisId(String st) throws SQLException {
        int id;
        getAnalyseIdStmt.setString(1, st);
        ResultSet set = getAnalyseIdStmt.executeQuery();
        set.next();
        id = set.getInt(1);
        return id;
    }

    public void updateResult(int id, double particip, int orderId) throws SQLException {
        updateResultStmt.setDouble(1, particip);
        updateResultStmt.setInt(2, id);
        updateResultStmt.setInt(3, orderId);
        updateResultStmt.executeUpdate();
    }

    public DefaultTableModel showAnalysis(int id) throws SQLException {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Analysis ID");
        model.addColumn("Name");
        model.addColumn("Price");
        model.addColumn("Participation %");
        model.addColumn("Rest");
        findAnalyseByOrdStmt2.setInt(1, id);
        ResultSet set = findAnalyseByOrdStmt2.executeQuery();
        while (set.next()) {
            Double price = set.getDouble(9);
            Double partic = set.getDouble(10);
            Double rest = (price * partic) / 100;
            model.addRow(new Object[]{set.getInt(7), set.getString(8),
                set.getDouble(9), set.getDouble(10), rest});
            total += rest;
        }
        set.close();
        return model;
    }

    public String getDoctorFirst(int id) throws SQLException {
        String first;

        getDoctorFirstStmt.setInt(1, id);
        ResultSet set = getDoctorFirstStmt.executeQuery();
        set.next();
        first = set.getString(4);
        return first;

    }

    public String getDoctorLast(int id) throws SQLException {
        String last;

        getDoctorLastStmt.setInt(1, id);
        ResultSet set = getDoctorLastStmt.executeQuery();
        set.next();
        last = set.getString(4);
        return last;
    }
    
     public int getBillCount() throws SQLException{
        int count;
        
        ResultSet set = getBillCountStmt.executeQuery();
        set.next();
        count = set.getInt(1);
        return count;
    }
    
    public void insertFacture(Bill b) throws SQLException{
        insertFactureStmt.setInt(1, b.getId());
        insertFactureStmt.setString(2, b.getDate().toString());
        insertFactureStmt.setInt(3, b.getOrder().getId());
        insertFactureStmt.executeUpdate();
    }
    
    public double getTotal() {
        return total;
    }

    public static final BillController instance = new BillController();
}
