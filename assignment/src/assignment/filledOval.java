package assignment;

import java.awt.Graphics;

public class filledOval implements GEShape{

	@Override
	public void drawShape(Graphics g, int x1, int x2, int y1, int y2) {
		int x = Math.min(x1, x2);
		int y = Math.min(y1,y2);
		int width = Math.abs(x1-x2);
		int height = Math.abs(y1-y2);
		g.fillOval(x,y,width,height);
		
	}

}
