package model.commands;

/**
 * ServerInterface is just to make it so that the command objects can be
 * executed on any class that implements this interface without having to know
 * exactly what the class is.
 * 
 * @author William Snider
 */
public interface ServerInterface {
    public void send(Command<?> cmd);

    public void disconnect(String id);

    public void draw(String id, Drawing draw, int width, int height,
	    String extra);

    public void erase(String id, boolean hide);

    public void move(String id, float x, float y);

    public void changeColor(String id, int red, int green, int blue);

}
