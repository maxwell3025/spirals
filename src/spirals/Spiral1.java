 package spirals;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Spiral1 extends JFrame implements Runnable {
	public static double am = Math.PI;
	private double s = 0;

	public Spiral1() {
		setSize(1000, 1000);
		setVisible(true);

	}

	public void paint(Graphics g) {

		g.setColor(Color.black);
		g.fillRect((int) (Math.sin(s) * (Math.log(s) * 16)) + 500,
				(int) (Math.cos(s) * (Math.log(s) * 16)) + 500, 1, 1);
		g.setColor(Color.black);
		g.fillRect((int) (Math.sin(s + am) * (Math.log(s) * 16)) + 500,
				(int) (Math.cos(s + am) * (Math.log(s) * 16)) + 500, 1, 1);

	}

	public static void main(String[] args) {

		Spiral1 s = new Spiral1();
		new Thread(s).start();
	}

	public void run() {
		for (int d = 0; d < 100000; d++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			s = s + 0.01;
			repaint();
		}

	}

}
