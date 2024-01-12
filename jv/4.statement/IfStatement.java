import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to checking odd or even:");
        int a = sc.nextInt();
        sc.close();
        if(a%2==0){
            System.out.println(a+" is an even Number");
        }
        else{
            System.out.println(a+" is a odd number");
        }
    }
}
