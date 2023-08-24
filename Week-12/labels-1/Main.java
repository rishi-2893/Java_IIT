import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main{
    public static void main(String[] args) {
        
        // Label: GUI display area for string of text, images


        // Image
        ImageIcon image = new ImageIcon("./photo.png");
        // Border
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

        // creating Label
        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);

        // Moving the label
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setVerticalAlignment(JLabel.TOP);

        // Adding border
        label.setBorder(border);

        // Setting up the JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        // Adding label to the frame
        frame.add(label);
    }
}