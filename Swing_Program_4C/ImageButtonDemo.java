//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
//Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
//pressed by implementing the event handling mechanism with addActionListener( ).

package javaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo extends JFrame implements ActionListener{

	private JLabel messageLabel;
    private JButton digitalBtn, hourGlassBtn;

    public ImageButtonDemo() {
        setTitle("Clock Button Example");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(20, 20));

        // Label at the top
        messageLabel = new JLabel("Click a button below", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(messageLabel, BorderLayout.NORTH);

        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 10));

        // Load images
        ImageIcon digitalIcon = new ImageIcon("clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        // Error handling
        if (digitalIcon.getIconWidth() == -1 || hourglassIcon.getIconWidth() == -1) {
            JOptionPane.showMessageDialog(this, "Could not load one or both images. Please check if 'clock.png' and 'hourglass.png' are in the project root.", "Image Load Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        // Create buttons
        digitalBtn = new JButton(digitalIcon);
        hourGlassBtn = new JButton(hourglassIcon);

        digitalBtn.setToolTipText("Digital Clock");
        hourGlassBtn.setToolTipText("Hour Glass");

        digitalBtn.setBorderPainted(false);
        digitalBtn.setContentAreaFilled(false);
        hourGlassBtn.setBorderPainted(false);
        hourGlassBtn.setContentAreaFilled(false);

        digitalBtn.addActionListener(this);
        hourGlassBtn.addActionListener(this);

        buttonPanel.add(digitalBtn);
        buttonPanel.add(hourGlassBtn);

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == digitalBtn) {
            messageLabel.setText("You have pressed digital clock!");
        } else if (e.getSource() == hourGlassBtn) {
            messageLabel.setText("You have pressed hour glass!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ImageButtonDemo::new);
    }
}
