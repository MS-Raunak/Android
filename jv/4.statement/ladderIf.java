import java.util.Scanner;

public class ladderIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics Marks Of a Student:");
        int p = sc.nextInt();
        System.out.println("Enter Chemistry Marks Of a Student:");
        int c = sc.nextInt();
        System.out.println("Enter Math Marks Of a Student:");
        int m = sc.nextInt();
        sc.close();

        int total = p + c + m;
        System.out.println("Total:" + total);
        int per = total / 3;
        System.out.println("Percentage:" + per+"%");

        if (per >= 60 && per <= 100) {
            if (per >= 75 && per <= 100) {
                System.out.println("First division : DISTINCTION");
            } else {
                System.out.println("First division");
            }
        } else if (per >= 45 && per < 60) {
            System.out.println("Second Division");
        } else if (per >= 30 && per < 45) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }

    }
}
