package java_graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class moveCar extends JFrame 
{
	private Image ground=new ImageIcon("images/ground.png").getImage();
	private Image car=new ImageIcon("images/car.png").getImage();
	//private Thread thread;
	private int carx=100;
	public moveCar()
	{
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,500);
		//setBackground(Color.black);
		
		addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent ke){}
			public void KeyReleased(KeyEvent ke){
				int id=ke.getKeyCode();
				if(id==KeyEvent.VK_LEFT)
					carx -=50;
				if(id==KeyEvent.VK_RIGHT)
					carx +=50;
				repaint();
			}
			public void KeyPresed(KeyEvent ke)
			{
				
			}
	
		});
		
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.cyan);
		g.fillRect(0,0,700,500);
		
		
		g.drawImage(car,carx,286,250,150,null);
		g.drawImage(ground,0,400,700,300,null);
		
	}
	
	public static void main(String args[])
	{
		moveCar sh=new moveCar();
		//System.out.println("hi");
	}
}
