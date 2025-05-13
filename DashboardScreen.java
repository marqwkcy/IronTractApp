package irontrack;

import javax.swing.*;
import java.awt.*;

public class DashboardScreen extends JFrame {
    public DashboardScreen() {
        setTitle("IronTrack Dashboard");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel sidebar = new JPanel(new GridLayout(6, 1, 5, 5));
        sidebar.setBackground(new Color(200, 220, 240));
        sidebar.setPreferredSize(new Dimension(180, getHeight()));

        String[] buttons = {
            "Dashboard", "My Workouts", "Plan Workout",
            "Progress Tracker", "Settings", "Logout"
        };

        for (String btnText : buttons) {
            JButton btn = new JButton(btnText);
            sidebar.add(btn);
        }

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel topPanel = new JPanel(new GridLayout(2, 2));
        topPanel.setBorder(BorderFactory.createTitledBorder("Next Workout"));
        topPanel.add(new JLabel("Workout Name: Iron Workout"));
        topPanel.add(new JLabel("Date & Time: 2025-05-13"));
        topPanel.add(new JLabel("Focus: Arms"));
        topPanel.add(new JLabel("Duration: 45 mins"));

        JPanel chartPanel = new JPanel();
        chartPanel.setBorder(BorderFactory.createTitledBorder("Workout Graph Placeholder"));
        chartPanel.setPreferredSize(new Dimension(400, 200));
        chartPanel.setBackground(Color.LIGHT_GRAY);

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(chartPanel, BorderLayout.CENTER);

        add(sidebar, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
