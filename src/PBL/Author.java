/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package PBL;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shubham
 */
public class Author extends javax.swing.JFrame {

    /**
     * Creates new form Author
     */
    public Author() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("Author");

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 3, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Author");

        jLabel3.setText("First Name:");

        jLabel2.setText("Author No*.");

        jLabel4.setText("Last Name:");

        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton2.setLabel("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("VIEW");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Author No.", "First Name", "Last Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(jTextField4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(jTextField1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(jTextField2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection c;
        Statement stmt;

        try
        {
            /*Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Shubham","postgres","root");
            if(con!=null)
            {
                System.out.println("Connected");
            }*/

            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PBL",
                "postgres", "root");
            c.setAutoCommit(false);
           // System.out.println("Opened database successfully");

            Integer author_number=Integer.parseInt(jTextField1.getText());
            String author_first=jTextField2.getText();
            String author_last = jTextField4.getText();
            //System.out.println("Display:"+ branch_number);

            stmt = c.createStatement();
            String sql = "INSERT INTO AUTHOR VALUES ('"+(author_number)+"', '"+(author_last)+"', '"+(author_first)+"');";
            if(jTextField1.getText().isEmpty()==true||jTextField2.getText().isEmpty()==true||jTextField4.getText().isEmpty()==true)
         {
                JOptionPane.showMessageDialog(this,"One or more fields are Empty Cannot Insert Data");
         }
         else
         {
             int rowsEffected=stmt.executeUpdate(sql);
             if(rowsEffected!=0)
                JOptionPane.showMessageDialog(this,"Data Inserted Succefully");
            //System.out.println("Hi:");
            stmt.close();
         }
            c.commit();
            c.close();

            /*

            String sql =" insert into branch values(10,'aa','uu',6)";
            //String sql="  insert into branch values('branch_number','branch_name','branch_location','6')";
            st.execute(sql);
            //con.close();*/
        }
        catch(ClassNotFoundException | SQLException | NumberFormatException | HeadlessException e)
        {
            String msg=e.getMessage();
            if(msg.contains("unique")==true)
            {
            JOptionPane.showMessageDialog(this,"Author no. "+jTextField1.getText()+" already exists! Cannot Insert Data");
            }
            else if(msg.contains("input")==true)
            {
                JOptionPane.showMessageDialog(this,"Integer expected at Author No.");
            }
            else
            {
                JOptionPane.showMessageDialog(this,msg);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection c;
        Statement stmt;

        try
        {
            /*Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Shubham","postgres","root");
            if(con!=null)
            {
                System.out.println("Connected");
            }*/

            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PBL",
                "postgres", "root");
            c.setAutoCommit(false);
         //   System.out.println("Opened database successfully");

            Integer author_number=Integer.parseInt(jTextField1.getText());
            String author_first=jTextField2.getText();
            String author_last = jTextField4.getText();
            //System.out.println("Display:"+ branch_number);

            stmt = c.createStatement();
            if(jTextField1.getText().isEmpty()==true||jTextField2.getText().isEmpty()==true||jTextField4.getText().isEmpty()==true)
                {
                    JOptionPane.showMessageDialog(this,"One or more fields are Empty Cannot Update Data");
                }
                else
                {
            String sql = "UPDATE AUTHOR SET author_last='"+(author_last)+"', author_first='"+(author_first)+"'WHERE author_number='"+(author_number)+"';";
             int rowsEffected=stmt.executeUpdate(sql);
             if(rowsEffected==0)
                JOptionPane.showMessageDialog(this,"Record does not exist");
             else
                JOptionPane.showMessageDialog(this,"Record Updated");
            //System.out.println("Hi:");
            stmt.close();
                }
            c.commit();
            c.close();

            /*

            String sql =" insert into branch values(10,'aa','uu',6)";
            //String sql="  insert into branch values('branch_number','branch_name','branch_location','6')";
            st.execute(sql);
            //con.close();*/
        }
        catch(ClassNotFoundException | SQLException | NumberFormatException | HeadlessException e)
        {
            String msg=e.getMessage();
            /*if(msg.contains("unique")==true)
            {
            JOptionPane.showMessageDialog(this,"Branch no. "+jTextField1.getText()+" already exists! Cannot Insert Data");
            }
            else*/if(msg.contains("input")==true)
            {
                JOptionPane.showMessageDialog(this,"Integer expected at Author no.");
            }
            else
            {
                JOptionPane.showMessageDialog(this,msg);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        int row=model.getRowCount();
        if(row>0)
        {
             for(int i=0;i<row;i++)
            {
                 model.removeRow(0);
            }
        }
        String query="SELECT * from author";
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/PBL",
            "postgres", "root");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String author_number=rs.getString("author_number");
                String author_first=rs.getString("author_first");
                String author_last=rs.getString("author_last");
               //System.out.println(author_no+ "|" + author_first + "|"+ author_last);
                model.addRow(new Object[]{author_number,author_first,author_last});
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Connection c;
        Statement stmt;

        try
        {
            /*Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Shubham","postgres","root");
            if(con!=null)
            {
                System.out.println("Connected");
            }*/

            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PBL",
                "postgres", "root");
            c.setAutoCommit(false);
            //System.out.println("Opened database successfully");

            Integer author_number=Integer.parseInt(jTextField1.getText());
            //String author_first=jTextField2.getText();
            //String author_last = jTextField4.getText();
            //System.out.println("Display:"+ branch_number);

            stmt = c.createStatement();
            String sql = "DELETE FROM AUTHOR WHERE author_no='"+(author_number)+"';";
             int rowsEffected=stmt.executeUpdate(sql);
             if(rowsEffected==0)
                JOptionPane.showMessageDialog(this,"Record does not exist");
             else
                JOptionPane.showMessageDialog(this,"Record Deleted");
            //System.out.println("Hi:");
            stmt.close();
            c.commit();
            c.close();

            /*

            String sql =" insert into branch values(10,'aa','uu',6)";
            //String sql="  insert into branch values('branch_number','branch_name','branch_location','6')";
            st.execute(sql);
            //con.close();*/
        }
        catch(ClassNotFoundException | SQLException | NumberFormatException | HeadlessException e)
        {
            String msg=e.getMessage();
            if(msg.contains("foreign")==true)
            {
                JOptionPane.showMessageDialog(this,"This Table is linked with Wrote Table Cannot Delete data");
            }
            else if(msg.contains("input")==true)
            {
                JOptionPane.showMessageDialog(this,"One or more fields are Empty Cannot Delete Data");
            }
            else
            {
                JOptionPane.showMessageDialog(this,msg);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Author.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Author().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
