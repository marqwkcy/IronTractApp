package irontrack;

import javax.swing.*;

public class RegisterScreen extends JFrame {
    JTextField nameField, emailField;
    JPasswordField passwordField;

    public RegisterScreen() {
        setTitle("IronTrack - Register");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titleLabel = new JLabel("Register");
        titleLabel.setBounds(160, 20, 80, 30);
        add(titleLabel);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 60, 80, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(130, 60, 200, 25);
        add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 100, 80, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(130, 100, 200, 25);
        add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 140, 80, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(130, 140, 200, 25);
        add(passwordField);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(130, 180, 200, 30);
        registerButton.addActionListener(e -> handleRegistration());
        add(registerButton);

        JButton backButton = new JButton("Back to Login");
        backButton.setBounds(130, 230, 200, 30);
        backButton.addActionListener(e -> {
            new LoginScreen();
            dispose();
        });
        add(backButton);

        setVisible(true);
    }

    private void handleRegistration() {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            new LoginScreen();
            dispose();
        }
    }
}
