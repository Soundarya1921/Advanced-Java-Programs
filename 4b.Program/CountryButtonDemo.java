//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
//pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
//event handling mechanism with addActionListener( ).

package javaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Country Button Demo");

        // Create buttons
        JButton btnSrilanka = new JButton("Srilanka");
        JButton btnIndia = new JButton("India");

        // Create a label to display the message
        JLabel messageLabel = new JLabel("Press a button", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 18));

        // Add ActionListener for Srilanka button
        btnSrilanka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Srilanka is pressed");
            }
        });

        // Add ActionListener for India button
        btnIndia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("India is pressed");
            }
        });

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSrilanka);
        buttonPanel.add(btnIndia);

        // Add components to the frame
        frame.setLayout(new BorderLayout());
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(messageLabel, BorderLayout.CENTER);

        // Frame settings
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // center the frame
        frame.setVisible(true);
    }
}

