package bai_tap.ex03;

public class StopWatch {
//    Lớp này bao gồm:
//    Trường startTime và endTime là private với phương thức getter để trả về giá trị của startTime và endTime.
    private long startTime;
    private long stopTime;
    private boolean running = false;

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public StopWatch() {
    }

    public StopWatch(long startTime, long stopTime, boolean running) {
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.running = running;
    }

    public void start() {
        startTime = System.currentTimeMillis();
        running = true;
    };
    public void stop() {
        stopTime = System.currentTimeMillis();
        running = false;
    }
    public long getElapsedTime() {
        long elapsedTime;
        if(running)
            elapsedTime = System.currentTimeMillis() - startTime;
        else
            elapsedTime = stopTime - startTime;
        return elapsedTime;
    }
//    Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.
//    Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.
//    Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.
//    Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số millisecond giây
//    Vẽ sơ đồ UML cho lớp StopWatch và cài đặt lớp.
//    Viết chương trình đo thời gian thực thi của thuật toán đảo ngược mảng cho 1 mảng 100.000 số.
}
