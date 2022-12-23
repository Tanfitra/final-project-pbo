package LoginPage;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Users.Dashboard;
import Cart.Cart;
import AdminPage.AdminPanel;

/**
 *
 * @author Tanfitra
 */
public class login extends javax.swing.JFrame {
    Connection conn = new DBConnection().connect();
    
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        if(conn == null) {
            JOptionPane.showMessageDialog(this, "DB Connection not available.", "", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        buyerRadioButton = new javax.swing.JRadioButton();
        sellerRadioButton = new javax.swing.JRadioButton();
        btn_login = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("LOGIN FORM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Access Type");

        buyerRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buyerRadioButton.setText("Buyer");
        buyerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerRadioButtonActionPerformed(evt);
            }
        });

        sellerRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sellerRadioButton.setText("Seller");
        sellerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerRadioButtonActionPerformed(evt);
            }
        });

        btn_login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_register.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_register.setText("Register");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_username)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buyerRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sellerRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(buyerRadioButton)
                    .addComponent(sellerRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_login)
                    .addComponent(btn_cancel))
                .addGap(18, 18, 18)
                .addComponent(btn_register)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sellerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerRadioButtonActionPerformed

    private void buyerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyerRadioButtonActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String username  = txt_username.getText();
        String password   = new String(txt_password.getPassword());
        boolean is_buyer   = buyerRadioButton.isSelected();
        boolean is_seller  = sellerRadioButton.isSelected();
        
        if(username.isEmpty() ||
           password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username / Password tidak boleh dikosongi!.", "", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                userlogin(username, password, is_buyer, is_seller);
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        dispose();
        this.setVisible(false);
        
        register registerScreenInstance = new register();
        registerScreenInstance.setTitle("Register a User");
        registerScreenInstance.setLocationRelativeTo(null);
        registerScreenInstance.setVisible(true);
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JRadioButton buyerRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton sellerRadioButton;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
    private void userlogin(String username, String password, boolean is_buyer, boolean is_seller) throws SQLException {
        Connection dbconn = new DBConnection().connect();
        
        int accessType = 1;
        if(is_seller) { accessType = 2; }
        
       try {
            PreparedStatement st = dbconn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ? AND accesstype = ?");
            
            st.setString(1, username);
            st.setString(2, password);
            st.setInt(3, accessType);
            
            st.close();
            ResultSet res = st.executeQuery();

            if(res.next()) {
                // display dashboard or new page after login.
                dispose();
                this.setVisible(false);
                
                if(accessType == 1) {
                    Cart ShoppingCartInstance = new Cart(username);

                    Dashboard dashBoardInstance = new Dashboard(ShoppingCartInstance);
                    dashBoardInstance.setLocationRelativeTo(null);
                    dashBoardInstance.setTitle("Dashboard");
                    dashBoardInstance.setVisible(true);
                } else {
                    AdminPanel adminPanelInstance = new AdminPanel();
                    adminPanelInstance.setLocationRelativeTo(null);
                    adminPanelInstance.setTitle("Dashboard");
                    adminPanelInstance.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username and/or password.", "", JOptionPane.ERROR_MESSAGE);
            }
            
            res.close();
            st.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
