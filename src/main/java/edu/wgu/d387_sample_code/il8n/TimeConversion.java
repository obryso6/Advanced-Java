package edu.wgu.d387_sample_code.il8n;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

    public static String getConvertedTimes(ZonedDateTime presentationTime) {
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("h:mm a");

        ZonedDateTime est = presentationTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime mst = presentationTime.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime utc = presentationTime.withZoneSameInstant(ZoneId.of("UTC"));

        return est.format(timeFormat) + " EST, " + mst.format(timeFormat) + " MST, " + utc.format(timeFormat) + " UTC";
    }
}
