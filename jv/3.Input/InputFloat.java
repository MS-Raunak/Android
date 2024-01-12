import java.util.Scanner;
public class InputFloat {
    public static void main(String[] args){
        System.out.println("*****Taking Input Floating Number*****");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        float f = sc.nextFloat();
        System.out.println("Floating Number:"+f);
    }
}