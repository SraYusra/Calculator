package calulators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 294, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(21, 28, 227, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
/*-------------------------------Number Buttons-------------------------------*/
		
		JButton btn7 = new JButton("7");
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				String enterNumber = textField.getText() + btn7.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn7.setBounds(21, 89, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				String enterNumber = textField.getText() + btn1.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn1.setBounds(21, 211, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				String enterNumber = textField.getText() + btn4.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn4.setBounds(21, 150, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				String enterNumber = textField.getText() + btn5.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn5.setBounds(81, 150, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				String enterNumber = textField.getText() + btn2.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn2.setBounds(81, 211, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				String enterNumber = textField.getText() + btn3.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn3.setBounds(141, 211, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				String enterNumber = textField.getText() + btn6.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn6.setBounds(141, 150, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				String enterNumber = textField.getText() + btn8.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn8.setBounds(81, 89, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				String enterNumber = textField.getText() + btn9.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn9.setBounds(141, 89, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				String enterNumber = textField.getText() + btn0.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn0.setBounds(21, 272, 50, 50);
		frame.getContentPane().add(btn0);

/*-----------------------------------Operation Buttons----------------------------------*/		

		JButton btnS = new JButton("-");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
				
			}
		});
		btnS.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnS.setBounds(201, 89, 50, 50);
		frame.getContentPane().add(btnS);
		
		JButton btnP = new JButton("+");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
				
			}
		});
		btnP.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnP.setBounds(201, 150, 50, 50);
		frame.getContentPane().add(btnP);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "x";
				
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnX.setBounds(81, 272, 50, 50);
		frame.getContentPane().add(btnX);
				
		JButton btnD = new JButton("\u00F7");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "\u00F7";
				
			}
		});
		btnD.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnD.setBounds(141, 272, 50, 50);
		frame.getContentPane().add(btnD);
		
		JButton btnEQ = new JButton("=");
		btnEQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				
				if(operations=="+"){
					
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);		
				
				}else if(operations=="-"){
					
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);		
					
				}else if(operations=="x"){

					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);		

				}else if(operations=="\u00F7"){

					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);		

				}
				
			
			}
		});
		btnEQ.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnEQ.setBounds(201, 272, 50, 50);
		frame.getContentPane().add(btnEQ);
		
		JButton btnC = new JButton("C"); 
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBounds(201, 211, 50, 50);
		frame.getContentPane().add(btnC);
	}
}
