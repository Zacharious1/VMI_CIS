import java.util.*;

public class HowManyDaysUntilChristmas {

    public static void main(String args[]) {

        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR, 2019);
        c.set(Calendar.MONTH, 1); // 11 = december
        c.set(Calendar.DAY_OF_MONTH, 2);

        Date breakout = c.getTime();
        Date today = new Date();
        long diff = breakout.getTime() - today.getTime();
        diff = diff / (1000L*60L*60L*24L);
        System.out.println("Days until Breakout: " + diff);
    }
}
