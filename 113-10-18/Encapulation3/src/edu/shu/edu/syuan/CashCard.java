import java.util.Scanner;

public class Time1 {
    private int hour;  
    private int minute; 
    private int second; 


    public Time1(int hour, int minute, int second) {
        this.hour = adjustTime(hour, 0, 23, "hour");
        this.minute = adjustTime(minute, 0, 59, "minute");
        this.second = adjustTime(second, 0, 59, "second");
    }


    private int adjustTime(int value, int min, int max, String timeType) {
        if (value < min || value > max) {
            System.out.printf("Invalid %s. Resetting to %d.%n", timeType, min);
            return min;
        }
        return value;
    }


    public void setHour(int hour) {
        this.hour = adjustTime(hour, 0, 23, "hour");
    }

    public void setMinute(int minute) {
        this.minute = adjustTime(minute, 0, 59, "minute");
    }

    public void setSecond(int second) {
        this.second = adjustTime(second, 0, 59, "second");
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


        System.out.println("Initial time:");
        time.printUniversal();
        time.printStandard();


        System.out.print("Enter the number of seconds to pass: ");
        int seconds = input.nextInt();


        for (int i = 0; i < seconds; i++) {
            time.tick();
        }

        System.out.println("\nTime after ticking:");
        time.printUniversal();
        time.printStandard();

        input.close();
    }
}
