package _03_polymorphs;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

public class MouseMorph extends Polymorph{
	MouseMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}

	@Override
	public void update() {
		x = (int) MouseInfo.getPointerInfo().getLocation().getX() - 50;
        y = (int) MouseInfo.getPointerInfo().getLocation().getY() - 50;
	}
}
