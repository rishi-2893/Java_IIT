import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
    
    JButton button;
    
    public MyFrame(){
        
        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        // Adding action listener to the button
        button.addActionListener(this);
        
        button.setText("Click Here");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        // Adding button
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("Button is clicked!");

            this.getContentPane().setBackground(Color.PINK);
        }
    }
}