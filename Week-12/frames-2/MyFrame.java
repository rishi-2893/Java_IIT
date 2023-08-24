import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

    public MyFrame() {
        
        // Adding title
        this.setTitle("My First Frame");

        // Resize the default size
        this.setSize(420, 420);

        // Making it non-resizable
        this.setResizable(false);

        // Making the close button work
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting the icon
        ImageIcon image = new ImageIcon("./photo.png");
        this.setIconImage(image.getImage());

        // Changing background colour
        this.getContentPane().setBackground(Color.GRAY);

        // Making it visible
        this.setVisible(true);
    }
}