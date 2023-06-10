public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        String startTime = stopWatch.getStartTime();
        System.out.println(startTime);
        Thread.sleep(500);
        System.out.println("End");
        stopWatch.stop();
        String endTime = stopWatch.getStartTime();
        System.out.println(endTime);
        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println(elapsedTime);

    }
}