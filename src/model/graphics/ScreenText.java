package model.graphics;

import java.awt.Graphics2D;
import java.awt.Point;

/**
 * A drawing object resembling a given string text.
 * 
 * @author William Snider
 * 
 */
public class ScreenText extends Drawable {
    private static final long serialVersionUID = 3663955948995538651L;

    private String text;

    public ScreenText(String text, int x, int y, int R, int G, int B) {
	super(new Point(x, y), null, R, G, B);
	this.text = text;
    }

    @Override
    public void drawCode(Graphics2D graphics) {
	graphics.drawString(text, start.x, start.y);
    }

}
