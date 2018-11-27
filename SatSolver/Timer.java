/**
 * 20 Kasım 2018 Sali
 *
 *  GTu Biztalk Proje Grup 1
 *      SatSolver Timer
 */

public class Timer{

    private long startTime;
    private long endTime; //timer variables

    public void start() { // sets variable to current time
        startTime = System.currentTimeMillis();
    }

    public void stop() { // sets variable to current time
        endTime = System.currentTimeMillis();
    }

    public long getDuration() { //calculates total time in seconds and sets it to variable
        return (endTime - startTime) / 1000;
    } //total run time
}
