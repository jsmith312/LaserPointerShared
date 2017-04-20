package model.commands;

/**
 * Command sent by the client will tell the server to print the indicated text to
 * the server console. Mainly used for debugging the server.
 * 
 * @author Jordan Smith
 * 
 * @param <E>
 *            The server interface by which the command will be executed on.
 */
public class PrintCommand<E extends ServerInterface> extends Command<E> {

    private static final long serialVersionUID = 4994792427848956609L;

    private String obj;

    public PrintCommand(String owner, String obj) {
	super(owner);
	this.obj = obj;
    }

    @Override
    public void execute(E executeOn) {
	System.out.println(obj);
    }

}
