package caliculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Caliculator extends JFrame implements Caliculations {

	private JPanel contentPane;
	private JTextField txtCal;
	private JButton btnPercent;
	private JButton btnSqrt;
	private JButton x2;
	private JButton btnByX;
	private JButton btnCE;
	private JButton btnC;
	private JButton btnLess;
	private JButton btnDivide;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnMul;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnSub;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton bntAdd;
	private JButton btnAddSub;
	private JButton btn0;
	private JButton btnDot;
	private JButton bntEqual;
	private JLabel lbl_sub;
	
	private String sign;
	private boolean isDoule=false;
	private double toBeCaliculatedValue;

	private boolean isDecimal = false;
	private void storeToBeCaliculated(String sign)
	{
		
		
	}
	private void percentage(double a,double b)
	{
		switch(sign)
		{
			case "+":
				add((a+b)/100,a);
				break;
			case "-":
				substract((a-b)/100,a);
				break;
			case "*":
				multiply((a*b)/100,a);
				break;
			case "/":
				divide((a/b)/100,a);
				break;
				
		}
	}
	private void squareRoot(double a)
	{
		txtCal.setText(Double.toString(Math.sqrt(a)));
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caliculator frame = new Caliculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	/**
	 * Create the frame.
	 */
	public Caliculator() {
		setBackground(new Color(139, 0, 139));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 139, 139));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 288, 373);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtCal = new JTextField();
		txtCal.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		txtCal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCal.setToolTipText("");
		txtCal.setBounds(10, 11, 268, 55);
		panel.add(txtCal);
		txtCal.setColumns(10);
		
		JLabel lbl_sub = new JLabel("");
		lbl_sub.setForeground(new Color(255, 255, 255));
		lbl_sub.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_sub.setToolTipText("");
		lbl_sub.setFont(new Font("Sitka Text", Font.BOLD, 14));
		lbl_sub.setLabelFor(this);
		lbl_sub.setBounds(10, 77, 268, 32);
		panel.add(lbl_sub);
		
		btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lbl_sub.getText().length()>0 && txtCal.getText().length()>0)
				{
					toBeCaliculatedValue=Double.parseDouble((txtCal.getText()));
					percentage(Double.parseDouble(lbl_sub.getText().split(" ")[0]),toBeCaliculatedValue);
				}
			}
		});
		btnPercent.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnPercent.setBounds(10, 120, 59, 32);
		panel.add(btnPercent);
		
		btnSqrt = new JButton("Sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toBeCaliculatedValue=Double.parseDouble(txtCal.getText());
				squareRoot(toBeCaliculatedValue);
			}
		});
		btnSqrt.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnSqrt.setBounds(79, 120, 59, 32);
		panel.add(btnSqrt);
		
		x2 = new JButton("x2");
		x2.setFont(new Font("Sitka Text", Font.BOLD, 13));
		x2.setBounds(148, 120, 59, 32);
		panel.add(x2);
		
		btnByX = new JButton("1/x");
		btnByX.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnByX.setBounds(217, 120, 59, 32);
		panel.add(btnByX);
		
		btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCal.setText("");
			}
		});
		btnCE.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnCE.setBounds(10, 163, 59, 32);
		panel.add(btnCE);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCal.setText("");
				lbl_sub.setText("");
				
			}
		});
		btnC.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnC.setBounds(79, 163, 59, 32);
		panel.add(btnC);
		
		btnLess = new JButton("<--");
		btnLess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value=txtCal.getText();
				int length=value.length();
				if(length>0)
				{
					StringBuilder builder=new StringBuilder(value);
					builder.deleteCharAt(length-1);
					txtCal.setText(builder.toString());
				}
			}
		});
		btnLess.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnLess.setBounds(148, 163, 59, 32);
		panel.add(btnLess);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign="/";
				if(txtCal.getText().length()>0)
				{
					String value=txtCal.getText();
					toBeCaliculatedValue=Double.parseDouble(value);
					lbl_sub.setText(value+" "+sign);
					txtCal.setText("");
				}
				
			}
		});
		btnDivide.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnDivide.setBounds(217, 163, 59, 32);
		panel.add(btnDivide);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCal.setText(txtCal.getText()+"7");
			}
		});
		btn7.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btn7.setBounds(10, 206, 59, 32);
		panel.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCal.setText(txtCal.getText()+"8");
			}
		});
		btn8.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btn8.setBounds(79, 206, 59, 32);
		panel.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCal.setText(txtCal.getText()+"9");
			}
		});
		btn9.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btn9.setBounds(148, 206, 59, 32);
		panel.add(btn9);
		
		btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign="*";
				if(txtCal.getText().length()>0)
				{
					String value=txtCal.getText();
					toBeCaliculatedValue=Double.parseDouble(value);
					lbl_sub.setText(value+" "+sign);
					txtCal.setText("");
				}
					//storeToBeCaliculated(sign);
			}
		});
		btnMul.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnMul.setBounds(217, 206, 59, 32);
		panel.add(btnMul);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCal.setText(txtCal.getText()+"4");
			}
		});
		btn4.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btn4.setBounds(10, 249, 59, 32);
		panel.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCal.setText(txtCal.getText()+"5");
			}
		});
		btn5.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btn5.setBounds(79, 249, 59, 32);
		panel.add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCal.setText(txtCal.getText()+"6");
			}
		});
		btn6.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btn6.setBounds(148, 249, 59, 32);
		panel.add(btn6);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign="-";
				if(txtCal.getText().length()>0)
				{
					String value=txtCal.getText();
					toBeCaliculatedValue=Double.parseDouble(value);
					lbl_sub.setText(value+" "+sign);
					txtCal.setText("");
				}
					//storeToBeCaliculated(sign);
			}
		});
		btnSub.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnSub.setBounds(217, 249, 59, 32);
		panel.add(btnSub);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCal.setText(txtCal.getText()+"3");
			}
		});
		btn3.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btn3.setBounds(10, 292, 59, 32);
		panel.add(btn3);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCal.setText(txtCal.getText()+"2");
			}
		});
		btn2.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btn2.setBounds(79, 292, 59, 32);
		panel.add(btn2);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCal.setText(txtCal.getText()+"1");
			}
		});
		btn1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btn1.setBounds(148, 292, 59, 32);
		panel.add(btn1);
		
		bntAdd = new JButton("+");
		bntAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign="+";
				if(txtCal.getText().length()>0)
				{
					String value=txtCal.getText();
					toBeCaliculatedValue=Double.parseDouble(value);
					lbl_sub.setText(value+" "+sign);
					txtCal.setText("");
				}
					//storeToBeCaliculated(sign);
			}
		});
		bntAdd.setFont(new Font("Sitka Text", Font.BOLD, 13));
		bntAdd.setBounds(217, 292, 59, 32);
		panel.add(bntAdd);
		
		btnAddSub = new JButton("+-");
		btnAddSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value=txtCal.getText();
				if(!value.contains("-"))
				{
					txtCal.setText("-"+value);
				}
				else
				{
					try
					{
						txtCal.setText(value.split("-")[1]);
					}catch(IndexOutOfBoundsException ibe)
					{
						txtCal.setText("");
					}
				}
			}
		});
		btnAddSub.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnAddSub.setBounds(10, 330, 59, 32);
		panel.add(btnAddSub);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCal.setText(txtCal.getText()+"0");
			}
		});
		btn0.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btn0.setBounds(79, 330, 59, 32);
		panel.add(btn0);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isDecimal)
				{
					txtCal.setText(txtCal.getText()+".");
					isDecimal=true;
				}
				
			}
		});
		btnDot.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnDot.setBounds(148, 330, 59, 32);
		panel.add(btnDot);
		
		bntEqual = new JButton("=");
		bntEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtCal.getText().length()>0)
				{
					double d=Double.parseDouble(txtCal.getText());
					switch(sign)
					{
					case "+":
						add(toBeCaliculatedValue,d);
						break;
					case "-":
						substract(toBeCaliculatedValue,d);
						break;
					case "*":
						multiply(toBeCaliculatedValue,d);
						break;
					case "/":
						divide(toBeCaliculatedValue,d);
						break;
						
					}
				}
				
			}
		});
		bntEqual.setFont(new Font("Sitka Text", Font.BOLD, 13));
		bntEqual.setBounds(217, 330, 59, 32);
		panel.add(bntEqual);
	}
	@Override
	public void add(double a,double b) {
		// TODO Auto-generated method stub
		setResult(a+b);
		
	}
	@Override
	public void substract(double a,double b) {
		// TODO Auto-generated method stub
		setResult(a-b);
	}
	@Override
	public void multiply(double a,double b) {
		// TODO Auto-generated method stub
		setResult(a*b);
	}
	@Override
	public void divide(double a,double b) {
		// TODO Auto-generated method stub
		setResult(a/b);
	}
	private void setResult(double result)
	{
		txtCal.setText(Double.toString(result));
		lbl_sub.setText("");
	}
}
