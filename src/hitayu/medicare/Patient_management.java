/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitayu.medicare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mahadav
 */
public class Patient_management extends javax.swing.JFrame {

    /**
     * Creates new form customer_management
     */
    public Patient_management() {
        initComponents();
         try {
        Class.forName("java.sql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
        Statement stmt = conn.createStatement();
        String combo_group = "Select DISTINCT region from region_list;";
        ResultSet rs = stmt.executeQuery(combo_group);
 
       while(rs.next())
        {
        jcomboregion.addItem(rs.getString(1));
        }
        
            } 
        catch (Exception e)
            {
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addcustomer = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jrbtable = new javax.swing.JRadioButton();
        jrbfield = new javax.swing.JRadioButton();
        jrbsearch = new javax.swing.JRadioButton();
        jrbregionwise = new javax.swing.JRadioButton();
        view = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jcustable = new javax.swing.JTable();
        gotobillings = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtfcusaddress = new javax.swing.JTextArea();
        jtfcusphone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfcusname = new javax.swing.JTextField();
        jtfid = new javax.swing.JTextField();
        jcomboregion = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Management");
        setMinimumSize(new java.awt.Dimension(910, 490));
        getContentPane().setLayout(null);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Region");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 242, 100, 20);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        addcustomer.setBackground(new java.awt.Color(97, 212, 195));
        addcustomer.setText("Add Patient");
        addcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcustomerActionPerformed(evt);
            }
        });
        jPanel1.add(addcustomer);
        addcustomer.setBounds(10, 290, 130, 23);

        update.setBackground(new java.awt.Color(97, 212, 195));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(150, 290, 80, 23);

        delete.setBackground(new java.awt.Color(97, 212, 195));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(240, 290, 70, 23);

        jrbtable.setBackground(new java.awt.Color(36, 47, 65));
        buttonGroup1.add(jrbtable);
        jrbtable.setForeground(new java.awt.Color(255, 255, 255));
        jrbtable.setText("View in Table");
        jPanel1.add(jrbtable);
        jrbtable.setBounds(50, 340, 120, 23);

        jrbfield.setBackground(new java.awt.Color(36, 47, 65));
        buttonGroup1.add(jrbfield);
        jrbfield.setForeground(new java.awt.Color(255, 255, 255));
        jrbfield.setText("View in Fields");
        jPanel1.add(jrbfield);
        jrbfield.setBounds(50, 370, 120, 23);

        jrbsearch.setBackground(new java.awt.Color(36, 47, 65));
        buttonGroup1.add(jrbsearch);
        jrbsearch.setForeground(new java.awt.Color(255, 255, 255));
        jrbsearch.setText("Search");
        jPanel1.add(jrbsearch);
        jrbsearch.setBounds(50, 400, 120, 23);

        jrbregionwise.setBackground(new java.awt.Color(36, 47, 65));
        buttonGroup1.add(jrbregionwise);
        jrbregionwise.setForeground(new java.awt.Color(255, 255, 255));
        jrbregionwise.setText("View Region Wise");
        jPanel1.add(jrbregionwise);
        jrbregionwise.setBounds(50, 430, 170, 23);

