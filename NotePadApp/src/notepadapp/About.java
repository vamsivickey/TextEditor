
package notepadapp;

import java.awt.Font;
import static java.awt.Font.SERIF;
import static javax.management.Query.and;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class About extends JFrame{
    About(){
        setBounds(100,100,500,400);
        setTitle("About Notepad Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon=new ImageIcon(getClass().getResource("about.png"));
        setIconImage(icon.getImage());
        setLayout(null);
        
//        JLabel iconLabel=new JLabel(new ImageIcon(getClass().getResource("about.png")));
//        iconLabel.setBounds(100,50,80,80);
//        add(iconLabel);
        
        JLabel textLabel=new JLabel("<html>Welcome to Notepad <br>Notepad is a simple text editor for Microsoft windows and a basic text-editing program which enables computer users to create documents<br>All rights reserved@2023");
        textLabel.setBounds(100,50,400,300);
       // textLabel.setFont(new Font(Font.SANS SERIF,Font.PLAIN,16));
        add(textLabel);
    
    }
    
    public static void main(String[] args){
        new About().setVisible(true);
    }
}
