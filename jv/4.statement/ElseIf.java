import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();
        sc.close();
        if(age<18){
            System.out.println("Minor");
        }
        else if(age>=18 && age<=40){
            System.out.println("Young");
        }
        else if(age>40 && age<=60){
            System.out.println("Punctual");
        }
        else {
            System.out.println("OLd");
        }
    }
}
