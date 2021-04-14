import java.util.Scanner;
public class AnalyzeScores
{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double average = 0.0;
        int[] scores = new int[100];
        int counter = 0;
        int above = 0;
        int below = 0;
// inputs scores into the array
        for (int i = 0; i < 100; i++) {
            int score = a.nextInt();
            if (score != -1) {
                scores[i] = score;
                average+=score;
                counter++;
            }
            else break;
        }
        average = average / counter;
        for (int i = 0; i < counter; i++) {
            if (scores[i] >= average) {
                above += 1;
            }
            else below += 1;
        }
        System.out.println("Number of students at or above average: "+ above);
        System.out.println("Number of students below average: "+ below);
    }
}
