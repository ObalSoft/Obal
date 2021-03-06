/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Controllers.AnalyseController;
import Controllers.ClientController;
import Controllers.OrderController;
import Entities.Analysis;
import Entities.Client;
import Entities.Order;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import utilities.AnalysisTableModel;
import utilities.ClientsTableModel;
import utilities.GuiListModels;
import utilities.OrdersTabelModel;
import utilities.ResultsTableModel;

/**
 *
 * @author User
 */

public class ResultsPane extends javax.swing.JPanel {

    /**
     * Creates new form ResultsPane
     */
    private final ClientsTableModel clientModel = new ClientsTableModel();
    private final OrdersTabelModel orderModel = new OrdersTabelModel();
    private final ResultsTableModel analysisModel = new ResultsTableModel();
    private final GuiListModels<Order> searchModel = new GuiListModels();
    private Order o;
    
    
    public ResultsPane() {
        initComponents();
        
        listOrder.setModel(searchModel);
       
            clientsTable.setModel(clientModel);
        clientsTable.getColumnModel().getColumn(0).setMinWidth(256);
        clientsTable.getColumnModel().getColumn(0).setMaxWidth(256);
        clientsTable.getColumnModel().getColumn(1).setMinWidth(128);
        clientsTable.getColumnModel().getColumn(1).setMaxWidth(128);
//        ordersTable.getColumnModel().getColumn(0).setMinWidth(256);
//        ordersTable.getColumnModel().getColumn(0).setMaxWidth(256);
//        ordersTable.getColumnModel().getColumn(1).setMinWidth(128);
//     1   ordersTable.getColumnModel().getColumn(1).setMaxWidth(128);
         analysisTable.setModel(analysisModel);
        analysisTable.getColumnModel().getColumn(0).setMinWidth(256);
        analysisTable.getColumnModel().getColumn(0).setMaxWidth(256);
        analysisTable.getColumnModel().getColumn(1).setMinWidth(128);
        analysisTable.getColumnModel().getColumn(1).setMaxWidth(128);
       jScrollPane1.getViewport().setBackground(new Color(250, 251, 252));
         jScrollPane3.getViewport().setBackground(new Color(250, 251, 252));
//        ordersTable.setModel(orderModel);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientsTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        analysisTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        listOrder = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        selectBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        firstNameField.setBackground(new java.awt.Color(250, 251, 252));
        firstNameField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        firstNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        clientsTable.setBackground(new java.awt.Color(250, 251, 252));
        clientsTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));
        clientsTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        clientsTable.setForeground(new java.awt.Color(22, 113, 185));
        clientsTable.setGridColor(new java.awt.Color(255, 255, 255));
        clientsTable.setRowHeight(40);
        clientsTable.setRowMargin(3);
        jScrollPane1.setViewportView(clientsTable);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(22, 113, 185));
        jButton1.setText("Search");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(22, 113, 185));
        jLabel3.setText("Client Name");

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(22, 113, 185));
        jButton3.setText("Save Results");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(22, 113, 185)));

        analysisTable.setBackground(new java.awt.Color(250, 251, 252));
        analysisTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));
        analysisTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        analysisTable.setForeground(new java.awt.Color(22, 113, 185));
        analysisTable.setGridColor(new java.awt.Color(255, 255, 255));
        analysisTable.setRowHeight(40);
        analysisTable.setRowMargin(3);
        jScrollPane3.setViewportView(analysisTable);

        jScrollPane4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));
        jScrollPane4.setMinimumSize(new java.awt.Dimension(258, 130));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(258, 352));

        listOrder.setBackground(new java.awt.Color(250, 251, 252));
        listOrder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listOrder.setForeground(new java.awt.Color(22, 113, 185));
        listOrder.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listOrderMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(listOrder);

        jSeparator1.setForeground(new java.awt.Color(22, 113, 185));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        selectBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectBtn.setForeground(new java.awt.Color(22, 113, 185));
        selectBtn.setText("Select Client");
        selectBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(22, 113, 185));
        jLabel4.setText("Client's Orders");

        clear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(22, 113, 185));
        clear.setText("Clear");
        clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 113, 185), 1, true));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(selectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(selectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String firstName = firstNameField.getText();
        clientModel.removeAll();
        new SearchClientPerformed(firstName).execute();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       Analysis a = analysisModel.get(analysisTable.getSelectedRow());
       new AddResultWorker(o,a).execute();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        // TODO add your handling code here:
        Client client=clientModel.get(clientsTable.getSelectedRow());
        new SearchOrdersWorker(client).execute();
    }//GEN-LAST:event_selectBtnActionPerformed

    private void listOrderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listOrderMousePressed
        // TODO add your handling code here:
        o = (Order) listOrder.getSelectedValue();
        o.listAnalysis = new ArrayList();
        new GetAnalysisWorker(o).execute();
    }//GEN-LAST:event_listOrderMousePressed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        firstNameField.setEnabled(true);
        firstNameField.setText("");
        clientModel.removeAll();
        searchModel.removeAll();
        analysisModel.removeAll();
    }//GEN-LAST:event_clearActionPerformed

    
    public void listClicked(Order order){
        clearActionPerformed(null);
        o=order;
        firstNameField.setText(order.getClient().getFirstName()+" "+order.getClient().getLastName());
        firstNameField.setEnabled(false);
        listOrder.removeAll();
        new SearchOrdersWorker(order.getClient()).execute();
        analysisModel.removeAll();
    }
