package com.hackular.ld28prep;
//import org.newdawn.slick.*;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class GameTest extends BasicGame {

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.drawString("Hello world!!!", 100, 100);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer gc, int i) throws SlickException {
		// TODO Auto-generated method stub
		
	}
	
	public GameTest(String gamename) {
		super(gamename);

	}

}
