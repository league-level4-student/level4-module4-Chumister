package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	Polymorph bluePoly;
	Polymorph greenPoly;
	Polymorph movingPoly;
	Polymorph circlePoly;
	Polymorph mousePoly;
	Polymorph imagePoly;
	Polymorph buttonPoly;
	
	ArrayList<Polymorph> polys = new ArrayList<Polymorph>();

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		greenPoly = new GreenPolymorph(250, 100);
		movingPoly = new MovmentMorph(325, 50);
		bluePoly = new BluePolymorph(250, 50);
		circlePoly = new CircleMorph(300, 425);
		mousePoly = new MouseMorph(150, 100);
		imagePoly = new ImagePolymorph(300, 300);
		buttonPoly = new ButtonPolymorph(400, 200);
		
		
		polys.add(bluePoly);
		polys.add(greenPoly);
		polys.add(movingPoly);
		polys.add(circlePoly);
		polys.add(mousePoly);
		polys.add(imagePoly);
		polys.add(buttonPoly);
		
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (Polymorph pm : polys) {
			pm.draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph pm : polys) {
			pm.update();
		}
	}
}