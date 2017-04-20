package model.commands;

/**
 * Command sent by the client will tell the server to change this user's color
 * to the color indicated.
 * 
 * @author William Snider
 * 
 * @param <E>
 *            The server interface by which the command will be executed on.
 */
public class ColorChange<E extends ServerInterface> extends Command<E> {

    private static final long serialVersionUID = -1616193688880433264L;

    private int red;
    private int green;
    private int blue;

    public ColorChange(String owner, int red, int green, int blue) {
	super(owner);
	this.red = red;
	this.green = green;
	this.blue = blue;
    }

    @Override
    public void execute(E executeOn) {
	executeOn.changeColor(owner, red, green, blue);
    }

}
