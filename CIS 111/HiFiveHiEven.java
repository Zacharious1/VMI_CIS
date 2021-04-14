import java.util.Scanner;
public class HiFiveHiEven {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if (a > 0) {
    if (a % 5 == 0)
        System.out.print("HiFive");
    if (a % 2 == 0)
        System.out.print("HiEven");
}
else System.out.print("Your input should be positive");
}
}