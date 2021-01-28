package GCU.lab_1.time;

public interface ITime {
    int getHour();
    int getMinute();
    boolean isAM();
    boolean readTime(String inputTime);
    int subtractTime(ITime t);
}
