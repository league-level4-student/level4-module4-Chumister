package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovmentMorph extends Polymorph{
	MovmentMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		set_x(get_x() + 1);
		set_y(get_y() + 1);
		g.setColor(Color.green);
		g.fillRect(get_x(), get_y(), get_width(), get_height());
	}
}
