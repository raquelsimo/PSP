
package es.psp.ut1.liftoff;

/**
* Once the countdown finishes the task is done
* 
*/
public class LiftOff implements Runnable {

    private int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "("
                + (countDown > 0 ? countDown : "LiftOff!") + "), ";
    }

    /**
     * This is a key method. Is called after the start process.
     */
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }
}
