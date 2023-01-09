package ch06;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Iterator;
import java.util.Random;

public class MyFrame extends MFrame{

	Random r;
	
	public MyFrame() {
		super(500,500,Color.white,false);
		r = new Random();
	}

	public void paint(Graphics g) {
		for (int i = 0; i < 100; i++) {
			g.setColor(rColor());
			int x = r.nextInt(500);
			int y = r.nextInt(500);
			int w = r.nextInt(10)+5;
			int h = r.nextInt(10)+5;
			g.fillRect(x,y,w,h);		
			try {
				Thread.sleep(50);
			} catch (Exception e) {
			}
		}
	}
	public Color rColor() {
		return new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
