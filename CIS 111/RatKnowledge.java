import java.util.*;

public class RatKnowledge {

    public static void main(String args[]) {
        Calendar d = new GregorianCalendar();
        Date today = new Date();
        d.set(Calendar.YEAR, 2018);
        d.set(Calendar.MONTH, 7); // 11 = december
        d.set(Calendar.DAY_OF_MONTH, 18);

        Date asARat = d.getTime();
        long difference = asARat.getTime() - today.getTime();
        difference = difference / (1000L*60L*60L*24L);
        System.out.println("How many days have we been rats? " + Math.abs(difference) + " (including today) ");

        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR, 2019);
        c.set(Calendar.MONTH, 1); // 11 = december
        c.set(Calendar.DAY_OF_MONTH, 2);

        Date breakout = c.getTime();
        long diff = breakout.getTime() - today.getTime();
        diff = diff / (1000L*60L*60L*24L);
        System.out.println("How many legitimate days until Breakout(not including Furlough days)? " + (diff - 29) + " (including today) ");

        Calendar f = new GregorianCalendar();
        f.set(Calendar.YEAR, 2018);
        f.set(Calendar.MONTH, 11); // 11 = december
        f.set(Calendar.DAY_OF_MONTH, 15);

        Date Christmas = f.getTime();
        long Diff = Christmas.getTime() - today.getTime();
        Diff = Diff / (1000L*60L*60L*24L);
        System.out.println("How many days until Christmas furlough? " + (Diff) + " (including today) ");

    }
}
