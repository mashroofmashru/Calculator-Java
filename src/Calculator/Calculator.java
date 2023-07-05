package Calculator;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Calculator implements ActionListener{
	
	//Initialization----------------
	
	JFrame jf;
	JLabel displayLabel;
	JButton firstButton;
	JButton secondButton;
	JButton thirdButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton zeroButton;
	JButton dotButton;
	JButton divButton;
	JButton multiButton;
	JButton subButton;
	JButton addButton;
	JButton equalButton;
	JButton clrButton;
	JButton delButton;
	boolean isoperatorClicked=false;
	double oldValue, newValue, result=0;
	int Operator=0;
	//Initialization------------------
	
	
	Font displayFont = new Font("",Font.BOLD,30);
	Font buttonFont = new Font("",Font.BOLD,20);
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(436, 389);
		jf.getContentPane().setBackground(Color.white);
		jf.setLocation(500, 250);
		jf.setResizable(false);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30,25,350,50);
		displayLabel.setFont(displayFont);
		displayLabel.setBackground(Color.white);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.black);
		jf.add(displayLabel);
		
		//numbers789----
		sevenButton=new JButton("7");
		sevenButton.setBounds(0, 150, 105, 50);
		sevenButton.setFont(buttonFont);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(105, 150, 105, 50);
		eightButton.setFont(buttonFont);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(210, 150, 105, 50);
		nineButton.setFont(buttonFont);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		//numbers456---
		fourButton=new JButton("4");
		fourButton.setBounds(0, 200, 105, 50);
		fourButton.setFont(buttonFont);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(105, 200, 105, 50);
		fiveButton.setFont(buttonFont);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(210, 200, 105, 50);
		sixButton.setFont(buttonFont);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		//numbers123----
		firstButton=new JButton("1");
		firstButton.setBounds(0, 250, 105, 50);
		firstButton.setFont(buttonFont);
		firstButton.addActionListener(this);
		jf.add(firstButton);
		
		secondButton=new JButton("2");
		secondButton.setBounds(105, 250, 105, 50);
		secondButton.setFont(buttonFont);
		secondButton.addActionListener(this);
		jf.add(secondButton);
		
		thirdButton=new JButton("3");
		thirdButton.setBounds(210, 250, 105, 50);
		thirdButton.setFont(buttonFont);
		thirdButton.addActionListener(this);
		jf.add(thirdButton);
		
		//pointZeroEqulato----
		dotButton=new JButton(".");
		dotButton.setBounds(0, 300, 105, 50);
		dotButton.setFont(buttonFont);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(105, 300, 105, 50);
		zeroButton.setFont(buttonFont);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		//operators-----
		divButton=new JButton("/");
		divButton.setBounds(315, 100, 105, 50);
		divButton.setFont(buttonFont);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		multiButton=new JButton("X");
		multiButton.setBounds(315, 150, 105, 50);
		multiButton.setFont(buttonFont);
		multiButton.addActionListener(this);
		jf.add(multiButton);
		
		subButton=new JButton("-");
		subButton.setBounds(315, 200, 105, 50);
		subButton.setFont(buttonFont);
		subButton.addActionListener(this);
		jf.add(subButton);
		
		addButton=new JButton("+");
		addButton.setBounds(315, 250, 105, 50);
		addButton.setFont(buttonFont);
		addButton.addActionListener(this);
		jf.add(addButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(210, 300, 210, 50);
		equalButton.setFont(buttonFont);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		//ClearAndDeleteButton--------
		clrButton=new JButton("Clear");
		clrButton.setBounds(0, 100, 157, 50);
		clrButton.setFont(buttonFont);
		clrButton.addActionListener(this);
		jf.add(clrButton);
		
		delButton=new JButton("Del");
		delButton.setBounds(157, 100, 158, 50);
		delButton.setFont(buttonFont);
		delButton.addActionListener(this);
		jf.add(delButton);
		
		//^buttons
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sevenButton) {
			displayLabel.setText(displayLabel.getText()+"7");
		
		}else if (e.getSource() == eightButton){
			displayLabel.setText(displayLabel.getText()+"8");
		
		}else if (e.getSource() == nineButton){
			displayLabel.setText(displayLabel.getText()+"9");
		
		}else if (e.getSource() == fourButton){
			displayLabel.setText(displayLabel.getText()+"4");
		
		}else if (e.getSource() == fiveButton){
			displayLabel.setText(displayLabel.getText()+"5");
		
		}else if (e.getSource() == sixButton){
			displayLabel.setText(displayLabel.getText()+"6");
		
		}else if (e.getSource() == firstButton){
			displayLabel.setText(displayLabel.getText()+"1");
		
		}else if (e.getSource() == secondButton){
			displayLabel.setText(displayLabel.getText()+"2");
		
		}else if (e.getSource() == thirdButton){
			displayLabel.setText(displayLabel.getText()+"3");
		
		}
		else if (e.getSource() == zeroButton){
			displayLabel.setText(displayLabel.getText()+"0");
		
		}else if (e.getSource() == dotButton){
			displayLabel.setText(displayLabel.getText()+".");
		
		}else if (e.getSource() == divButton){
			Operator=1;
			oldValue=Double.parseDouble(displayLabel.getText());
			displayLabel.setText("");
		
		}else if (e.getSource() == multiButton){
			Operator=2;
			oldValue=Double.parseDouble(displayLabel.getText());
			displayLabel.setText("");
		
		}else if (e.getSource() == subButton){
			Operator=3;
			oldValue=Double.parseDouble(displayLabel.getText());
			displayLabel.setText("");
		
		}else if (e.getSource() == addButton){
			Operator=4;
			oldValue=Double.parseDouble(displayLabel.getText());
			displayLabel.setText("");
		
		}else if (e.getSource() == equalButton){
			newValue=Double.parseDouble(displayLabel.getText());
			
			switch (Operator) {
			case 1: {
				result=oldValue/newValue;
				break;
				
			}
			case 2: {
				result=oldValue*newValue;
				break;
				
			}
			case 3: {
				result=oldValue-newValue;
				break;
				
			}
			case 4: {
				result=oldValue+newValue;
				break;
				
			}default:{
				result=newValue;
			}
			}
			displayLabel.setText(String.valueOf(result));
			oldValue=result;
		
		}else if (e.getSource() == clrButton){
			displayLabel.setText("");
		
		}else if (e.getSource() == delButton){
			String string=displayLabel.getText();
			displayLabel.setText("");
			for(int i=0; i<string.length()-1; i++) {
				displayLabel.setText(displayLabel.getText()+string.charAt(i));
			}
			
		
		}
		
	}

}