        view.setBackground(new java.awt.Color(97, 212, 195));
        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view);
        view.setBounds(200, 380, 80, 23);

        jcustable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Number", "Address", "Region"
            }
        ));
        jcustable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jcustable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(520, 20, 440, 402);

        gotobillings.setBackground(new java.awt.Color(97, 212, 195));
        gotobillings.setText("Go to Diagnosis");
        gotobillings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotobillingsActionPerformed(evt);
            }
        });
        jPanel1.add(gotobillings);
        gotobillings.setBounds(400, 290, 110, 23);

        back.setBackground(new java.awt.Color(97, 212, 195));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(320, 290, 70, 23);

        jtfcusaddress.setColumns(20);
        jtfcusaddress.setRows(5);
        jScrollPane2.setViewportView(jtfcusaddress);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(130, 136, 364, 90);
        jPanel1.add(jtfcusphone);
        jtfcusphone.setBounds(130, 100, 364, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:-");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 60, 240, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact Number:-");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 100, 150, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address:-");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 140, 190, 30);
        jPanel1.add(jtfcusname);
        jtfcusname.setBounds(130, 60, 364, 30);

        jtfid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfidFocusGained(evt);
            }
        });
        jPanel1.add(jtfid);
        jtfid.setBounds(130, 20, 50, 30);

        jcomboregion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboregionActionPerformed(evt);
            }
        });
        jPanel1.add(jcomboregion);
        jcomboregion.setBounds(130, 240, 110, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient ID:-");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 120, 24);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcomboregionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboregionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboregionActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
try {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            String id=jtfid.getText();
            String name=jtfcusname.getText();
            String phone=jtfcusphone.getText();
            String address=jtfcusaddress.getText();
            String region=jcomboregion.getSelectedItem().toString();
            
            String sql = "update customer_details set cus_name='"+name+"',cus_phone='"+phone+"',cus_address='"+address+"',cus_region='"+region+"'where cus_id='"+id+"';";
            stmt.executeUpdate(sql);
            
            
            JOptionPane.showMessageDialog(this,"customer details updated  Sucessfully...");
            
            DefaultTableModel model=(DefaultTableModel)jcustable.getModel();

                     String sqlview="select * from customer_details;";

                     ResultSet rs=stmt.executeQuery(sqlview);

                int rows=model.getRowCount();
                if(rows>0)
                    {
                        for (int i=0;i<rows;i++)
                        {
                            model.removeRow(0);
                        }
                    }
                    while(rs.next())
                    {
                        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                    }
            
            } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());  
        }        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
 try
        {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            String id=jtfid.getText();
            
            String sqldelete = "delete from customer_details where cus_id='"+id+"';";
            stmt.executeUpdate(sqldelete);
            
            JOptionPane.showMessageDialog(this, "customer detail deleted..!");
            jtfid.setText(null);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    //new mahadev_menu_page().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        if(jrbtable.isSelected())
        {
            try{
                    DefaultTableModel model=(DefaultTableModel)jcustable.getModel();

                    Class.forName("java.sql.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
                    Statement stmt=conn.createStatement();

                     String sql="select * from customer_details;";

                     ResultSet rs=stmt.executeQuery(sql);

                int rows=model.getRowCount();
                if(rows>0)
                    {
                        for (int i=0;i<rows;i++)
                        {
                            model.removeRow(0);
                        }
                    }
                    while(rs.next())
                    {
                        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                    }

                }    
                catch(Exception e)
                {
                        JOptionPane.showMessageDialog(this, "Database Connection Error.....!"); 
                }

                    }
        if (jrbfield.isSelected())
        {
                     try {
                    Class.forName("java.sql.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
                    Statement stmt=conn.createStatement();
                    int id=Integer.parseInt(jtfid.getText());
                    String sql="select * from customer_details WHERE cus_id='"+id+"';";
                    ResultSet rs1=stmt.executeQuery(sql);

                     if(rs1.next())
                     {
                     jtfid.setText(rs1.getString("CUS_ID"));
                     jtfcusname.setText(rs1.getString("CUS_NAME"));
                     jtfcusphone.setText(rs1.getString("CUS_PHONE"));
                     jtfcusaddress.setText(rs1.getString("CUS_ADDRESS"));
                     jcomboregion.setSelectedItem(rs1.getString("CUS_REGION"));
                     }
                        }
                        catch (Exception e)
                        {
                            JOptionPane.showMessageDialog(this, e.getMessage());
                        }
                    }
        if (jrbsearch.isSelected())
        {
            try {
                        DefaultTableModel model=(DefaultTableModel)jcustable.getModel();
                        Class.forName("java.sql.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
                        Statement stmt = conn.createStatement();
                        String name = (jtfcusname.getText());
                        String sql = "SELECT * FROM customer_details where cus_name like '%"+name+"%';";

                        ResultSet rs = stmt.executeQuery(sql);

                        int rows=model.getRowCount();
                    if(rows>=0)
                    {
                        for (int i=0;i<rows;i++)
                        {
                            model.removeRow(0);
                        }

                            while(rs.next())
                            {
                                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                            }

                    }
          }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }       
        }
        if (jrbregionwise.isSelected())
        {
            
                        try 
                        {
                        DefaultTableModel model=(DefaultTableModel)jcustable.getModel();
                        Class.forName("java.sql.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
                        Statement stmt = conn.createStatement();
                        String region = jcomboregion.getSelectedItem().toString();
                        String sql = "SELECT * FROM customer_details where cus_region='"+region+"';"; 

                        ResultSet rs = stmt.executeQuery(sql);

                        int rows=model.getRowCount();
                        if(rows>0)
                        {
                            for (int i=0;i<rows;i++)
                            {
                                model.removeRow(0);
                            }
                        }  
                            while(rs.next())
                            {
                                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                            }

                        }                      
                        catch (Exception e)
                        {
                            JOptionPane.showMessageDialog(this, e.getMessage());
                        }
           }
               
    }//GEN-LAST:event_viewActionPerformed

    private void addcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcustomerActionPerformed
        try 
        {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            int id=Integer.parseInt(jtfid.getText());
            int id2=id+1;
            String name=jtfcusname.getText();
            String phone=jtfcusphone.getText();
            String address=jtfcusaddress.getText();
            String region=jcomboregion.getSelectedItem().toString();
            
            String sqlinsert = "insert into customer_details values('"+id+"','"+name+"','"+phone+"','"+address+"','"+region+"');";
            stmt.executeUpdate(sqlinsert);
            
            jtfcusaddress.setText(null);
            jtfcusname.setText(null);
            jtfcusphone.setText(null);
            jtfcusname.setText(null);
            jtfid.setText(""+id2);
            JOptionPane.showMessageDialog(this, "Customer added succesfully");
        }
        catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_addcustomerActionPerformed

    private void gotobillingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotobillingsActionPerformed
    //  new bills().setVisible(true);
        dispose();
    }//GEN-LAST:event_gotobillingsActionPerformed

    private void jtfidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfidFocusGained
        try 
        {
          Class.forName("java.sql.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
          Statement stmt = conn.createStatement();
            
         
         
         String sqlinvoiceid="select ifnull(max(invoice_id),'0') from bills_wholesale;";
         ResultSet rs=stmt.executeQuery(sqlinvoiceid);
         if(rs.next()){
         String invoiceid=rs.getString("ifnull(max(invoice_id),'0')");
         int maxinvoiceid=Integer.parseInt(invoiceid);
         int newinvoiceid=maxinvoiceid+1;
         jtfid.setText(""+newinvoiceid);
         }
         
        } 
        catch (Exception e)
        {
           JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jtfidFocusGained

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
            java.util.logging.Logger.getLogger(Patient_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcustomer;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JButton gotobillings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcomboregion;
    private javax.swing.JTable jcustable;
    private javax.swing.JRadioButton jrbfield;
    private javax.swing.JRadioButton jrbregionwise;
    private javax.swing.JRadioButton jrbsearch;
    private javax.swing.JRadioButton jrbtable;
    private javax.swing.JTextArea jtfcusaddress;
    private javax.swing.JTextField jtfcusname;
    private javax.swing.JTextField jtfcusphone;
    private javax.swing.JTextField jtfid;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
