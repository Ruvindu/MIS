
package mis;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

   //public Home home_form;
   public DBconnection dbconnection;
     
    public Login() {
        
        initComponents();
   
        
        /* Check database connection */
        
        dbconnection = new DBconnection();
        
        if(dbconnection.connect() == null){
            dynamic_1.removeAll();
            dynamic_1.repaint();
            dynamic_1.revalidate();

            dynamic_1.add(con_error);
            dynamic_1.repaint();
            dynamic_1.revalidate();
        
        }
        else{
            dynamic_1.removeAll();
            dynamic_1.repaint();
            dynamic_1.revalidate();

            dynamic_1.add(sign);
            dynamic_1.repaint();
            dynamic_1.revalidate();
        }
         
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dynamic_1 = new javax.swing.JPanel();
        sign = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        user_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        signin = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        con_error = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Managent Information Sytem");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        dynamic_1.setBackground(new java.awt.Color(255, 255, 255));
        dynamic_1.setLayout(new java.awt.CardLayout());

        sign.setBackground(new java.awt.Color(255, 255, 255));
        sign.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel3.setText("Management Information System");
        sign.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 23, -1, 41));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("University Of Ruhuna");
        sign.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 93, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Faculty Of Technology");
        sign.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 66, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N
        sign.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 23, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeL1.png"))); // NOI18N
        sign.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 400, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Sign in");
        sign.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 168, 341, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("User ID");
        sign.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 348, -1, -1));
        sign.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 345, 250, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Password");
        sign.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 383, -1, -1));
        sign.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 380, 250, -1));

        signin.setText("Sign in");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        sign.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 436, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Forgetten your password...?");
        sign.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 436, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        sign.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 140, 140));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR1.png"))); // NOI18N
        sign.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 110, 370));

        dynamic_1.add(sign, "card2");

        con_error.setBackground(new java.awt.Color(255, 255, 255));
        con_error.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel23.setText("Management Information System");
        con_error.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 23, -1, 41));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("University Of Ruhuna");
        con_error.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 93, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Faculty Of Technology");
        con_error.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 66, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ruhuna copy.png"))); // NOI18N
        con_error.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 23, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeL1.png"))); // NOI18N
        con_error.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 400, -1));

        jLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Database connection error !");
        con_error.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 168, 341, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/themeR1.png"))); // NOI18N
        con_error.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 110, 370));

        jButton2.setText("Try again!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        con_error.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/db_er.gif"))); // NOI18N
        con_error.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 320, 230));

        dynamic_1.add(con_error, "card2");

        getContentPane().add(dynamic_1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        
        String ui = user_name.getText();
        String p = pwd.getText();
        
        Encrypt enc = new Encrypt();
        String enc_pwd = enc.MD5(p.getBytes(), "md5");
        
        if("".equals(ui)){
            
             JOptionPane.showMessageDialog(null, "User ID not entered.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(p)){
            
            JOptionPane.showMessageDialog(null, "Password not entered.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            Connection con = null;
            
            try {  
                
                /*DBconnection conn = new DBconnection();
                Connection c = conn.connect();  m*/
                
                con=dbconnection.connect();
                
                String logQ = "SELECT * FROM user WHERE user_id='" + ui + "' and password='" + enc_pwd + "' LIMIT 1";
                
                PreparedStatement qstate = (PreparedStatement) con.prepareStatement(logQ);
                
                ResultSet res = qstate.executeQuery();
               
                /*initialize user*/
                String id;
                String post;
                
                if(res.next()){
                   
                    id=res.getString("user_id");
                    post=res.getString("post");
                    
                    if(post.equals("admin") || post.equals("teo") ){
                        
                        Home home_form = new Home(id,post);
                        home_form.setVisible(true);
                        this.setVisible(false);
                        
                    }else if(post.equals("stu")){
                           Students st=new Students();
                           st.setst_id(id);
                           st.stu(id);
                            st.grade(id);
                           st.setVisible(true);
                           this.dispose();
                    }else if(post.equals("lec")){
                        lecture le=new lecture();
                        le.lec(id);
                        le.user_id(id);
                        le.setVisible(true);
                        this.setVisible(false);
                    }
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid User ID or Password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Database connection faild.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
        
        
        
        ;
    }//GEN-LAST:event_signinActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        /* Recheck database connection */
        
       // dbconnection = new DBconnection();
        
        if(dbconnection.connect() == null){
            dynamic_1.removeAll();
            dynamic_1.repaint();
            dynamic_1.revalidate();

            dynamic_1.add(con_error);
            dynamic_1.repaint();
            dynamic_1.revalidate();
        
        }
        else{
            dynamic_1.removeAll();
            dynamic_1.repaint();
            dynamic_1.revalidate();

            dynamic_1.add(sign);
            dynamic_1.repaint();
            dynamic_1.revalidate();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel con_error;
    private javax.swing.JPanel dynamic_1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JPanel sign;
    private javax.swing.JButton signin;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables
}
