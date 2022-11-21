/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.SalesInvc.View;

import com.SalesInvc.Controller.InvoiceController;
import com.SalesInvc.Model.InvoiceClass;
import com.SalesInvc.Model.TableModelForDisplayInvoices;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author gt
 */
public class FrameforSalesInvoice extends javax.swing.JFrame {

    /**
     * Creates new form FrameforSalesInvoice
     */
    public FrameforSalesInvoice() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableOfInvoice = new javax.swing.JTable();
        TableOfInvoice.getSelectionModel().addListSelectionListener(InvcContrl);

        NewInvoiceCreation = new javax.swing.JButton();
        NewInvoiceCreation.addActionListener(InvcContrl);
        InvoiceDeletion = new javax.swing.JButton();
        InvoiceDeletion.addActionListener(InvcContrl);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InvoiceLabelNum = new javax.swing.JLabel();
        InvoiceLabelDate = new javax.swing.JLabel();
        InvoiceLabelCustName = new javax.swing.JLabel();
        SumTotalInvoice = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableOfItemsPerInvoice = new javax.swing.JTable();
        ItemCreation = new javax.swing.JButton();
        ItemCreation.addActionListener(InvcContrl);
        ItemDeletion = new javax.swing.JButton();
        ItemDeletion.addActionListener(InvcContrl);
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemLoadFile = new javax.swing.JMenuItem();
        MenuItemLoadFile.addActionListener(InvcContrl);
        MenuItemSaveFile = new javax.swing.JMenuItem();
        MenuItemSaveFile.addActionListener(InvcContrl);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableOfInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Num Of Invoice", "Date of Invoice", "Customer Owner of invoice", "Total Sum"
            }
        ));
        jScrollPane1.setViewportView(TableOfInvoice);

        NewInvoiceCreation.setText("Create New Invoice");
        NewInvoiceCreation.setToolTipText("");
        NewInvoiceCreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewInvoiceCreationActionPerformed(evt);
            }
        });

        InvoiceDeletion.setText("Delete Invoice");
        InvoiceDeletion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceDeletionActionPerformed(evt);
            }
        });

        jLabel1.setText("Num of Invc");

        jLabel2.setText("Date of Invc");

        jLabel3.setText("Name of Customer");

        jLabel4.setText("Total sum of Invoice");

        InvoiceLabelNum.setToolTipText("");

        InvoiceLabelDate.setToolTipText("");

        InvoiceLabelCustName.setToolTipText("");

        SumTotalInvoice.setToolTipText("");

        TableOfItemsPerInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NameOfItem", "PriceofOneItem", "NumberOfItems", "PriceOfAllItems"
            }
        ));
        jScrollPane2.setViewportView(TableOfItemsPerInvoice);

        ItemCreation.setText("Create Item");
        ItemCreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCreationActionPerformed(evt);
            }
        });

        ItemDeletion.setText("Delete Item");
        ItemDeletion.setToolTipText("");

        jLabel5.setText("Invoices Items");
        jLabel5.setToolTipText("");

        jLabel6.setText("Invoices Table");
        jLabel6.setToolTipText("");

        jMenu1.setText("File");

        MenuItemLoadFile.setText("Load File");
        MenuItemLoadFile.setToolTipText("");
        jMenu1.add(MenuItemLoadFile);

        MenuItemSaveFile.setText("Save File");
        MenuItemSaveFile.setToolTipText("");
        jMenu1.add(MenuItemSaveFile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(NewInvoiceCreation)
                        .addGap(101, 101, 101)
                        .addComponent(InvoiceDeletion))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SumTotalInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InvoiceLabelCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvoiceLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvoiceLabelNum, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ItemCreation)
                .addGap(104, 104, 104)
                .addComponent(ItemDeletion)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6))
                    .addComponent(InvoiceLabelNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InvoiceLabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InvoiceLabelCustName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SumTotalInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NewInvoiceCreation)
                        .addComponent(InvoiceDeletion))
                    .addComponent(ItemDeletion)
                    .addComponent(ItemCreation))
                .addContainerGap(460, Short.MAX_VALUE))
        );

        ItemCreation.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewInvoiceCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewInvoiceCreationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewInvoiceCreationActionPerformed

    private void ItemCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCreationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemCreationActionPerformed

    private void InvoiceDeletionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceDeletionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvoiceDeletionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameforSalesInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameforSalesInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameforSalesInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameforSalesInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameforSalesInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InvoiceDeletion;
    private javax.swing.JLabel InvoiceLabelCustName;
    private javax.swing.JLabel InvoiceLabelDate;
    private javax.swing.JLabel InvoiceLabelNum;
    private javax.swing.JButton ItemCreation;
    private javax.swing.JButton ItemDeletion;
    private javax.swing.JMenuItem MenuItemLoadFile;
    private javax.swing.JMenuItem MenuItemSaveFile;
    private javax.swing.JButton NewInvoiceCreation;
    private javax.swing.JLabel SumTotalInvoice;
    private javax.swing.JTable TableOfInvoice;
    private javax.swing.JTable TableOfItemsPerInvoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
 private ArrayList<InvoiceClass> invoices;
 private InvoiceController InvcContrl = new InvoiceController(this);
 private TableModelForDisplayInvoices tablemodelfordisplayinvoices;

    public TableModelForDisplayInvoices getTablemodelfordisplayinvoices() {
        if (tablemodelfordisplayinvoices == null) {
            tablemodelfordisplayinvoices = new TableModelForDisplayInvoices(getInvoices());
        }
        return tablemodelfordisplayinvoices;
    }

    public void setTablemodelfordisplayinvoices(TableModelForDisplayInvoices tablemodelfordisplayinvoices) {
        this.tablemodelfordisplayinvoices = tablemodelfordisplayinvoices;
    }

    public ArrayList<InvoiceClass> getInvoices() {
        if (invoices == null) invoices = new ArrayList<>();
        return invoices;
    }

    public void setInvoices(ArrayList<InvoiceClass> invoices) {
        this.invoices = invoices;
    }

    public javax.swing.JTable getTableOfInvoice() {
        return TableOfInvoice;
    }

    public JLabel getInvoiceLabelCustName() {
        return InvoiceLabelCustName;
    }

    public JLabel getInvoiceLabelDate() {
        return InvoiceLabelDate;
    }

    public JLabel getInvoiceLabelNum() {
        return InvoiceLabelNum;
    }

    public JLabel getSumTotalInvoice() {
        return SumTotalInvoice;
    }

    public JTable getTableOfItemsPerInvoice() {
        return TableOfItemsPerInvoice;
    }

    public InvoiceController getInvcContrl() {
        return InvcContrl;
    }
    
    public int newInvoiceNum()
    {
        int numOfInvoice =0;
        
        for (InvoiceClass invoiceclass : getInvoices())
        {
            if(invoiceclass.getNum()> numOfInvoice)
            {
                numOfInvoice = invoiceclass.getNum(); 
            }
        }
        
        return ++numOfInvoice;
    }
 
 
}
