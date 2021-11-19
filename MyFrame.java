import javax.swing.*;

import javax.swing.JProgressBar;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.event.*;



public class MyFrame implements ActionListener {
    JButton button;
    JLabel label;
    JFrame frame = new JFrame();
   

    MyFrame(){
        
       
        ImageIcon image2 = new ImageIcon("555.png");
        Border border = BorderFactory.createLineBorder(Color.gray,5);

        label = new JLabel();
        label.setText("Are you a Big Fan?");
        label.setIcon(image2); //set pic 555.png
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(224,255,255)); //color of text
        label.setFont(new Font("Comic Sans",Font.PLAIN,55));  //set font+color text
        label.setIconTextGap(100); //gap of text
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.BOTTOM);

        
        frame.setTitle("KPOP GAME");  //set title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);  //fix size
        frame.setSize(1200,700);
        
        
        frame.setLocationRelativeTo(null);  //set frame to middle
        frame.setVisible(true);
        frame.add(label);
        
        ImageIcon image = new ImageIcon("logo2.png"); //create icon
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(173,216,230));
        
        

        button = new JButton();
        button.setBounds(450, 100, 300, 100);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.addActionListener(this);
        button.setText("LET'S START !!!");
        button.setForeground(Color.DARK_GRAY);
        button.setBackground(Color.WHITE);
        button.setBorder(BorderFactory.createEtchedBorder());
        
         

        
        button.setFocusable(false);
        frame.add(button);
       
       
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
        	
        	frame.dispose();
            Window1 w1 = new Window1();
            

        }
    
    }
    
    
   
	

   
    
}
