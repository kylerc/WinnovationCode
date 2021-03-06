/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.winnovation.motions;

/**
 *
 * @author Chris
 */
public class WaitMotion implements Motion{

    private long targetTime;
    private boolean aborted;

    public WaitMotion(double seconds) {
        aborted = false;
        targetTime = System.currentTimeMillis() + (long) (1000*seconds);
    }

    public boolean isDone() {
        return aborted || System.currentTimeMillis() >= targetTime;
    }


    public void doMotion() {
        // do nothing
    }

    public void abort() {
        aborted = true;
    }

}
