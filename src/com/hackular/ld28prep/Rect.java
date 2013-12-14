package com.hackular.ld28prep;

import java.math.*;

import org.newdawn.slick.geom.*;

/**
 * An extension of Rectangle, adding loose collision detection.
 */
public class Rect extends Rectangle {
	private static final long serialVersionUID = 7471970362965002920L;


	public Rect(float x, float y, float width, float height) {
		super(x, y, width, height);
	}
	
	public boolean near(Rect other, float offset){
		
		final double a = getBoundingCircleRadius() + other.getBoundingCircleRadius();
	    final double dx = getX() - other.getX();
	    final double dy = getY() - other.getY();
	    return a * a > (dx * dx + dy * dy);
	}
}
