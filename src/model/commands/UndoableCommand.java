package model.commands;

/**
 * Command sent by the client will tell the server to revert to the last
 * undoable command instance. (Was never fully implemented)
 * 
 * @author William Snider
 * 
 * @param <E>
 *            The server interface by which the command will be executed on.
 */
public abstract class UndoableCommand<E extends ServerInterface> extends
	Command<E> {
    private static final long serialVersionUID = -6270184267543798234L;

    public UndoableCommand(String owner) {
	super(owner);
    }

    public abstract void undo(E undoOn);

}
