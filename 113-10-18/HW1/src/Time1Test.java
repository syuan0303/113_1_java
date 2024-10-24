public class Time1Test {
    public  static void main(String[]arge){import java.util.Scanner;

public class Time1 {
    private int hour; 
    private int minute;
    private int second; 

    public Time1(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("Second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0-23");
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Minute must be 0-59");
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("Second must be 0-59");
        this.second = second;
    }

 
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tick() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
    }

    public void printUniversal() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    public void printStandard() {
        System.out.printf("%d:%02d:%02d %s\n",
            ((hour == 0 || hour == 12) ? 12 : hour % 12),
            minute, second, (hour < 12 ? "AM" : "PM"));
    }
}

public class Time1Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Time1 time = new Time1(14, 5, 32);

        System.out.println("初始時間:");
        time.printUniversal();
        time.printStandard();

        System.out.print("輸入時間要過的秒數: ");
        int seconds = input.nextInt();

        for (int i = 0; i < seconds; i++) {
            time.tick();
        }


        System.out.println("\n時間經過後:");
        time.printUniversal();
        time.printStandard();

        input.close();
    }
}

        //Time1 time = new ...
        //呼叫printUniversal()
        //呼叫printStandard()
        //使用者輸入時間過了幾秒，用迴圈呼叫tick
        //呼叫printUniversal()
        //呼叫printStandard()
    }
}
