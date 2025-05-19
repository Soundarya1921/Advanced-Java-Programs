//5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
//display the concerned color whenever the specific tab is selected in the Pan


package swing;
import javax.swing.*;
import java.awt.*;

public class ColorTabbedPaneCMY {

    public static void main(String[] args) {
        // Create the main JFrame
        JFrame frame = new JFrame("CMY Color Tabbed Pane");

        // Create a tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels with specific background colors
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        cyanPanel.add(new JLabel("CYAN"));

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        magentaPanel.add(new JLabel("MAGENTA"));

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        yellowPanel.add(new JLabel("YELLOW"));

        // Style the labels for better visibility
        JLabel[] labels = { (JLabel) cyanPanel.getComponent(0), 
                            (JLabel) magentaPanel.getComponent(0), 
                            (JLabel) yellowPanel.getComponent(0) };

        for (JLabel label : labels) {
            label.setFont(new Font("Arial", Font.BOLD, 24));
            label.setForeground(Color.BLACK);
        }

        // Add panels to the tabbed pane
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add tabbed pane to frame
        frame.add(tabbedPane, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}


