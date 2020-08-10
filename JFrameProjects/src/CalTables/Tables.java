package CalTables;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tables {

	private JFrame frame;
	private JTextField txtEnter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tables window = new Tables();
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
	public Tables() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 513, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 2, 3, 3));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JTextArea txtTabs = new JTextArea();
		txtTabs.setFont(new Font("Arial", Font.BOLD, 20));
		txtTabs.setLineWrap(true);
		panel.add(txtTabs, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(3, 1, 3, 3));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		txtEnter = new JTextField();
		txtEnter.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnter.setFont(new Font("Tahoma", Font.BOLD, 48));
		panel_2.add(txtEnter, BorderLayout.CENTER);
		txtEnter.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btnCalTable = new JButton("Cal Table");
		btnCalTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTabs.setText("");
				String str = txtEnter.getText();
				int number = Integer.parseInt(str);
				
				for(int i = 1;i <= 10; i++) {
					txtTabs.setText(txtTabs.getText()+"\n"+number+" x "+i+" = "+number*i);
				}
			}
		});
		btnCalTable.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel_3.add(btnCalTable, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 2, 3, 3));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTabs.setText(null);
				txtEnter.setText(null);
			}
			
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_5.add(btnClear, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "conform if u want to exit", "Cal Tables", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_6.add(btnExit, BorderLayout.CENTER);
	}

}
