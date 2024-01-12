import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args){
        System.out.println("*****Taking Input*****");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int a = sc.nextInt();
        System.out.println("Number is:"+a);

        System.out.println("Enter a float number:");
        float f = sc.nextFloat();
        System.out.println("Floating Number:"+f);

        System.out.println("Enter a String:");
        String name = sc.nextLine();
        System.out.println("String:"+name);

        System.out.println("Enter another String:");
        String fullName = sc.nextLine();
        System.out.println("String:"+fullName);

    }
}
