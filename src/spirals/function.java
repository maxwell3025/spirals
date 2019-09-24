package spirals;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class function extends JFrame{

	public function() {
		setSize(1000, 1000);
		setVisible(true);
	}
	public void paint(Graphics g){
		for(int x = -200; x <200; x++){
			for(int y = -200; y <200; y++){
				for(int z = -200; z <200; z++){
					if(x*x+y*y+ z*z<100){
						g.setColor(new Color((int)((double)(z+200)/2), 0,0 ));
						g.fillRect((int)(x*10+z*4+200), (int)(y*10+z*6+200), z, z);
					}
				} 
			}
		}
		
	}
	public static void main(String[] args) {
		function f = new function();

	}

}
