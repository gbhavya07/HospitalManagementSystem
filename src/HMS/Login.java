package HMS;

import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class Login extends javax.swing.JFrame {
    
    private final String correctPassword = "123"; // Replace "your_password" with the correct password
    private javax.swing.JPasswordField passwordField;

    public Login() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        
        jPanel1.setBackground(new java.awt.Color(50, 153, 255)); // Set background color
        
        jLabelLogo = new JLabel();
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("HMSlogo.png"))); // Set logo image
        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // Increase font size
        jLabel2.setForeground(new java.awt.Color(255, 255, 255)); // Set text color
        jLabel2.setText("Your Health Our Responsibility");
        
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // Increase font size
        jLabel1.setForeground(new java.awt.Color(255, 255, 255)); // Set text color
        jLabel1.setText("Enter Password:");
        
        passwordField.setFont(new java.awt.Font("Arial", 1, 14)); 
        
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); 
        jButton1.setText("Login");
        jButton1.setBackground(new java.awt.Color(0, 102, 204)); // Set button background color
        jButton1.setForeground(new java.awt.Color(255, 255, 255)); // Set button text color
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        jPanel1.setLayout(null); // Set layout to null to manually set bounds
        
        jPanel1.add(jLabelLogo);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel1);
        jPanel1.add(passwordField);
        jPanel1.add(jButton1);
        
        // Set bounds for components
        jLabelLogo.setBounds(50, 50, 300, 300);
        jLabel2.setBounds(50, 360, 600, 70); // Adjusted position
        jLabel1.setBounds(100, 450, 200, 20); // Adjusted position
        passwordField.setBounds(100, 480, 200, 25); // Adjusted position
        jButton1.setBounds(100, 520, 200, 30); // Adjusted position
        
        getContentPane().add(jPanel1);
        
        pack();
    }




    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        char[] inputPassword = passwordField.getPassword();
        String enteredPassword = new String(inputPassword);
        if (enteredPassword.equals(correctPassword)) {
            Home home = new Home();
            home.setVisible(true);
            this.dispose(); // Close the login window
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Password! Please try again.");
            passwordField.setText(""); // Clear password field
        }
    }                                        

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1; 
    private JLabel jLabelLogo; 
    private JLabel jLabel2; 
    
    
}
