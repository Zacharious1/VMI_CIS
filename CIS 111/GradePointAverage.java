import java.util.Scanner;

public class GradePointAverage {
    public static void main(String[] args) {
        Scanner c1 = new Scanner(System.in);
        Scanner c2 = new Scanner(System.in);
        Scanner c3 = new Scanner(System.in);
        Scanner c4 = new Scanner(System.in);
        Scanner c5 = new Scanner(System.in);
        Scanner c6 = new Scanner(System.in);
        Scanner c7 = new Scanner(System.in);
        Scanner c8 = new Scanner(System.in);
        Scanner c9 = new Scanner(System.in);
        Scanner c10 = new Scanner(System.in);

        System.out.print("Enter your first class: ");
        String class1 = c1.nextLine();
        System.out.print("Enter credit hours: ");
        int creditHourC1 = c6.nextInt();
        System.out.print("Enter grade earned: ");
        String gradeC1 = c1.nextLine();
        int gradeNumberC1 = 0;
        char letterGradeC1 = gradeC1.charAt(0);
        if (letterGradeC1 == 'A' || letterGradeC1 == 'a') {
            gradeNumberC1 = 4 * creditHourC1;
        } else if (letterGradeC1 == 'B' || letterGradeC1 == 'b') {
            gradeNumberC1 = 3 * creditHourC1;
        } else if (letterGradeC1 == 'C' || letterGradeC1 == 'c') {
            gradeNumberC1 = 2 * creditHourC1;
        } else if (letterGradeC1 == 'D' || letterGradeC1 == 'd') {
            gradeNumberC1 = 1 * creditHourC1;
        } else if (letterGradeC1 == 'F' || letterGradeC1 == 'f') {
            gradeNumberC1 = 0 * creditHourC1;
        } else {
            System.out.print("Error: Invalid Input");
            System.exit(0);
        }

        System.out.println(" ");
        System.out.print("Enter your second class: ");
        String class2 = c2.nextLine();
        System.out.print("Enter credit hours: ");
        int creditHourC2 = c7.nextInt();
        System.out.print("Enter grade earned: ");
        String gradeC2 = c2.nextLine();
        int gradeNumberC2 = 0;
        char letterGradeC2 = gradeC2.charAt(0);
        if (letterGradeC2 == 'A' || letterGradeC2 == 'a') {
            gradeNumberC2 = 4 * creditHourC2;
        } else if (letterGradeC2 == 'B' || letterGradeC2 == 'b') {
            gradeNumberC2 = 3 * creditHourC2;
        } else if (letterGradeC2 == 'C' || letterGradeC2 == 'c') {
            gradeNumberC2 = 2 * creditHourC2;
        } else if (letterGradeC2 == 'D' || letterGradeC2 == 'd') {
            gradeNumberC2 = 1 * creditHourC2;
        } else if (letterGradeC2 == 'F' || letterGradeC2 == 'f') {
            gradeNumberC2 = 0 * creditHourC2;
        } else {
            System.out.print("Error: Invalid Input");
            System.exit(0);
        }

        System.out.println(" ");
        System.out.print("Enter your third class: ");
        String class3 = c3.nextLine();
        System.out.print("Enter credit hours: ");
        int creditHourC3 = c8.nextInt();
        System.out.print("Enter grade earned: ");
        String gradeC3 = c3.nextLine();
        int gradeNumberC3 = 0;
        char letterGradeC3 = gradeC3.charAt(0);
        if (letterGradeC3 == 'A' || letterGradeC3 == 'a') {
            gradeNumberC3 = 4 * creditHourC3;
        } else if (letterGradeC3 == 'B' || letterGradeC3 == 'b') {
            gradeNumberC3 = 3 * creditHourC3;
        } else if (letterGradeC3 == 'C' || letterGradeC3 == 'c') {
            gradeNumberC3 = 2 * creditHourC3;
        } else if (letterGradeC3 == 'D' || letterGradeC3 == 'd') {
            gradeNumberC3 = 1 * creditHourC3;
        } else if (letterGradeC3 == 'F' || letterGradeC3 == 'f') {
            gradeNumberC3 = 0 * creditHourC3;
        } else {
            System.out.print("Error: Invalid Input");
            System.exit(0);
        }

        System.out.println(" ");
        System.out.print("Enter your fourth class: ");
        String class4 = c4.nextLine();
        System.out.print("Enter credit hours: ");
        int creditHourC4 = c9.nextInt();
        System.out.print("Enter grade earned: ");
        String gradeC4 = c4.nextLine();
        int gradeNumberC4 = 0;
        char letterGradeC4 = gradeC4.charAt(0);
        if (letterGradeC4 == 'A' || letterGradeC4 == 'a') {
            gradeNumberC4 = 4 * creditHourC4;
        } else if (letterGradeC4 == 'B' || letterGradeC4 == 'b') {
            gradeNumberC4 = 3 * creditHourC4;
        } else if (letterGradeC4 == 'C' || letterGradeC4 == 'c') {
            gradeNumberC4 = 2 * creditHourC4;
        } else if (letterGradeC4 == 'D' || letterGradeC4 == 'd') {
            gradeNumberC4 = 1 * creditHourC4;
        } else if (letterGradeC4 == 'F' || letterGradeC4 == 'f') {
            gradeNumberC4 = 0 * creditHourC4;
        } else {
            System.out.print("Error: Invalid Input");
            System.exit(0);
        }

        System.out.println(" ");
        System.out.print("Enter your fifth class: ");
        String class5 = c5.nextLine();
        System.out.print("Enter credit hours: ");
        int creditHourC5 = c10.nextInt();
        System.out.print("Enter grade earned: ");
        String gradeC5 = c5.nextLine();
        int gradeNumberC5 = 0;
        char letterGradeC5 = gradeC5.charAt(0);
        if (letterGradeC5 == 'A' || letterGradeC5 == 'a') {
            gradeNumberC5 = 4 * creditHourC5;
        } else if (letterGradeC5 == 'B' || letterGradeC5 == 'b') {
            gradeNumberC5 = 3 * creditHourC5;
        } else if (letterGradeC5 == 'C' || letterGradeC5 == 'c') {
            gradeNumberC5 = 2 * creditHourC5;
        } else if (letterGradeC5 == 'D' || letterGradeC5 == 'd') {
            gradeNumberC5 = 1 * creditHourC5;
        } else if (letterGradeC5 == 'F' || letterGradeC5 == 'f') {
            gradeNumberC5 = 0 * creditHourC5;
        } else {
            System.out.print("Error: Invalid Input");
            System.exit(0);
        }

        double totalGradePoints = gradeNumberC1 + gradeNumberC2 + gradeNumberC3 + gradeNumberC4 + gradeNumberC5;
        double totalCreditHours = creditHourC1 + creditHourC2 + creditHourC3 + creditHourC4 + creditHourC5;
        double GPA = (totalGradePoints / totalCreditHours);
        System.out.println(class1 + " " + "Grade earned: " + gradeC1 + ". " + "Grade Points: " + gradeNumberC1);
        System.out.println(class2 + " " + "Grade earned: " + gradeC2 + ". " + "Grade Points: " + gradeNumberC2);
        System.out.println(class3 + " " + "Grade earned: " + gradeC3 + ". " + "Grade Points: " + gradeNumberC3);
        System.out.println(class4 + " " + "Grade earned: " + gradeC4 + ". " + "Grade Points: " + gradeNumberC4);
        System.out.println(class5 + " " + "Grade earned: " + gradeC5 + ". " + "Grade Points: " + gradeNumberC5);
        System.out.println("Out of " + totalCreditHours +" total credit hours attempted, you earned " + totalGradePoints);
        System.out.println("total Grade points. Your GPA is " + GPA);





    }
}
