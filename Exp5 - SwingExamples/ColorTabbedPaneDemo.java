//5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
//display the concerned color whenever the specific tab is selected in the Pan.

package swing;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ColorTabbedPaneDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Tabbed Pane Demo");

        // Create JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each color
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        // Add empty panels initially
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Set initial colors
        redPanel.setBackground(Color.RED);
        bluePanel.setBackground(Color.BLUE);
        greenPanel.setBackground(Color.GREEN);

        // Optional: Add labels to show color name inside panel
        redPanel.add(new JLabel("RED", SwingConstants.CENTER));
        bluePanel.add(new JLabel("BLUE", SwingConstants.CENTER));
        greenPanel.add(new JLabel("GREEN", SwingConstants.CENTER));

        // Center the labels and set font color for visibility
        for (JPanel panel : new JPanel[]{redPanel, bluePanel, greenPanel}) {
            for (Component comp : panel.getComponents()) {
                if (comp instanceof JLabel) {
                    JLabel lbl = (JLabel) comp;
                    lbl.setFont(new Font("Arial", Font.BOLD, 24));
                    lbl.setForeground(Color.WHITE);
                }
            }
        }

        // Frame layout
        frame.add(tabbedPane, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // center frame
        frame.setVisible(true);
    }
}


