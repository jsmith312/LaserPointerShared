package model.commands;

import java.io.Serializable;

/**
 * Enum allows the server to create the drawable objects instead of the client
 * since android has trouble creating graphical java objects.
 * 
 * @author William Snider
 * 
 */
public enum Drawing implements Serializable {
    RECTANGLE, CIRCLE, TEXT, RECTANLE_FILLED, CIRCLE_FILLED;
}
