import java.util.Scanner;
public class Grade {
    public static void printGrade(double score) {

        if (score >= 90)
            System.out.println('A');
        else if (score >= 80)
            System.out.println('B');
        else if (score >= 70)
            System.out.println('C');
        else if (score >= 60)
            System.out.println('D');
        else
            System.out.println('F');

    }    public static char returnGrade(double score) {

        char grade;
        if (score >= 90)
            grade = ('A');
        else if (score >= 80)
            grade = ('B');
        else if (score >= 70)
            grade = ('C');
        else if (score >= 60)
            grade = ('D');
        else
            grade = ('F');
return grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Score");
        double studentScore = sc.nextDouble();
        System.out.println("Grade of a student with score " + studentScore + " is " + returnGrade(studentScore));

    }



}
