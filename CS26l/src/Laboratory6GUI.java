import javax.swing.*;
import java.awt.event.*;


public class Laboratory6GUI {
static String num,operation;
static double first,sec;
static JTextField jtext;
	public static void main(String[] args) {
		// Calculator
		JFrame j = new JFrame("My Casio");
		j.setLayout(null);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBounds(0, 0, 300, 350);
		
		JRadioButton on = new JRadioButton("ON");
		JRadioButton off = new JRadioButton("OFF");
		
		ButtonGroup option = new ButtonGroup();
		option.add(off);
		option.add(on);
		
		JTextField jtext = new JTextField();
		jtext.setEditable(false);
		jtext.setHorizontalAlignment(JTextField.RIGHT);
				
		j.add(jp);
		
		
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb0 = new JButton("0");

		JButton jbp = new JButton("+");
		JButton jbm = new JButton("-");
		JButton jbd = new JButton("/");
		JButton jbt = new JButton("*");
		
		JButton jbc = new JButton("C");

		JButton jbe = new JButton("=");
		
		on.setBounds(10,10, 50,25);
		off.setBounds(10,35, 50,25);

		jtext.setBounds(70, 10, 230, 50);
		
		jb1.setBounds(10, 80, 50, 50);
		jb2.setBounds(70, 80, 50, 50);
		jb3.setBounds(130, 80, 50, 50);
		jbp.setBounds(190, 80, 50, 50);
		jbm.setBounds(250, 80, 50, 50);
		
		jb4.setBounds(10, 150, 50, 50);
		jb5.setBounds(70, 150, 50, 50);
		jb6.setBounds(130, 150, 50, 50);
		jbd.setBounds(190, 150, 50, 50);
		jbt.setBounds(250, 150, 50, 50);
		
		jb7.setBounds(10, 220, 50, 50);
		jb8.setBounds(70, 220, 50, 50);
		jb9.setBounds(130, 220, 50, 50);
		jb0.setBounds(190, 220, 50, 50);
		jbc.setBounds(250, 220, 50, 50);
		
		jbe.setBounds(10, 290, 290, 50);

		jp.add(off);
		jp.add(on);
		
		
		jp.add(jtext);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jb7);
		jp.add(jb8);
		jp.add(jb9);
		jp.add(jb0);
		jp.add(jbd);
		jp.add(jbt);
		jp.add(jbc);
		jp.add(jbp);
		jp.add(jbm);
		jp.add(jbe);
		//On and OFF
		off.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jb1.setEnabled(false);
				jb2.setEnabled(false);
				jb3.setEnabled(false);
				jb4.setEnabled(false);
				jb5.setEnabled(false);
				jb6.setEnabled(false);
				jb7.setEnabled(false);
				jb8.setEnabled(false);
				jb9.setEnabled(false);
				jb0.setEnabled(false);
				jbp.setEnabled(false);
				jbm.setEnabled(false);
				jbt.setEnabled(false);
				jbd.setEnabled(false);
				jbc.setEnabled(false);
				jbe.setEnabled(false);
				jtext.setText("");

			}
		});
		on.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jb1.setEnabled(true);
				jb2.setEnabled(true);
				jb3.setEnabled(true);
				jb4.setEnabled(true);
				jb5.setEnabled(true);
				jb6.setEnabled(true);
				jb7.setEnabled(true);
				jb8.setEnabled(true);
				jb9.setEnabled(true);
				jb0.setEnabled(true);
				jbp.setEnabled(true);
				jbm.setEnabled(true);
				jbt.setEnabled(true);
				jbd.setEnabled(true);
				jbc.setEnabled(true);
				jbe.setEnabled(true);

			}
		});
		
		//numbers
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = "1";
				String copynum = jtext.getText();
				
				jtext.setText(copynum+num);
			}
		});
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = "2";
				String copynum = jtext.getText();
				
				jtext.setText(copynum+num);
			}
		});
		jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = "3";
				String copynum = jtext.getText();
				
				jtext.setText(copynum+num);
			}
		});
		jb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = "4";
				String copynum = jtext.getText();
				
				jtext.setText(copynum+num);
			}
		});
		jb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = "5";
				String copynum = jtext.getText();
				
				jtext.setText(copynum+num);
			}
		});
		jb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = "6";
				String copynum = jtext.getText();
				
				jtext.setText(copynum+num);
			}
		});
		jb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = "7";
				String copynum = jtext.getText();
				
				jtext.setText(copynum+num);
			}
		});
		jb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = "8";
				String copynum = jtext.getText();
				
				jtext.setText(copynum+num);
			}
		});
		jb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = "9";
				String copynum = jtext.getText();
				
				jtext.setText(copynum+num);
			}
		});
		jb0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = "0";
				String copynum = jtext.getText();
				
				jtext.setText(copynum+num);
			}
		});
		//OPERATIONS
		jbp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				first = Double.parseDouble(jtext.getText());
				jtext.setText("");
				operation = "p";
				}catch(Exception ee){
					
				}
			}
		});
		jbm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				first = Double.parseDouble(jtext.getText());
				jtext.setText("");
				operation = "m";
				}catch(Exception ee){
					
				}
			}
		});
		jbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				first = Double.parseDouble(jtext.getText());
				jtext.setText("");
				operation = "t";
				}catch(Exception ee){
					
				}
			}
		});
		jbd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				first = Double.parseDouble(jtext.getText());
				jtext.setText("");
				operation = "d";
				}catch(Exception ee){
					
				}
			}
		});
		//CLEAR
		jbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtext.setText("");
			}
		});
		//EQUALS
		jbe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				sec = Double.parseDouble(jtext.getText());
				double eq;
				if(operation == "p") {
					eq = first+sec;
					String equals = eq+"";
					jtext.setText(equals);
				}
				if(operation == "m") {
					eq = first-sec;
					String equals = eq+"";
					jtext.setText(equals);
				}if(operation == "t") {
					eq = first*sec;
					String equals = eq+"";
					jtext.setText(equals);
				}if(operation == "d") {
					eq = first/sec;
					String equals = eq+"";
					jtext.setText(equals);
				}
				}catch(Exception ee){
					
				}
			}
		});
		
		
		j.setSize(325,390);
		j.setVisible(true);
		

	}

}
