package model.commands;

import java.io.Serializable;

/**
 * Command skeleton that all command will abide by allowing commands to be used
 * to execute code.
 * 
 * @author William Snider
 * 
 * @param <E>
 *            The server interface by which the command will be executed on.
 */
public abstract class Command<E extends ServerInterface> implements
	Serializable {
    /**
     * Identifies command object for this library
     */
    private static final long serialVersionUID = -5000273691410166428L;

    String owner;

    public Command(String owner) {
	this.owner = owner;
    }

    public abstract void execute(E executeOn);

    public String getOwner() {
	return owner;
    }

    public void setOwner(String id) {
	this.owner = id;
    }
}
