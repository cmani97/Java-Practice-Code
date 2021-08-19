package path;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class DataStructure  {
	JFrame jf = new JFrame();
	private JPanel contentPane;
	private JPanel queueSec, arraySec, llSec, stackSec, sortSec, pfSec;
	private JPanel queueMainSec, pfMainSec;
	private JPanel mainSec ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new DataStructure();
					
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
		mainSec.removeAll();
		mainSec.add(panel);
		mainSec.repaint();
		mainSec.revalidate();
		
	}
	
	public DataStructure() {
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100, 100, 900, 700);
		jf.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		jf.setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 884, 58);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnArray = new JButton("Array");
		btnArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(arraySec);
			}
		});
		btnArray.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnArray.setBounds(10, 12, 102, 33);
		panel.add(btnArray);
		
		JButton btnLinkedList = new JButton("Linked List");
		btnLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(llSec);
			}
		});
		btnLinkedList.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnLinkedList.setBounds(115, 12, 118, 33);
		panel.add(btnLinkedList);
		
		JButton btnStack = new JButton("Stack");
		btnStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(stackSec);
			}
		});
		btnStack.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnStack.setBounds(236, 12, 102, 33);
		panel.add(btnStack);
		
		JButton btnQueue = new JButton("Queue");
		btnQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(queueSec);
			}
		});
		btnQueue.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnQueue.setBounds(341, 12, 102, 33);
		panel.add(btnQueue);
		
		JButton btnSort = new JButton("Sort");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(sortSec);
			}
		});
		btnSort.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnSort.setBounds(446, 12, 102, 33);
		panel.add(btnSort);
		
		JButton btnPathFindingAlgorithms = new JButton("Path Finding Algorithm");
		btnPathFindingAlgorithms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(pfSec);
			}
		});
		btnPathFindingAlgorithms.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnPathFindingAlgorithms.setBounds(551, 12, 195, 33);
		panel.add(btnPathFindingAlgorithms);
		
		mainSec = new JPanel();
		mainSec.setBackground(Color.BLACK);
		mainSec.setBounds(0, 61, 884, 600);
		contentPane.add(mainSec);
		mainSec.setLayout(new CardLayout(0, 0));
		
		arraySec = new JPanel();
		arraySec.setBackground(Color.BLACK);
		mainSec.add(arraySec, "name_392277625250100");
		arraySec.setLayout(null);
		
		JPanel arrayButPane = new JPanel();
		arrayButPane.setBounds(0, 0, 250, 600);
		arraySec.add(arrayButPane);
		arrayButPane.setLayout(null);
		
		JButton btnArray_1 = new JButton("array");
		btnArray_1.setBounds(59, 34, 89, 23);
		arrayButPane.add(btnArray_1);
		
		JPanel arrayMainSec = new JPanel();
		arrayMainSec.setBounds(253, 0, 631, 600);
		arraySec.add(arrayMainSec);
		
		llSec = new JPanel();
		llSec.setBackground(Color.BLACK);
		mainSec.add(llSec, "name_392282314023700");
		llSec.setLayout(null);
		
		JPanel llButPane = new JPanel();
		llButPane.setBounds(0, 0, 250, 600);
		llSec.add(llButPane);
		llButPane.setLayout(null);
		
		JButton btnLl = new JButton("ll");
		btnLl.setBounds(70, 39, 89, 23);
		llButPane.add(btnLl);
		
		JPanel llMainSec = new JPanel();
		llMainSec.setBounds(253, 0, 631, 600);
		llSec.add(llMainSec);
		
		stackSec = new JPanel();
		stackSec.setBackground(Color.BLACK);
		mainSec.add(stackSec, "name_392288174394500");
		stackSec.setLayout(null);
		
		JPanel stackButPane = new JPanel();
		stackButPane.setBounds(0, 0, 250, 600);
		stackSec.add(stackButPane);
		stackButPane.setLayout(null);
		
		JButton btnStack_1 = new JButton("stack");
		btnStack_1.setBounds(63, 56, 89, 23);
		stackButPane.add(btnStack_1);
		
		JPanel stackMainSec = new JPanel();
		stackMainSec.setBounds(253, 0, 631, 600);
		stackSec.add(stackMainSec);
		
		queueSec = new JPanel();
		queueSec.setBackground(Color.BLACK);
		mainSec.add(queueSec, "name_392293795550800");
		queueSec.setLayout(null);
		
		JPanel queueButPane = new JPanel();
		queueButPane.setBounds(0, 0, 250, 600);
		queueSec.add(queueButPane);
		queueButPane.setLayout(null);
		
		JButton btnQueue_1 = new JButton("queue");
		btnQueue_1.setBounds(65, 37, 89, 23);
		queueButPane.add(btnQueue_1);
		
		queueMainSec = new JPanel();
		queueMainSec.setBounds(253, 0, 631, 600);
		queueSec.add(queueMainSec);
		
		sortSec = new JPanel();
		sortSec.setBackground(Color.BLACK);
		mainSec.add(sortSec, "name_392314536111800");
		sortSec.setLayout(null);
		
		JPanel sortButPane = new JPanel();
		sortButPane.setBounds(0, 0, 250, 600);
		sortSec.add(sortButPane);
		sortButPane.setLayout(null);
		
		JButton btnQueue_1_1 = new JButton("sort");
		btnQueue_1_1.setBounds(93, 5, 63, 23);
		sortButPane.add(btnQueue_1_1);
		
		JPanel sortMainSec = new JPanel();
		sortMainSec.setBounds(253, 0, 631, 600);
		sortSec.add(sortMainSec);
		sortMainSec.setLayout(null);
		
		JButton btnSortMain = new JButton("sort main");
		btnSortMain.setBounds(28, 30, 89, 23);
		sortMainSec.add(btnSortMain);
		
		pfSec = new JPanel();
		pfSec.setBackground(Color.BLACK);
		mainSec.add(pfSec, "name_392318900228700");
		pfSec.setLayout(null);
		
		JPanel pfButPane = new JPanel();
		pfButPane.setBounds(0, 0, 250, 600);
		pfSec.add(pfButPane);
		pfButPane.setLayout(null);
		
		JButton btnQueue_1_2 = new JButton("pf");
		btnQueue_1_2.setBounds(64, 37, 89, 23);
		pfButPane.add(btnQueue_1_2);
		
		pfMainSec = new JPanel();
		pfMainSec.setBounds(253, 0, 631, 600);
		pfSec.add(pfMainSec);
		
	}
}
