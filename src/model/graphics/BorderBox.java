package model.graphics;

import java.awt.Graphics2D;
import java.awt.Point;

/**
 * A rectangular drawing object without any filling color.
 * 
 * @author William Snider
 * 
 */
public class BorderBox extends Drawable {
    private static final long serialVersionUID = 5122065339371450796L;

    public BorderBox(int x, int y, int width, int height, int R, int G, int B) {
	super(new Point(x, y), new Point(x + width, y + height), R, G, B);
    }

    @Override
    protected void drawCode(Graphics2D graphics) {
	graphics.drawRect(start.x, start.y, end.x - start.x, end.y - start.y);
    }

    public String toString() {
	return "Start: " + start + " end: " + end + " color: " + getColor();
    }

}
