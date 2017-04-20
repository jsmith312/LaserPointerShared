package model.commands;

/**
 * Command sent by the client will tell the server to hide or unhide this user's
 * pointer depending on the boolean value set.
 * 
 * @author William Snider
 * 
 * @param <E>
 *            The server interface by which the command will be executed on.
 */
public class HideCommand<E extends ServerInterface> extends Command<E> {

    private static final long serialVersionUID = -3440590287766312957L;

    private boolean hide;

    public HideCommand(String owner, boolean hide) {
	super(owner);
	this.hide = hide;
    }

    @Override
    public void execute(E executeOn) {
	executeOn.erase(owner, hide);
    }

}
