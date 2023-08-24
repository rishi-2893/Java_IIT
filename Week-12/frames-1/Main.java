import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main{
    public static void main(String[] args) {
        
        // Creating the frame
        JFrame frame = new JFrame();

        // Adding title
        frame.setTitle("My First Frame");

        // Resize the default size
        frame.setSize(420, 420);

        // Making it non-resizable
        frame.setResizable(false);

        // Making the close button work
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting the icon
        ImageIcon image = new ImageIcon("./photo.png");
        frame.setIconImage(image.getImage());

        // Changing background colour
        frame.getContentPane().setBackground(Color.GRAY);

        // Making it visible
        frame.setVisible(true);
    }
}