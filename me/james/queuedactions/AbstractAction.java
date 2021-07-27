
package me.james.queuedactions;

import java.util.Date;

/**
 * Abstract class for runnable actions
 */
public abstract class AbstractAction {

    static protected int ID;

    protected int id;
    protected Date created_at;
    protected Runnable action;

    /**
     * create a new action.
     * @param a A class implementing the Runnable interface
     */
    public AbstractAction(Runnable a)
    {
        this.id = AbstractAction.incrementId();
        this.created_at = new Date();
        this.action = a;
    }

    /**
     * Return the current ID and then increment it
     * @return int
     */
    static public int incrementId()
    {
        return AbstractAction.ID++;
    }

    /**
     * Method to invoke the action.
     */
    public abstract void run();
}