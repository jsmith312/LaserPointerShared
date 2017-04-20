package model.graphics;

import java.awt.Graphics2D;
import java.awt.Point;

/**
 * A circular drawing object without any filling color.
 * 
 * @author William Snider
 * 
 */
public class HollowDot extends Drawable {

    private static final long serialVersionUID = 4550602467089847407L;

    private int width;
    private int height;

    public HollowDot(int x, int y, int width, int height, int R, int G, int B) {
	super(new Point(x, y), null, R, G, B);
	this.width = width;
	this.height = height;
    }

    @Override
    protected void drawCode(Graphics2D graphics) {
	graphics.drawOval(start.x, start.y, width, height);
    }

}
