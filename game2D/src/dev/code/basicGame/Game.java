package dev.code.basicGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import dev.code.basicGame.display.Display;

public class Game implements Runnable {

	private Display display;
	private Thread thread;
	
	public String title;
	public int width, height;
	private boolean running = false; 
	
	private BufferStrategy bs;
	private Graphics g;
	
	private BufferedImage testImage;
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		
	}
	
	private void init() {
		display = new Display(title, width, height);
		testImage = ImageLoader.loadImage("test.png");
		
	}
	
	private void tick() {//update
		
	}
	
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return ;
		}
		g = bs.getDrawGraphics();
		// clear screen
		g.clearRect(0, 0, width, height);
		// draw here!
		
		g.drawImage(testImage, 20, 20, null);
		
		g.setColor(Color.green);
		g.fillRect(0, 0, 10, 10);
//		
//		g.setColor(Color.red);
//		g.fillRect(20, 20, 100, 100);
		
		
		
		//End Drawing!
		bs.show();
		g.dispose();
	}
	
	public void run() {
		
		init();
		while(running) {
			tick();
			render();
			 
		}
		 stop();
	}
	
	public synchronized void start() {
		if(running)
			return;
		running =true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
