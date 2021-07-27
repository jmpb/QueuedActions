import me.james.queuedactions.*;

public class Main {
    public static void main(String[] args) {
        
        //create a runnable - would usually be another class implementing runnable
        Runnable r = new Runnable(){
            public void run() {System.out.println("Testing!");}
        };
        //pass the runnable to an action wrapper
        TestAction t = new TestAction(r);

        //run!
        t.run();
    }
}
