package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	int x;
	int y;
	int width = 40;
	int height = 40;

	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getwidth() {
		return width;
	}

	public void setwidth(int width) {
		this.width = width;
	}
	
	public int getheight() {
		return height;
	}

	public void setheight(int height) {
		this.height = height;
	}

	public void update() {

	}

	public abstract void draw(Graphics g);
}
