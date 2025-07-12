import javax.swing.*;

public class LoginForm extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginForm() {
        setTitle("Login Page");
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the form
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); // Manual layout

        // Title
        JLabel titleLabel = new JLabel("Login Page", SwingConstants.CENTER);
        titleLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        titleLabel.setBounds(100, 20, 200, 30);
        add(titleLabel);

        // Username
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 80, 100, 25);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 80, 200, 25);
        usernameField.setToolTipText("Enter your username");
        add(usernameField);

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 120, 100, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 120, 200, 25);
        passwordField.setToolTipText("Enter your password");
        add(passwordField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(150, 170, 100, 30);
        add(loginButton);

        // Action listener for login
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if(username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
}
