package model.extra;

import java.io.Serializable;

/**
 * Simple object for allowing easy storage of color intensity values between the
 * desktop application and the android app.
 * 
 * @author William Snider
 * 
 */
public class ColorPoint implements Serializable {

    private static final long serialVersionUID = -3194973832903645483L;

    private int red;
    private int green;
    private int blue;

    public ColorPoint(int red, int green, int blue) {
	setRed(red);
	setGreen(green);
	setBlue(blue);
    }

    public void setBlue(int blue) {
	this.blue = blue;
    }

    public void setGreen(int green) {
	this.green = green;
    }

    public void setRed(int red) {
	this.red = red;
    }

    public int getRed() {
	return red;
    }

    public int getGreen() {
	return green;
    }

    public int getBlue() {
	return blue;
    }
}
