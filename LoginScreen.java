package irontrack;

import javax.swing.*;

public class LoginScreen extends JFrame {
    JTextField emailField;
    JPasswordField passwordField;

    public LoginScreen() {
        setTitle("IronTrack - Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titleLabel = new JLabel("Log in");
        titleLabel.setBounds(160, 20, 80, 30);
        add(titleLabel);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 60, 80, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(130, 60, 200, 25);
        add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 80, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(130, 100, 200, 25);
        add(passwordField);

        JButton loginButton = new JButton("Log in");
        loginButton.setBounds(130, 140, 200, 30);
        loginButton.addActionListener(e -> handleLogin());
        add(loginButton);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(130, 180, 200, 30);
        registerButton.addActionListener(e -> {
            new RegisterScreen();
            dispose();
        });
        add(registerButton);

        setVisible(true);
    }

    private void handleLogin() {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        if (email.equals("user@example.com") && password.equals("password")) {
            dispose();
            new DashboardScreen();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
