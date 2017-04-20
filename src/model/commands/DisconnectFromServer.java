package model.commands;

/**
 * Command sent by the client will tell the server that they are going to close
 * down allowing the server to safely disconnect them.
 * 
 * @author William Snider
 * 
 * @param <E>
 *            The server interface by which the command will be executed on.
 */
public class DisconnectFromServer<E extends ServerInterface> extends Command<E> {
    private static final long serialVersionUID = -5294524636609355491L;

    public DisconnectFromServer(String owner) {
	super(owner);
    }

    @Override
    public void execute(E executeOn) {
	executeOn.disconnect(owner);
    }

}