private class SearchClientPerformed extends SwingWorker<List<Client>, Void> {

        private final String fName;

        public SearchClientPerformed(String firstName) {
            this.fName = firstName;
        }

        @Override
        protected List<Client> doInBackground() throws Exception {
            return ClientController.instance.findByLike(fName);
        }

        @Override
        public void done() {
            //Table tab = new Table();
            try {
                clientModel.set(get());
                clientsTable.setModel(clientModel);
                repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(OrderFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(OrderFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
private class SearchOrdersWorker extends SwingWorker<List<Order>, Void> {
    
    Client client;
    public SearchOrdersWorker(Client client){
        this.client = client;
    }

        @Override
        protected List<Order> doInBackground() throws Exception {
            return OrderController.instance.findByClient(client);
            
            
        }
        public void done() {
        try {
            System.out.println(get());
        } catch (InterruptedException ex) {
            Logger.getLogger(ResultsPane.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(ResultsPane.class.getName()).log(Level.SEVERE, null, ex);
        }
            try {
            if(get().isEmpty()){
                 JOptionPane.showMessageDialog(ResultsPane.this,
                            " This client has no Available orders ",
                            "NO ORDERS",
                            JOptionPane.ERROR_MESSAGE);
                 return;
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ResultsPane.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(ResultsPane.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            searchModel.removeAll();
            try {
                searchModel.set(get());
            } catch (InterruptedException | ExecutionException ex) {
                Logger.getLogger(ResultsPane.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
private class GetAnalysisWorker extends SwingWorker<Order, Void> {
    Order o;
    public GetAnalysisWorker(Order o){
        this.o = o;
    }

        @Override
        protected Order doInBackground() throws Exception {
         return AnalyseController.instance.findByOrder(o);   
        }
        public void done() {
            analysisModel.removeAll();
            try {
                o = get();
                analysisModel.set(o.listAnalysis);
            } catch (ExecutionException ex) {
                Logger.getLogger(ResultsPane.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
            Logger.getLogger(ResultsPane.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
    
}
private class AddResultWorker extends SwingWorker<String, Void> {
    
    Order o;
    Analysis a;
    public AddResultWorker(Order o , Analysis a){
        this.o = o;
        this.a = a;
    }

        @Override
        protected String doInBackground() throws Exception {
            try {
               // System.out.println(client);
                AnalyseController.instance.addResult(o);
            } catch (SQLException ex) {
                System.out.println("error of controller output ");
                return ex.getMessage();
            }
            return null;
        }

        @Override
        public void done() {
            try {
                if (get() == null) {
                    JOptionPane.showMessageDialog(ResultsPane.this,
                            " has been added successfully",
                            "Successful adding",
                            JOptionPane.INFORMATION_MESSAGE);
                   
                } else {
                    JOptionPane.showMessageDialog(ResultsPane.this,
                            " has errors",
                            "entry error",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(editClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(editClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable analysisTable;
    private javax.swing.JButton clear;
    private javax.swing.JTable clientsTable;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList listOrder;
    private javax.swing.JButton selectBtn;
    // End of variables declaration//GEN-END:variables
}
