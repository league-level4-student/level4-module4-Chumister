package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class GreenPolymorph extends Polymorph{
	GreenPolymorph(int x, int y) {
		super(x, y);
	}

	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}
}
