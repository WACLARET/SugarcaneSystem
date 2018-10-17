
import com.mysql.jdbc.Connection;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Loginform extends javax.swing.JFrame {

   public Farmer Farmer;
    Connection cn;
    public Statement st; 
    PreparedStatement pst;
    private admin admin;
    ResultSet rs;
    public Loginform() {
   
   
        initComponents();            
        this.setLocationRelativeTo(null);
       try{
       Class.forName("com.mysql.jdbc.Driver");
       cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Login?zeroDateTimeBehavior=convertToNull","root","");
       st=cn.createStatement();
       JOptionPane.showMessageDialog(null, "Connected");
       
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, " Not Connected");
       }
    }
    public void close(){
    
    WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent); 
    
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        user_name = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\JAVA\\sugarcane-plantation-thailand-blue-sky-cloud-31261153.jpg")); // NOI18N
        jLabel3.setText("jLabel1");
        jLabel3.setMaximumSize(new java.awt.Dimension(1920, 1200));
        jLabel3.setMinimumSize(new java.awt.Dimension(1920, 1200));
        jLabel3.setPreferredSize(new java.awt.Dimension(1920, 1200));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("UKULIMA MIWA SYSTEM");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(590, 30, 310, 30);

        username.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username:");
        jPanel3.add(username);
        username.setBounds(590, 190, 140, 29);

        password.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password:");
        jPanel3.add(password);
        password.setBounds(600, 270, 130, 29);

        user_name.setPreferredSize(new java.awt.Dimension(6, 23));
        jPanel3.add(user_name);
        user_name.setBounds(800, 200, 150, 30);

        pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(pass);
        pass.setBounds(800, 270, 150, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(600, 410, 110, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(810, 410, 110, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\JAVA\\LOGIN.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(270, 190, 250, 260);

        combo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Farmer", "Admin" }));
        jPanel3.add(combo);
        combo.setBounds(800, 330, 140, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select option:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(560, 330, 170, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\UKULIMAMIWA\\JAVA\\videoblocks-sugar-cane-plantation-in-sunset-in-brazil-aerial-view-canavial_r3xsbevdje_thumbnail-full01.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1200));
        jLabel1.setMinimumSize(new java.awt.Dimension(1920, 1200));
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1200));
        jPanel3.add(jLabel1);
        jLabel1.setBounds(-10, -340, 1920, 1200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1126, 653);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(this.getExtendedState()| JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        user_name.setText("");
        pass.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         String uname = user_name.getText();
        String pword = pass.getText();
        String option = combo.getSelectedItem().toString();
        if(uname.equals("") ||pword.equals("") ||option.equals("Select")){
            JOptionPane.showMessageDialog(rootPane, "Some Fields Are Empty","Error", 1);

        }else{
            try{
                cn = connection.getConnection();
                pst = cn.prepareStatement("select *from userdata where Username =? and Password =?" );
                pst.setString(1, uname);
                pst.setString(2, pword);
                rs = pst.executeQuery();
                if(rs.next()){
                    String sl = rs.getString("option");
                    String un = rs.getString("Username");
                    if (combo.getSelectedItem() == "Admin")
                    {

                    if(option.equalsIgnoreCase("Admin") && sl.equalsIgnoreCase("admin")){
                        admin ad = new admin(un);
                        ad.setVisible(true);
                        setVisible(false);
                        }
                    }
                    if(option.equalsIgnoreCase("Farmer") && sl.equalsIgnoreCase("Farmer")){
                        Farmer fm = new Farmer(un);
                        fm.setVisible(true);
                        setVisible(false);

                    }
                } else{
                    JOptionPane.showMessageDialog(rootPane, "Username or Password Not Matched","Login Error", 1);
                }
            }catch(Exception ex){
                System.out.println(""+ex);
            }
        }
        try{
            String sql= "select *from userdata where Username= '"+user_name.getText()+"'and Options= '"+combo.getSelectedItem()+"'and Password = '"+String.valueOf(pass.getPassword())+"'";
            ResultSet rss= st.executeQuery(sql);
            if(rss.next()){
                if(combo.getSelectedItem() == "Admin")
                {
                admin ad = new admin();
                ad.setVisible(true);
                setVisible(false);
                }else
                {
                Farmer = new Farmer();
                Farmer.setVisible(true);
                this.dispose();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Please Check On Your UserName And Password");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "");
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Loginform().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel password;
    private javax.swing.JTextField user_name;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

    void setDefaultCloseOperation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}