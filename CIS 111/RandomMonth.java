//Help Received: None
import java.lang.Math;
public class RandomMonth{
    public static void main(String[] args){
        String[] Months = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};
        int a = 1 + (int) (Math.random() * 12);
        System.out.print(Months[a]);
    }
}
