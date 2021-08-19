package sortingVisualizer;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display extends Canvas implements Runnable{
	private Thread thread;
	private JFrame frame;
	private String title = "Sorting Visualizer";
	private int width = 1000;
	private int height = 600;
	private boolean running = false;
	public Display() {
		frame = new JFrame();
		Dimension size = new Dimension(width, height);
		this.setPreferredSize(size);
	}
	public synchronized void start() {
		running = true;
		thread = new Thread(this, "Display");
		thread.start();
	}
	public synchronized void stop() {
		running = false;
		try {
			thread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		long lastTime =  System.nanoTime();
		final double ns = 1000000000.0 /100;
		double delta = 0;
		
		while(running) {
			long now = System.nanoTime();
			delta += (now - lastTime)/ns;
			lastTime = now;
			update();
			render();
		}
	}
	private void render() {
		
	}
	public void update() {
		
	}
}
