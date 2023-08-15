
package java_mysqlconn;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.sql.*;


import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
public class mysqldesign extends javax.swing.JFrame {

    public JFrame frame;
    
    
  private static final String username="root";
   private static final String password="";
    private static final String dataConn="jdbc:mysql://localhost:3306/connector";
            
            Connection sqlconn =null;
            PreparedStatement pst=null;
            ResultSet rs =null;
            
            int g,i,id,deleteitem;
            
            
    public mysqldesign() {
        initComponents();
    }

    
    
    //--------------------------//
    public void upDateDB()
    {
        try{
   Class.forName("com.mysql.cj.jdbc.Driver");
   sqlconn=DriverManager.getConnection(dataConn,username,password);
  
            
   pst =sqlconn.prepareStatement("select * from conector");
   rs= pst.executeQuery();
   
            ResultSetMetaData stData =rs.getMetaData();
            g=stData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
            RecordTable.setRowCount(0);
                    
                 
                    
                
                   
                   while(rs.next()){
                       Vector columnData = new Vector();
                
                       for(i=1;i<=g;i++)
                       {
                         

                          columnData.add(rs.getString("StudentID "));  
                          columnData.add(rs.getString("Firstname"));
                            columnData.add(rs.getString("Surname"));
                            columnData.add(rs.getString("Address")); 
                            columnData.add(rs.getString("Postcode"));
                          
                            columnData.add(rs.getString("Telephone"));
                         
                       }
                       RecordTable.addRow(columnData);
                   }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtxtfirstname = new javax.swing.JLabel();
        stud = new javax.swing.JTextField();
        jtxtstudentid = new javax.swing.JLabel();
        jtxtaddress = new javax.swing.JLabel();
        jtxtsurname = new javax.swing.JLabel();
        jtxtphone = new javax.swing.JLabel();
        jtxtpostcode = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        post = new javax.swing.JTextField();
        addres = new javax.swing.JTextField();
        sur = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jbtnadd = new javax.swing.JButton();
        jbtnupdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jbtnreset = new javax.swing.JButton();
        jbtndelete = new javax.swing.JButton();
        jbtnexit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 8));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 8));

        jtxtfirstname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtfirstname.setText("Firstname");

        stud.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studActionPerformed(evt);
            }
        });

        jtxtstudentid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtstudentid.setText("Student ID");

        jtxtaddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtaddress.setText("Address");

        jtxtsurname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtsurname.setText("Surname");

        jtxtphone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtphone.setText("Telephone");

        jtxtpostcode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtpostcode.setText("post Code");

        phone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        post.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postActionPerformed(evt);
            }
        });

        addres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresActionPerformed(evt);
            }
        });

        sur.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jTable2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable2.setForeground(new java.awt.Color(0, 51, 51));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "StudentID", "Firstname", "Surname", "Address", "Postcode", "Telephone"
            }
        ));
        jTable2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable2ComponentAdded(evt);
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtpostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addres, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sur, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(stud, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(stud)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtfirstname)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sur)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtxtsurname)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtxtaddress)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(addres, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtxtpostcode)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtphone)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 8));

        jbtnadd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnadd.setText("Add new ");
        jbtnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnaddActionPerformed(evt);
            }
        });

        jbtnupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnupdate.setText("Upadte ");
        jbtnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnupdateActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jbtnreset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnreset.setText(" Reset");
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });

        jbtndelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtndelete.setText("Delete");
        jbtndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeleteActionPerformed(evt);
            }
        });

        jbtnexit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnexit.setText("Exit");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbtnreset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnadd, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jbtnadd)
                .addGap(18, 18, 18)
                .addComponent(jbtnupdate)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addGap(28, 28, 28)
                .addComponent(jbtnreset)
                .addGap(18, 18, 18)
                .addComponent(jbtndelete)
                .addGap(30, 30, 30)
                .addComponent(jbtnexit)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("MYSQL Connection");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void surActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surActionPerformed

    private void addresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresActionPerformed

    private void postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void studActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studActionPerformed

    private void jbtnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnaddActionPerformed

try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
             
 sqlconn=DriverManager.getConnection(dataConn,username,password);
  pst=sqlconn.prepareStatement("INSERT INTO `connector`(`StudentID`, `Firstname`, `Surname`, `Address`, `Postcode`, `Telephone`) VALUES(?,?,?,?,?,?,)");
            
            pst.setString(1, stud.getText());
            pst.setString(2, name.getText());
            pst.setString(3, sur.getText());
            pst.setString(4, addres.getText());
            pst.setString(5, post.getText());
            pst.setString(6, phone.getText());
                                        
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added");
            upDateDB();   
        }
     catch(SQLException ex){
   java.util.logging.Logger.getLogger(java_mysqlconn.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
                        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mysqldesign.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtnaddActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
        
        stud.setText("");
        name.setText("");
        sur.setText("");
       addres.setText("");
        post.setText("");
        phone.setText("");
        
        
        
        
    }//GEN-LAST:event_jbtnresetActionPerformed

    private void jbtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtndeleteActionPerformed

    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
       frame = new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit","MYSQL connector",
               JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_OPTION){
           System.exit(0);
           
       }
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnupdateActionPerformed
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            sqlconn=DriverManager.getConnection(dataConn,username,password);
            pst=sqlconn.prepareStatement("update connector set StudentID=?, Firstname=?"
                + ",Surname=?,Address=?,Postcode=?,Telephone=?,where ID=?");

            pst.setString(1, stud.getText());
            pst.setString(2, name.getText());
            pst.setString(3, sur.getText());
            pst.setString(4, addres.getText());
            pst.setString(5, post.getText());
            pst.setString(6, phone.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record updated");
            upDateDB();
        }
        catch(SQLException ex){
            java.util.logging.Logger.getLogger(java_mysqlconn.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mysqldesign.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtnupdateActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        DefaultTableModel  RecordTable = (DefaultTableModel)jTable2.getModel();
        int SelectedRows = jTable2.getSelectedRow();

        stud.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        name.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        sur.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        addres.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        post.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
        phone.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable2ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2ComponentAdded

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
            java.util.logging.Logger.getLogger(mysqldesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mysqldesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mysqldesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mysqldesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mysqldesign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addres;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtnadd;
    private javax.swing.JButton jbtndelete;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JButton jbtnupdate;
    private javax.swing.JLabel jtxtaddress;
    private javax.swing.JLabel jtxtfirstname;
    private javax.swing.JLabel jtxtphone;
    private javax.swing.JLabel jtxtpostcode;
    private javax.swing.JLabel jtxtstudentid;
    private javax.swing.JLabel jtxtsurname;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField post;
    private javax.swing.JTextField stud;
    private javax.swing.JTextField sur;
    // End of variables declaration//GEN-END:variables

   
}
