package com.hackular.ld28prep;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 * @author aramande
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
			AppGameContainer appgc;
			appgc = new AppGameContainer(new GameTest("Simple Slick Game"));
			appgc.setDisplayMode(640, 480, false);
			appgc.start();
		}
		catch (SlickException ex)
		{
			Logger.getLogger(GameTest.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
