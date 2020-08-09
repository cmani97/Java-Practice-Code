package java_graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouseFace extends JFrame implements MouseListener,Runnable
{
	private int frameWidth=700,frameHeight=500;
	private Image f1=new ImageIcon("images/face1.png").getImage();
	private Image f2=new ImageIcon("images/face2.png").getImage();
	private Image image=new ImageIcon("logo.png").getImage();
	private boolean isLaugh=false;
	
	
	public mouseFace()
	{
		setBounds(100,100,frameWidth,frameHeight);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
	}
	public void run() {}
	public void mouseClicked(MouseEvent me) {}
	public void mousePressed(MouseEvent me) {
		if(me.getX()>250 && me.getX()<(250+200) && me.getY()>250 && me.getY()<(250+150))
			isLaugh=true;
		repaint();
	}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.cyan);
		g.fillRect(0,0,frameWidth,frameHeight);
		//g.drawImage(image,250,200,null);
		
		if(isLaugh)
		{
			g.setColor(Color.red);
			//g.drawImage(f1,100,100,400,300,null);
			g.fillRect(100, 100, 100, 100);
		}
		else
		{
			g.setColor(Color.red);
			//g.drawImage(f2,100,100,400,300,null);
			g.fillOval(100, 100, 100, 100);
		}
	}
	
	
	public static void main(String args[])
	{
		mouseFace mm=new mouseFace();
		//System.out.println("hi");
	}
	
	
}
