

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class canvas1 {
	static JFrame jf = new JFrame();
	private JPanel contentPane;

	private MyCanvas canvas= new MyCanvas();
	
	public static void main(String[] args) {
		canvas1 frame = new canvas1();
		jf.setVisible(true);
//		frame.set
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					
//					
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	public canvas1() {
		jf.setLayout(new BorderLayout(0, 0));
//		setSize(500,);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100, 100, 604, 420);
		jf.setResizable(false);
		
		jf.add("Center", canvas);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
		jf.setLocationRelativeTo(null);
		
	}
	private class MyCanvas extends Canvas{
		
		public void paint(Graphics g) {
			g.drawRect(50, 50, 100, 25);
		}
	}

}
