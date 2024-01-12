import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number you want to print?");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Number is...");

        int num=1;                   //initialization
        while(num<=n){               //condition
            System.out.print(num);
            if(num<n){
                System.out.print(",");
            }
            num++;                  //incrementation
        }
    }
}
