package java_graphics;

import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Ball
{
	private int fw,fh;
	private Random ran = new Random();
	private int x,y,diameter=25;
	private int speed = 0;
	private float red,green,blue;
	private boolean up=false,right=false;
//	public Ball(int frameWidth,int frameHeight)
//	{
//		fw = frameWidth;
//		fh = frameHeight;
//		x = ran.nextInt(fw.diameter);
//		y = ran.nextInt(fh.diameter);
//		speed = ran.nextInt(10);
//		up = ran.nextBoolean();
//		right = ran.nextBoolean();
//		red = ran.nextFloat();
//		blue = ran.nextFloat();
//		green = ran.nextFloat();
//	}
//	public void move ()
//	{
//		if(right) x += speed;
//		else x -= speed;
//		
//		if(up) y -= speed;
//		else y+= speed;
//		
//		if(x<0) right = true;
//		if(x>(fw.diameter)) right=false;
//		
//		if(y<0) up = false;
//		if(y>(fh.diameter)) up=true;
//		
//	}

}
