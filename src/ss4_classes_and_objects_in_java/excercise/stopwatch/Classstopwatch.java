package ss4_classes_and_objects_in_java.excercise.stopwatch;

import java.util.Date;

public class Classstopwatch {
    public Date startTime;
    private Date endTime;


    public Classstopwatch() {
        startTime = new Date();
    }

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}
