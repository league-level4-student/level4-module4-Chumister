package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {
	int angle = 0;

	CircleMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(x, y, width, height);
	}

	@Override
	public void update() {
		angle += 1;
		x += (50 * Math.cos(angle));
		y += (50 * Math.sin(angle));
	}

	
}