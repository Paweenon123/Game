import javax.swing.*;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.event.*;

import java.awt.*;
public class Window1 extends JFrame implements ActionListener{
	JFrame frame = new JFrame(); 
	//JLabel label = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton(); 
	JButton button3 = new JButton(); 
	JButton button4 = new JButton(); 
	JButton button5 = new JButton(); 
	JButton button6 = new JButton(); 
	
	Window1(){
		
		
		
		JLabel label = new JLabel("Choose you favourite artist :");
		label.setBounds(20,20,500,55);
		label.setFont(new Font("MV Boli",Font.PLAIN,30));
		frame.add(label);
		 ImageIcon icon1 = new ImageIcon("bp1.png");
	     button1.setIcon(icon1);
	     button1.setBounds(150, 100, 300, 100);
	    // button1.setFont(new Font("Comic Sans",Font.BOLD,25));
	     button1.addActionListener(this);
	     //button1.setText("LET'S START !!!");
	    // button1.setForeground(Color.DARK_GRAY);
	     button1.setBackground(Color.WHITE);
	     button1.setBorder(BorderFactory.createEtchedBorder());
	     button1.setFocusable(false);
	     
	     ImageIcon icon2 = new ImageIcon("nct.png");
	     button2.setIcon(icon2);
	     button2.setBounds(150, 300, 300, 100);
	    // button1.setFont(new Font("Comic Sans",Font.BOLD,25));
	     button2.addActionListener(this);
	     //button1.setText("LET'S START !!!");
	    // button1.setForeground(Color.DARK_GRAY);
	     button2.setBackground(Color.WHITE);
	     button2.setBorder(BorderFactory.createEtchedBorder());
	     button2.setFocusable(false);
	     
	     ImageIcon icon3 = new ImageIcon("bts.png");
	     button3.setIcon(icon3);
	     button3.setBounds(150, 500, 300, 100);
	    // button1.setFont(new Font("Comic Sans",Font.BOLD,25));
	     button3.addActionListener(this);
	     //button1.setText("LET'S START !!!");
	    // button1.setForeground(Color.DARK_GRAY);
	     button3.setBackground(Color.WHITE);
	     button3.setBorder(BorderFactory.createEtchedBorder());
	     button3.setFocusable(false);
	     
	     ImageIcon icon4 = new ImageIcon("ts.png");
	     button4.setIcon(icon4);
	     button4.setBounds(750, 100, 300, 100);
	    // button1.setFont(new Font("Comic Sans",Font.BOLD,25));
	     button4.addActionListener(this);
	     //button1.setText("LET'S START !!!");
	    // button1.setForeground(Color.DARK_GRAY);
	     button4.setBackground(Color.WHITE);
	     button4.setBorder(BorderFactory.createEtchedBorder());
	     button4.setFocusable(false);
	     
	     ImageIcon icon5 = new ImageIcon("twice.png");
	     button5.setIcon(icon5);
	     button5.setBounds(750, 300, 300, 100);
	    // button1.setFont(new Font("Comic Sans",Font.BOLD,25));
	     button5.addActionListener(this);
	     //button1.setText("LET'S START !!!");
	    // button1.setForeground(Color.DARK_GRAY);
	     button5.setBackground(Color.WHITE);
	     button5.setBorder(BorderFactory.createEtchedBorder());
	     button5.setFocusable(false);
	     
	     ImageIcon icon6 = new ImageIcon("exo.png");
	     button6.setIcon(icon6);
	     button6.setBounds(750, 500, 300, 100);
	    // button1.setFont(new Font("Comic Sans",Font.BOLD,25));
	     button6.addActionListener(this);
	     //button1.setText("LET'S START !!!");
	    // button1.setForeground(Color.DARK_GRAY);
	     button6.setBackground(Color.WHITE);
	     button6.setBorder(BorderFactory.createEtchedBorder());
	     button6.setFocusable(false);
	     
	    
	     
		 frame.setTitle("KPOP GAME");  //set title
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.setResizable(false);  //fix size
	     frame.setSize(1200,700);
	     frame.setLayout(null);
	     
	        
	     frame.setLocationRelativeTo(null);  //set frame to middle
	     frame.setVisible(true);
	     frame.add(label);
	        
	     ImageIcon image = new ImageIcon("logo2.png"); //create icon
	     frame.setIconImage(image.getImage());
	     frame.getContentPane().setBackground(new Color(173,216,230));
	     
	    
	     frame.add(button1);
	     frame.add(button2);
	     frame.add(button3);
	     frame.add(button4);
	     frame.add(button5);
	     frame.add(button6);
	     
	        
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1){
			frame.dispose();
            new Bpq1();
            }
		else if(e.getSource()==button2){
			frame.dispose();
            new Nct();
            }
		else if(e.getSource()==button3){
			frame.dispose();
            new Bts();
            }
		else if(e.getSource()==button4){
			frame.dispose();
            new Treasure();
            }
		else if(e.getSource()==button5){
			frame.dispose();
            new Twice();
            }
		else if(e.getSource()==button6){
			frame.dispose();
            new Exo();
		}
	}

}
