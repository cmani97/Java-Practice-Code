package dev.code.basicGame;

import dev.code.basicGame.display.Display;

public class Launcher {

	public static void main(String[] args) {
//		new Game("Title", 400, 400);
		Game game = new Game("Title", 640, 360);
		game.start();

	}

}
