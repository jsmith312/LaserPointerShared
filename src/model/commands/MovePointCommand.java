package model.commands;

/**
 * Command sent by the client will tell the server to move this user's pointer
 * across the screen by the indicated offset amount.
 * 
 * @author William Snider
 * 
 * @param <E>
 *            The server interface by which the command will be executed on.
 */
public class MovePointCommand<E extends ServerInterface> extends Command<E> {
    private static final long serialVersionUID = 3904909961513527319L;

    private float x;
    private float y;

    public MovePointCommand(String owner, float x, float y) {
	super(owner);
	this.x = x;
	this.y = y;
    }

    @Override
    public void execute(E executeOn) {
	executeOn.move(owner, x, y);
    }

}
