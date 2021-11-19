import javax.swing.*;
import java.awt.*;

import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nct extends JFrame implements ActionListener{
	JButton bt1,bt2,bt3,bt4;
    JLabel label = new JLabel();
    JFrame frame = new JFrame();
	JTextField percentage = new JTextField();

    int point = 0;
    Nct(){
    	
    	ImageIcon image2 = new ImageIcon("nct1.png");
        Border border = BorderFactory.createLineBorder(Color.gray,5);
        label = new JLabel();
        label.setIcon(image2); //set pic 555.png
        label.setVerticalAlignment(JLabel.TOP);
        //label.setOpaque(true);
        
        bt1 = new JButton();
        bt1.setBounds(150, 320, 300, 100);
        bt1.setFont(new Font("Comic Sans",Font.BOLD,25));
        bt1.addActionListener(this);
        

        bt1.setText("7");
        bt1.setForeground(Color.PINK);
        bt1.setBackground(Color.WHITE);
        bt1.setBorder(BorderFactory.createEtchedBorder());
        bt1.setFocusable(false);
       
        bt2 = new JButton();
        bt2.setBounds(150, 500, 300, 100);
        bt2.setFont(new Font("Comic Sans",Font.BOLD,25));
        bt2.addActionListener(this);
        bt2.setText("18");
        bt2.setForeground(Color.PINK);
        bt2.setBackground(Color.WHITE);
        bt2.setBorder(BorderFactory.createEtchedBorder());
        bt2.setFocusable(false);
        
        bt3 = new JButton();
        bt3.setBounds(700, 320, 300, 100);
        bt3.setFont(new Font("Comic Sans",Font.BOLD,25));
        bt3.addActionListener(this);
        bt3.setText("23");
        bt3.setForeground(Color.PINK);
        bt3.setBackground(Color.WHITE);
        bt3.setBorder(BorderFactory.createEtchedBorder());
        bt3.setFocusable(false);
        
        bt4 = new JButton();
        bt4 = new JButton();
        bt4.setBounds(700, 500, 300, 100);
        bt4.setFont(new Font("Comic Sans",Font.BOLD,25));
        bt4.addActionListener(this);
        bt4.setText("16");
        bt4.setForeground(Color.PINK);
        bt4.setBackground(Color.WHITE);
        bt4.setBorder(BorderFactory.createEtchedBorder());
        bt4.setFocusable(false);
    	
    	
    	frame.setTitle("KPOP GAME");  //set title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);  //fix size
        frame.setSize(1200,700);
        frame.setLocationRelativeTo(null);  //set frame to middle
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("logo2.png"); //create icon
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(173,216,230));
        
        
        frame.add(bt1);
        frame.add(bt2);
        frame.add(bt3);
        frame.add(bt4);
        frame.add(label);
    
    }
    
    	
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==bt1){
        	//point=1; ;
        	bt1.setBackground(Color.RED);
        	frame.dispose();
            //new Bpq2();
        	}
        else if(e.getSource()==bt2) {
        	point++;
        	bt2.setBackground(Color.RED);
        	frame.dispose();
            //new Bpq2();
        }
        else if(e.getSource()==bt3) {
        	//point = 1 ;
        	bt3.setBackground(Color.RED);
        	frame.dispose();
             //new Bpq2();
        }
        else if(e.getSource()==bt4) {
        	point++;
        	bt4.setBackground(Color.GREEN);
        	frame.dispose();
            //new Bpq2();
        }
      new Bpq2();
        
    }
    

	
