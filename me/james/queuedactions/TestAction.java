package me.james.queuedactions;

public class TestAction extends AbstractAction {
    
    public TestAction(Runnable a) {
        super(a);
    }

    public void run()
    {
        this.action.run();
    }

}
