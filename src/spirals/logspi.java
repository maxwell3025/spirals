package spirals;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class logspi extends JFrame implements Runnable {
	double length = 0;
	double step = 0;
	int x = 500;
	int y = 500;
	int lx = 500;
	int ly = 500;

	public logspi() {
		setSize(1000, 1000);
		setVisible(true);
	}

	public void paint(Graphics g) {
		lx = x;
		ly = y;
		x = (int) (Math.sin(step) * length) + 500;
		y = (int) (Math.cos(step) * length) + 500;
		
		g.setColor(Color.BLACK);
		g.drawLine(x,y, lx, ly);
	}

	public static void main(String[] args) {
		logspi l = new logspi();
		new Thread(l).start();
	}

	public void run() {
		for (double i = 1.0625; i < 1000; i = i * 1.0005) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			length = i;
			step = step + 0.01;
			repaint();
		}

	}

}
