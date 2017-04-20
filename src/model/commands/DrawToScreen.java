package model.commands;

/**
 * Command sent by the client will tell the server to draw a particular object
 * and replace it's current pointer with the new one.
 * 
 * @author William Snider
 * 
 * @param <E>
 *            The server interface by which the command will be executed on.
 */
public class DrawToScreen<E extends ServerInterface> extends Command<E> {
    private static final long serialVersionUID = 206121660166795683L;

    private Drawing draw;
    private int width;
    private int height;
    private String extra;

    public DrawToScreen(String owner, Drawing draw, int width, int height,
	    String extra) {
	super(owner);
	this.draw = draw;
	this.width = width;
	this.height = height;
	this.extra = extra;
    }

    @Override
    public void execute(E executeOn) {
	executeOn.draw(owner, draw, width, height, extra);
    }

}
