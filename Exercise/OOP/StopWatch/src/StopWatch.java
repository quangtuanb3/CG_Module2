import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class StopWatch {
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
    private String startTime;
    private String endTime;

    public StopWatch() {
        this.startTime = LocalTime.now().format(formatter);
        this.endTime = LocalTime.now().format(formatter);
    }

    public StopWatch(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = LocalTime.now().format(formatter);
    }

    public void stop() {
        this.endTime = LocalTime.now().format(formatter);
    }

    public long getElapsedTime() {
        LocalTime endTime = LocalTime.parse(this.endTime, formatter);
        LocalTime startTime = LocalTime.parse(this.startTime, formatter);
        return (endTime.getHour() - startTime.getHour()) * 3600000L + (endTime.getMinute() - startTime.getMinute()) * 60000L + (endTime.getSecond() - startTime.getSecond()) * 60L + (endTime.getNano() - startTime.getNano()) / 1000000L;
    }
}