class Bpq2 implements ActionListener {
	JButton btt1,btt2,btt3,btt4;
    JLabel label;
    JFrame frame = new JFrame();
    Bpq2(){
    	
    	ImageIcon image2 = new ImageIcon("nct2.png");
        //Border border = BorderFactory.createLineBorder(Color.gray,5);
        JLabel label = new JLabel();
        label.setIcon(image2); //set pic 555.png
        label.setVerticalAlignment(JLabel.TOP);
        
        btt1 = new JButton();
        btt1.setBounds(150, 320, 300, 100);
        btt1.setFont(new Font("Comic Sans",Font.BOLD,25));
        btt1.addActionListener(this);
        btt1.setText("NCT U");
        btt1.setForeground(Color.PINK);
        btt1.setBackground(Color.WHITE);
        btt1.setBorder(BorderFactory.createEtchedBorder());
        btt1.setFocusable(false);
       
        btt2 = new JButton();
        btt2.setBounds(150, 500, 300, 100);
        btt2.setFont(new Font("Comic Sans",Font.BOLD,25));
        btt2.addActionListener(this);
        btt2.setText("NCT 127");
        btt2.setForeground(Color.PINK);
        btt2.setBackground(Color.WHITE);
        btt2.setBorder(BorderFactory.createEtchedBorder());
        btt2.setFocusable(false);
        
        btt3 = new JButton();
        btt3.setBounds(700, 320, 300, 100);
        btt3.setFont(new Font("Comic Sans",Font.BOLD,25));
        btt3.addActionListener(this);
        btt3.setText("NCT DREAM");
        btt3.setForeground(Color.PINK);
        btt3.setBackground(Color.WHITE);
        btt3.setBorder(BorderFactory.createEtchedBorder());
        btt3.setFocusable(false);
        
        btt4 = new JButton();
        btt4.setBounds(700, 500, 300, 100);
        btt4.setFont(new Font("Comic Sans",Font.BOLD,25));
        btt4.addActionListener(this);
        btt4.setText("WAYV");
        btt4.setForeground(Color.PINK);
        btt4.setBackground(Color.WHITE);
        btt4.setBorder(BorderFactory.createEtchedBorder());
        btt4.setFocusable(false);
    	
    	
    	frame.setTitle("KPOP GAME");  //set title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);  //fix size
        frame.setSize(1200,700);
        frame.setLocationRelativeTo(null);  //set frame to middle
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("logo2.png"); //create icon
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(173,216,230));
        
        
        frame.add(btt1);
        frame.add(btt2);
        frame.add(btt3);
        frame.add(btt4);
        frame.add(label);
    
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btt1){
        	point++;
        	btt1.setBackground(Color.RED);
        	frame.dispose();
            new Bpq3();
        	}
        else if(e.getSource()==btt2) {
        	//int point = 0 ;
        	btt2.setBackground(Color.RED);
        	frame.dispose();
            new Bpq3();
        }
        else if(e.getSource()==btt3) {
        	//int point = 0 ;
        	btt3.setBackground(Color.RED);
        	frame.dispose();
            new Bpq3();
        }
        else if(e.getSource()==btt4) {
            //point++;
        	btt4.setBackground(Color.GREEN);
        	frame.dispose();
            new Bpq3();
        }
    }
}
class Bpq3 implements ActionListener{
	JButton bt1,bt2,bt3,bt4;
    JLabel label;
    JFrame frame = new JFrame();
    Bpq3(){
    	
    	ImageIcon image2 = new ImageIcon("nct3.png");
        //Border border = BorderFactory.createLineBorder(Color.gray,5);
        label = new JLabel();
        label.setIcon(image2); //set pic 555.png
        label.setVerticalAlignment(JLabel.TOP);
        
        bt1 = new JButton();
        bt1.setBounds(150, 320, 300, 100);
        bt1.setFont(new Font("Comic Sans",Font.BOLD,25));
        bt1.addActionListener(this);
        bt1.setText("TEN");
        bt1.setForeground(Color.PINK);
        bt1.setBackground(Color.WHITE);
        bt1.setBorder(BorderFactory.createEtchedBorder());
        bt1.setFocusable(false);
       
        bt2 = new JButton();
        bt2.setBounds(150, 500, 300, 100);
        bt2.setFont(new Font("Comic Sans",Font.BOLD,25));
        bt2.addActionListener(this);
        bt2.setText("MARK");
        bt2.setForeground(Color.PINK);
        bt2.setBackground(Color.WHITE);
        bt2.setBorder(BorderFactory.createEtchedBorder());
        bt2.setFocusable(false);
        
        bt3 = new JButton();
        bt3.setBounds(700, 320, 300, 100);
        bt3.setFont(new Font("Comic Sans",Font.BOLD,25));
        bt3.addActionListener(this);
        bt3.setText("Jaehyun");
        bt3.setForeground(Color.PINK);
        bt3.setBackground(Color.WHITE);
        bt3.setBorder(BorderFactory.createEtchedBorder());
        bt3.setFocusable(false);
        
        bt4 = new JButton();
        bt4.setBounds(700, 500, 300, 100);
        bt4.setFont(new Font("Comic Sans",Font.BOLD,25));
        bt4.addActionListener(this);
        bt4.setText("Taeyong");
        bt4.setForeground(Color.PINK);
        bt4.setBackground(Color.WHITE);
        bt4.setBorder(BorderFactory.createEtchedBorder());
        bt4.setFocusable(false);
    	
    	
    	frame.setTitle("KPOP GAME");  //set title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);  //fix size
        frame.setSize(1200,700);
        frame.setLocationRelativeTo(null);  //set frame to middle
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("logo2.png"); //create icon
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(173,216,230));
        
        
        frame.add(bt1);
        frame.add(bt2);
        frame.add(bt3);
        frame.add(bt4);
        frame.add(label);
    
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==bt1){
        	//point++;
        	bt1.setBackground(Color.GREEN);
        	frame.dispose();
            Bpq4 bpq4 = new Bpq4();
        	}
        else if(e.getSource()==bt2) {
        	//int point = 0 ;
        	bt2.setBackground(Color.RED);
        	frame.dispose();
            Bpq4 bpq4 = new Bpq4();
        }
        else if(e.getSource()==bt3) {
        	point++;
        	bt3.setBackground(Color.RED);
        	frame.dispose();
            Bpq4 bpq4 = new Bpq4();
        }
        else if(e.getSource()==bt4) {
        	//int point = 0 ;
        	bt4.setBackground(Color.RED);
        	frame.dispose();
            Bpq4 bpq4 = new Bpq4();
        }
    }
}


