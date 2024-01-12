import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P:");
        int p = sc.nextInt();
        System.out.println("Enter Time:");
        int t = sc.nextInt();
        System.out.println("Enter Rate:");
        int r = sc.nextInt();
        sc.close();
        float si = (p*t*r)/100;
        System.out.println("Simple Interest:"+si);
    }
}
