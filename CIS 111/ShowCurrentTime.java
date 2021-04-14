//Help Received: page 53 in Java Book, copied code
public class ShowCurrentTime
{
  public static void main(String[] args)
  {
      long totalMilliseconds = System.currentTimeMillis();
      long totalSeconds = totalMilliseconds /1000; //converts totalMilliseconds into seconds
      long currentSecond = totalSeconds % 60; //gets remainder of all seconds / 60, 60 is used because 60 seconds in a min
      long totalMinutes = totalSeconds / 60; //same concept as above, converts seconds into mins
      long currentMinute = totalMinutes % 60; //gets remainder of all seconds / 60
      long totalHours = totalMinutes / 60; //all mins divided by 60, 60 mins in an hour
      long currentHour = totalHours % 24; //gets current hour by finding remainder of all hours / 24,

      System.out.print("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
  }

}
