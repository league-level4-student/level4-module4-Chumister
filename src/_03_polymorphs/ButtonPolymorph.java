package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ButtonPolymorph extends Polymorph implements ActionListener {
	public int width = 80;
	public int height = 80;
	public JButton buttonOverlay = new JButton();
		ButtonPolymorph(int x, int y){
			super(x, y);
		}
		
		public void setWidth(int setter){
			width = setter;
		}
		public void setHeight(int setter){
			height = setter;
		}
		public int getWidth() {
			return width;
		}
		public int getHeight() {
			return height;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void draw(Graphics g) {
			// TODO Auto-generated method stub
			g.setColor(Color.red);
			g.fillRect(x, y, width, height);
			
		}
}
		