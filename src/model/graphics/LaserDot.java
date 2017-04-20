package model.graphics;

import java.awt.Graphics2D;
import java.awt.Point;

/**
 * A circular drawing object with a filling color.
 * 
 * @author William Snider
 * 
 */
public class LaserDot extends Drawable {

    private static final long serialVersionUID = -7455041225962438497L;

    private int width;
    private int height;

    public LaserDot(int x, int y, int width, int height, int R, int G, int B) {
	super(new Point(x, y), null, R, G, B);
	this.width = width;
	this.height = height;
    }

    @Override
    protected void drawCode(Graphics2D graphics) {
	graphics.fillOval(start.x, start.y, width, height);
    }

}