class Bpq4  implements ActionListener{
	JButton bt1,bt2,bt3,bt4;
    JLabel label;
    JFrame frame = new JFrame();
    Bpq4(){
    	
    	ImageIcon image2 = new ImageIcon("nct5.png");
        //Border border = BorderFactory.createLineBorder(Color.gray,5);
        label = new JLabel();
        label.setIcon(image2); //set pic 555.png
        label.setVerticalAlignment(JLabel.TOP);
        
        bt1 = new JButton();
        bt1.setBounds(150, 320, 300, 100);
        bt1.setFont(new Font("Comic Sans",Font.BOLD,25));
        bt1.addActionListener(this);
        bt1.setText("Fire truck");
        bt1.setForeground(Color.PINK);
        bt1.setBackground(Color.WHITE);
        bt1.setBorder(BorderFactory.createEtchedBorder());
        bt1.setFocusable(false);
       
        bt2 = new JButton();
        bt2.setBounds(150, 500, 300, 100);
        bt2.setFont(new Font("Comic Sans",Font.BOLD,25));
        bt2.addActionListener(this);
        bt2.setText("Baby don't stop");
        bt2.setForeground(Color.PINK);
        bt2.setBackground(Color.WHITE);
        bt2.setBorder(BorderFactory.createEtchedBorder());
        bt2.setFocusable(false);
        
        bt3 = new JButton();
        bt3.setBounds(700, 320, 300, 100);
        bt3.setFont(new Font("Comic Sans",Font.BOLD,25));
        bt3.addActionListener(this);
        bt3.setText("Sticker");
        bt3.setForeground(Color.PINK);
        bt3.setBackground(Color.WHITE);
        bt3.setBorder(BorderFactory.createEtchedBorder());
        bt3.setFocusable(false);
        
        bt4 = new JButton();
        bt4.setBounds(700, 500, 300, 100);
        bt4.setFont(new Font("Comic Sans",Font.BOLD,25));
        bt4.addActionListener(this);
        bt4.setText("Make a wish");
        bt4.setForeground(Color.PINK);
        bt4.setBackground(Color.WHITE);
        bt4.setBorder(BorderFactory.createEtchedBorder());
        bt4.setFocusable(false);
    	
    	
    	frame.setTitle("KPOP GAME");  //set title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);  //fix size
        frame.setSize(1200,700);
        frame.setLocationRelativeTo(null);  //set frame to middle
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("logo2.png"); //create icon
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(173,216,230));
        
        
        frame.add(bt1);
        frame.add(bt2);
        frame.add(bt3);
        frame.add(bt4);
        frame.add(label);
    
    }
    @Override
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==bt1){
        	//int point = 0 ;
        	bt1.setBackground(Color.RED);
        	frame.dispose();
        	new Result1();
        	}
        else if(e.getSource()==bt2) {
        	point++;
        	bt2.setBackground(Color.GREEN);
        	frame.dispose();
        	new Result1();
        }
        else if(e.getSource()==bt3) {
        	//int point = 0 ;
        	bt3.setBackground(Color.RED);
        	frame.dispose();
        	new Result1();
        }
        else if(e.getSource()==bt4) {
        	//int point = 0 ;
        	bt4.setBackground(Color.RED);
        	frame.dispose();
            new Result1();
        }
    }
}

class Result1 {
	Result1(){
		JLabel label1 = new JLabel();
        JFrame frame = new JFrame();

        String a = null ;
        int x = (point*100)/4;
        
        
        
        ImageIcon image2 = new ImageIcon("nw.png");
        Border border = BorderFactory.createLineBorder(Color.gray,5);
        label1 = new JLabel();
        
        label1 = new JLabel();
        label1.setIcon(image2); //set pic 555.png
        label1.setVerticalAlignment(JLabel.CENTER);
        if(x <= 40) {
        	a="BAD!!!";}
        else if(x <= 70) {
        	a="GOOD!!!";}
        else if(x <= 100) {
        	a="Excellent !!!";}
        
        label1 = new JLabel();
        label1.setText("Your score = "+x+"% \n"+"\n"+a);
        
        label1.setIcon(image2); //set pic 555.png
        label1.setHorizontalTextPosition(JLabel.RIGHT);
        label1.setVerticalTextPosition(JLabel.CENTER);
        label1.setForeground(new Color(224,255,255)); //color of text
        label1.setFont(new Font("MV Boli",Font.PLAIN,50));  //set font+color text
        label1.setIconTextGap(80); //gap of text
        
		label1.setBorder(border);
        label1.setVerticalAlignment(JLabel.CENTER);
        

        frame.add(label1);
	    frame.setTitle("KPOP GAME");  //set title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);  //fix size
        frame.setSize(1500,700);
        frame.setLocationRelativeTo(null);  //set frame to middle
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("logo2.png"); //create icon
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(173,216,230));
        
        
        
        frame.add(label1);
        
}

}
}


