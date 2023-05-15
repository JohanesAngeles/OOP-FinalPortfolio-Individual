import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel statusLabel;
    JTextField userTextField;
    JPasswordField passwordField;
    JButton loginButton, clearButton;
    private JLabel LoginBackground;

    public Login() {
    	setResizable(false);
    	setAlwaysOnTop(true);
        statusLabel = new JLabel("");
        statusLabel.setForeground(Color.WHITE);
        statusLabel.setFont(new Font("Segoe UI", Font.ITALIC, 15));
        statusLabel.setBounds(343, 486, 202, 30);
        userTextField = new JTextField();
        userTextField.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        userTextField.setForeground(Color.WHITE);
        userTextField.setBackground(new Color(152, 121, 57));
        userTextField.setBorder(null);
        userTextField.setBounds(251, 293, 399, 43);
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        passwordField.setForeground(Color.WHITE);
        passwordField.setBackground(new Color(152, 121, 57));
        passwordField.setBorder(null);
        passwordField.setBounds(251, 376, 399, 43);
        loginButton = new JButton("");
        loginButton.setIcon(new ImageIcon(Login.class.getResource("/image/loginButton.png")));
        loginButton.setBounds(251, 432, 190, 43);
        clearButton = new JButton("");
        clearButton.setIcon(new ImageIcon(Login.class.getResource("/image/clearButton.png")));
        clearButton.setBounds(460, 432, 190, 43);
        getContentPane().setLayout(null);
        getContentPane().add(statusLabel);
        getContentPane().add(userTextField);
        getContentPane().add(passwordField);
        getContentPane().add(loginButton);
        getContentPane().add(clearButton);
        
        JLabel loginbg = new JLabel("");
        loginbg.setIcon(new ImageIcon(Login.class.getResource("/image/Loginbg.png")));
        loginbg.setBounds(0, 0, 895, 743);
        getContentPane().add(loginbg);
        
       

        loginButton.addActionListener(this);
        clearButton.addActionListener(this);

        setTitle("Login Form");
        setSize(911, 636);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    	
        if (e.getSource() == loginButton) {
            String username = userTextField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("angelesjohanes@gmail.com") && password.equals("Johan1006")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                dispose();
                // Open the home page here
                MainPage homepage = new MainPage();
				MainPage.main(null);
				
            } else {
                statusLabel.setText("Invalid Username or Password");
            }
        } else if (e.getSource() == clearButton) {
            userTextField.setText("");
            passwordField.setText("");
            statusLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new Login();
       
        
    }
}
