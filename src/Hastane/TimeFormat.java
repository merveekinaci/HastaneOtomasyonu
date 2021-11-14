package Hastane;
import java.text.SimpleDateFormat;

public class TimeFormat {
    public static SimpleDateFormat LongTimeFormat() {
        return new SimpleDateFormat("yyyy-mm-dd ");
    }

    public static SimpleDateFormat ShortTimeFormat() {
        return new SimpleDateFormat("yyyy-mm-dd");
    }
}
