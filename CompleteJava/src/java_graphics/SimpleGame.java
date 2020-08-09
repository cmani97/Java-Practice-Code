package java_graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGame extends JFrame implements KeyListener,Runnable
{
	private int frameWidth=700,frameHeight=500;
	private Thread thread=null;
	private int paddleX=300,paddleY=400;
	private int paddleWidth=150,paddleHeight=25;
	private int bollX=350,bollY=350;
	private int bollDiameter=25;
	private boolean up=false,right=true;
	
	public SimpleGame()
	{
		setBounds(100,100,frameWidth,frameHeight);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,500);
		addKeyListener(this);
		thread=new Thread(this);
		thread.start();
	}
	
	public void run()
	{
		while(true)
		{
			if(up) bollY --;
			else bollY ++;
			
			if(right) bollX++;
			else bollX --;
			
			if(bollX<0) right=true;
			if(bollX > (frameWidth-bollDiameter)) right=false;
			
			if(bollY<0) up=false;
			if(bollY > (frameHeight-bollDiameter)) up=true;
			
			if(bollX > paddleX && bollX<(paddleX+paddleWidth) && bollY>(paddleY-bollDiameter))  up=true;
			
			try
			{
				Thread.sleep(5);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			repaint();
		}
	}
	
	public void keyTyped(KeyEvent ke){}
	public void keyReleased(KeyEvent ke){}
	public void keyPressed(KeyEvent ke){
		int id = ke.getKeyCode();
		if(id==KeyEvent.VK_LEFT) paddleX -= 10;
		if(id==KeyEvent.VK_RIGHT) paddleX +=10;
		repaint();
	}
	
	
	public void paint(Graphics g)
	{
		g.setColor(Color.cyan);
		g.fillRect(0,0,frameWidth,frameHeight);
		
		g.setColor(Color.green);
		g.fillRect(paddleX,paddleY,paddleWidth,paddleHeight);
		
		g.setColor(Color.red);
		g.fillOval(bollX,bollY,bollDiameter,bollDiameter);
	}
	
	public static void main(String args[])
	{
		SimpleGame sg=new SimpleGame();
	}
}
