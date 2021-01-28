package GCU.lab_1.time;

import java.util.StringTokenizer;

public class Time implements ITime{

    private int hour;
    private int minute;
    private boolean am;

    @Override
    public int getHour() {
        return hour;
    }

    @Override
    public int getMinute() {
        return minute;
    }

    @Override
    public boolean isAM() {
        return false;
    }

    @Override
    public boolean readTime(String inputTime) {
        StringTokenizer st = new StringTokenizer(inputTime, ": ");
        try {
            while (st.hasMoreElements()) {
                hour = Integer.parseInt((String) st.nextElement());
                minute = Integer.parseInt((String) st.nextElement());
                if ((0 > getHour()) || (getHour() > 12) ||
                        (0 > getMinute()) || (getMinute() > 59)) {
                    invalidate(); // private method to set default values
                    return false;
                }
                String ampm = (String) st.nextElement();
                if (ampm.equals("AM")) {
                    am = true;
                } else if (ampm.equals("PM")) {
                    am = false;
                } else {
                    invalidate();
                    return false;
                }
            }
        } catch (NumberFormatException e) {
            invalidate();
            return false;
        }
        return true;

    }

    private int invalidate() {
        return -1;
    }

    @Override
    public int subtractTime(ITime t) {
        int hour24 = hour;
        if (!isAm()) {
            hour24 += 12;
        }
        Time ta = (Time) t;
        int taHour24 = ta.getHour();
        if (!ta.isAm()) {
            taHour24 += 12;
        }
        return (hour24 - ta.getHour()) * 60 + (this.minute - ta.getMinute());


    }

    private boolean isAm() {
        return false;
    }
}
