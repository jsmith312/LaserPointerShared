package model.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.io.Serializable;

/**
 * Common interface that all drawable objects will abide by, allowing serveral
 * objects to be guaranteed to draw to the screen without having to know exactly
 * what the object is.
 * 
 * @author William Snider
 * 
 */
public abstract class Drawable implements Serializable {
    private static final long serialVersionUID = 6319233489553953820L;

    protected Point start;
    protected Point end;
    protected Color color;
    protected boolean isHidden = false;

    public Drawable(Point start, Point end, int R, int G, int B) {
	setLocation(start, end);
	setColor(R, G, B);
    }

    public void setHidden(boolean hide) {
	this.isHidden = hide;
    }

    public void setLocation(Point start, Point end) {
	this.start = start;
	this.end = end;
    }

    public Point getStartLocation() {
	return start;
    }

    public Point getEndLocation() {
	return end;
    }

    public void setColor(int R, int G, int B) {
	this.color = new Color(R, G, B);
    }

    public Color getColor() {
	return color;
    }

    protected abstract void drawCode(Graphics2D graphics);

    public void draw(Graphics graphics) {
	Graphics2D g = (Graphics2D) graphics;

	Color oldColor = g.getColor();

	g.setColor(color);

	if (!isHidden) {
	    this.drawCode(g);
	}

	g.setColor(oldColor);
    }

    public void addPosition(int x, int y) {
	if (start != null) {
	    start.translate(x, y);
	}

	if (end != null) {
	    end.translate(x, y);
	}
    }

    public boolean isSimilarColor(Color b, double minPercentDiff) {
	int dr = b.getRed() - color.getRed();
	int dg = b.getGreen() - color.getGreen();
	int db = b.getBlue() - color.getBlue();

	double distance = Math.sqrt(dr * dr + dg * dg + db * db);
	double percent = (distance / Math.sqrt(255 * 255 + 255 * 255 + 255
		* 255)) * 100;

	return (percent > minPercentDiff) ? true : false;
    }

}
