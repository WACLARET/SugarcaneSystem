
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Farmerdata2 extends javax.swing.JFrame {

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    /**
     * Creates new form Farmerdata2
     */
    public Farmerdata2() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        I = new javax.swing.JTextField();
        F = new javax.swing.JTextField();
        L = new javax.swing.JTextField();
        N = new javax.swing.JTextField();
        LO = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        P = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Please Input Farmers ID To Search");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(480, 90, 350, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("ID:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(630, 160, 40, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Firstname:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(550, 220, 128, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Lastname:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(550, 280, 125, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("NoOfHacters:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(520, 340, 161, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Location:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(570, 390, 112, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Amount:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(580, 450, 103, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Paid:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(620, 500, 80, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Balance:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(580, 560, 120, 29);
        jPanel2.add(I);
        I.setBounds(760, 160, 160, 30);
        jPanel2.add(F);
        F.setBounds(760, 220, 160, 30);
        jPanel2.add(L);
        L.setBounds(759, 280, 160, 30);
        jPanel2.add(N);
        N.setBounds(760, 340, 160, 30);
        jPanel2.add(LO);
        LO.setBounds(760, 390, 160, 30);

        jTextField6.setText("jTextField6");
        jPanel2.add(jTextField6);
        jTextField6.setBounds(780, 400, 59, 20);
        jPanel2.add(A);
        A.setBounds(760, 450, 160, 30);
        jPanel2.add(P);
        P.setBounds(760, 500, 160, 30);
        jPanel2.add(B);
        B.setBounds(760, 560, 160, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(663, 640, 80, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(860, 640, 67, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\JAVA\\videoblocks-sugar-cane-plantation-in-sunset-in-brazil-aerial-view-canavial_r3xsbevdje_thumbnail-full01.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1900, 1200));
        jLabel2.setMinimumSize(new java.awt.Dimension(1900, 1200));
        jLabel2.setPreferredSize(new java.awt.Dimension(1900, 1200));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1900, 1200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1121, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Id = I.getText();
        
        
        try{
            
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login?zeroDateTimeBehavior=convertToNull","root","");
        pst = conn.prepareStatement("SELECT *FROM farmer where ID = ?");
        pst.setString(1, Id);
        rs = pst.executeQuery();
        while (rs.next()){
        F.setText(rs.getString("Firstname"));
        L.setText(rs.getString("Lastname"));
        N.setText(rs.getString("NoOfHecta"));
        LO.setText(rs.getString("Location"));
        A.setText(rs.getString("Amount"));
        P.setText(rs.getString("Paid"));
        B.setText(rs.getString("Balance"));
        
        }
        }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        I.setText("");
        F.setText("");
        L.setText("");
        N.setText("");
        LO.setText("");
        A.setText("");
        P.setText("");
        B.setText("");
        
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
            java.util.logging.Logger.getLogger(Farmerdata2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Farmerdata2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Farmerdata2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Farmerdata2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Farmerdata2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JTextField F;
    private javax.swing.JTextField I;
    private javax.swing.JTextField L;
    private javax.swing.JTextField LO;
    private javax.swing.JTextField N;
    private javax.swing.JTextField P;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
