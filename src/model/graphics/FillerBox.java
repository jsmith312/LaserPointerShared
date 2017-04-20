package model.graphics;

import java.awt.Graphics2D;
import java.awt.Point;

/**
 * A rectangular drawing object with a filling color.
 * 
 * @author William Snider
 * 
 */
public class FillerBox extends Drawable {

    private static final long serialVersionUID = 1666569766504442873L;

    public FillerBox(int x, int y, int width, int height, int R, int G, int B) {
	super(new Point(x, y), new Point(x + width, y + height), R, G, B);
    }

    @Override
    protected void drawCode(Graphics2D graphics) {
	graphics.fillRect(start.x, start.y, end.x - start.x, end.y - start.y);
    }

}
