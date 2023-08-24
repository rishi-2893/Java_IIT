import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main{
    public static void main(String[] args) {
        
        // Panel: GUI component which holds other components

        // ----------RED-PANEL-------------
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);


        // ----------BLUE-PANEL-------------
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 250, 250, 250);


        // --------RED-LABEL-----------
        JLabel redLabel = new JLabel();
        redLabel.setText("This is red!");
        // add label to panel
        redPanel.add(redLabel);
        
        
        // --------BLUE-LABEL-----------
        JLabel blueLabel = new JLabel();
        blueLabel.setText("This is blue!");
        // add label to panel
        bluePanel.add(blueLabel);


        // -----------FRAME------------
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setVisible(true);

        // Setting default layout manager to null - allows to change location of components
        frame.setLayout(null);

        // Adding panel to the frame
        frame.add(redPanel);
        frame.add(bluePanel);
    }
}