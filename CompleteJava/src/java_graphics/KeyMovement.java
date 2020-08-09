package java_graphics;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class KeyMovement implements KeyListener
{
	public void keyPressed(KeyEvent ke)
	{
		System.out.println("key pressed");
	}
	public void keyReleased(KeyEvent ke)
	{
		System.out.println("key released");
	}
	public void keyTyped(KeyEvent ke)
	{
		System.out.println("key typed");
	}
	
	public static void main(String args[])
	{
		JFrame jf=new JFrame("key event");
		jf.setSize(400,400);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.addKeyListener(new KeyMovement());
		jf.setVisible(true);
	}
}
