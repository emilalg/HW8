package org.example;

public class TimeUtils {

    public static int timeToSec(String time) {
        String[] part = time.split(":");
        int hh = Integer.parseInt(part[0]);
        int mm = Integer.parseInt(part[1]);
        int ss = Integer.parseInt(part[2]);

        return 3600 * hh + 60 * mm + ss;
    }

    public static String secToTime(int a) {
        if (a < 0 || a >= 86400) {
            return "-1";
        }

        int hh = a / 3600;
        int rem = a % 3600;
        int mm = rem / 60;
        int ss = rem % 60;

        String hourStr = String.format("%d", hh);
        String minStr = String.format("%02d", mm);
        String secStr = String.format("%02d", ss);

        return hourStr + ":" + minStr + ":" + secStr;
    }
}