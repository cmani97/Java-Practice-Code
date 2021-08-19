package path;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ds extends JFrame {

	private JPanel contentPane;
	private JPanel subButtonsPane;
	private JPanel mainSec ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ds frame = new ds();
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
	
	public void switchPanel(JPanel panel) {
		subButtonsPane.removeAll();
		subButtonsPane.add(panel);
		
		
	}
	public ds() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 884, 58);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnArray = new JButton("Array");
		btnArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnArray.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnArray.setBounds(10, 12, 102, 33);
		panel.add(btnArray);
		
		JButton btnLinkedList = new JButton("Linked List");
		btnLinkedList.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnLinkedList.setBounds(115, 12, 118, 33);
		panel.add(btnLinkedList);
		
		JButton btnStack = new JButton("Stack");
		btnStack.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnStack.setBounds(236, 12, 102, 33);
		panel.add(btnStack);
		
		JButton btnQueue = new JButton("Queue");
		btnQueue.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnQueue.setBounds(341, 12, 102, 33);
		panel.add(btnQueue);
		
		JButton btnSort = new JButton("Sort");
		btnSort.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnSort.setBounds(446, 12, 102, 33);
		panel.add(btnSort);
		
		JButton btnPathFindingAlgorithms = new JButton("Path Finding Algorithm");
		btnPathFindingAlgorithms.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnPathFindingAlgorithms.setBounds(551, 12, 195, 33);
		panel.add(btnPathFindingAlgorithms);
		
		subButtonsPane = new JPanel();
		subButtonsPane.setBackground(Color.WHITE);
		subButtonsPane.setBounds(0, 61, 290, 600);
		contentPane.add(subButtonsPane);
		subButtonsPane.setLayout(new CardLayout(0, 0));
		
		JPanel arrayButtonPane = new JPanel();
		arrayButtonPane.setBackground(Color.WHITE);
		subButtonsPane.add(arrayButtonPane, "name_340320683019100");
		arrayButtonPane.setLayout(null);
		
		JLabel lblArray = new JLabel("Array");
		lblArray.setBounds(101, 81, 48, 14);
		arrayButtonPane.add(lblArray);
		
		JPanel llButtonPane = new JPanel();
		llButtonPane.setBackground(Color.WHITE);
		subButtonsPane.add(llButtonPane, "name_340329281026600");
		llButtonPane.setLayout(null);
		
		JLabel lblLinkedList = new JLabel("Linked List");
		lblLinkedList.setBounds(67, 60, 48, 14);
		llButtonPane.add(lblLinkedList);
		
		JPanel stackButtonPane = new JPanel();
		stackButtonPane.setBackground(Color.WHITE);
		subButtonsPane.add(stackButtonPane, "name_340333361051600");
		stackButtonPane.setLayout(null);
		
		JLabel lblStack = new JLabel("Stack");
		lblStack.setBounds(105, 80, 48, 14);
		stackButtonPane.add(lblStack);
		
		JPanel QueueButtonPane = new JPanel();
		QueueButtonPane.setBackground(Color.WHITE);
		subButtonsPane.add(QueueButtonPane, "name_340339039685500");
		QueueButtonPane.setLayout(null);
		
		JLabel lblQueue = new JLabel("Queue");
		lblQueue.setBounds(97, 73, 48, 14);
		QueueButtonPane.add(lblQueue);
		
		JPanel sortButtonPane = new JPanel();
		sortButtonPane.setBackground(Color.WHITE);
		subButtonsPane.add(sortButtonPane, "name_342616853294100");
		sortButtonPane.setLayout(null);
		
		JLabel lblSort = new JLabel("sort");
		lblSort.setBounds(88, 96, 48, 14);
		sortButtonPane.add(lblSort);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		comboBox.setBounds(62, 134, 131, 31);
		sortButtonPane.add(comboBox);
		
		JPanel pfButtonPane = new JPanel();
		pfButtonPane.setBackground(Color.WHITE);
		subButtonsPane.add(pfButtonPane, "name_342621037972100");
		pfButtonPane.setLayout(null);
		
		JLabel lblPathFinding = new JLabel("path finding");
		lblPathFinding.setBounds(82, 110, 48, 14);
		pfButtonPane.add(lblPathFinding);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("");
		comboBox_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		comboBox_1.setBounds(36, 51, 202, 31);
		pfButtonPane.add(comboBox_1);
		
		mainSec = new JPanel();
		mainSec.setBackground(Color.WHITE);
		mainSec.setBounds(293, 61, 591, 600);
		contentPane.add(mainSec);
		mainSec.setLayout(new CardLayout(0, 0));
		
		JPanel arraySec = new JPanel();
		mainSec.add(arraySec, "name_390480339585400");
		arraySec.setLayout(null);
		
		JLabel lblArray_1 = new JLabel("array");
		lblArray_1.setBounds(40, 63, 48, 14);
		arraySec.add(lblArray_1);
		
		JPanel llSec = new JPanel();
		mainSec.add(llSec, "name_390540083910200");
		llSec.setLayout(null);
		
		JLabel lblLl = new JLabel("ll");
		lblLl.setBounds(71, 78, 48, 14);
		llSec.add(lblLl);
		
		JPanel stackSec = new JPanel();
		mainSec.add(stackSec, "name_390592452580800");
		stackSec.setLayout(null);
		
		JLabel lblStack_1 = new JLabel("stack");
		lblStack_1.setBounds(10, 70, 48, 14);
		stackSec.add(lblStack_1);
		
		JPanel queueSec = new JPanel();
		mainSec.add(queueSec, "name_390597920480100");
		queueSec.setLayout(null);
		
		JLabel lblQueue_1 = new JLabel("queue");
		lblQueue_1.setBounds(62, 62, 48, 14);
		queueSec.add(lblQueue_1);
		
		JPanel sortSec = new JPanel();
		mainSec.add(sortSec, "name_390602841504100");
		sortSec.setLayout(null);
		
		JLabel lblSort_1 = new JLabel("sort");
		lblSort_1.setBounds(62, 74, 48, 14);
		sortSec.add(lblSort_1);
		
		JPanel pfSec = new JPanel();
		mainSec.add(pfSec, "name_390607594502100");
		pfSec.setLayout(null);
		
		JLabel lblPfAlgo = new JLabel("pf algo");
		lblPfAlgo.setBounds(90, 37, 48, 14);
		pfSec.add(lblPfAlgo);
			
		
	}
}
