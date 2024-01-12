import java.util.Scanner;

public class reverseTriangle {                        // Print like this Triangle
    public static void main(String[] args) {                        // * * * * * *
        Scanner sc = new Scanner(System.in);                        // * * * * *
        System.out.println("Enter the number of row:");          // * * * *
        int r = sc.nextInt();                                      // * * *
        sc.close();                                               //  * *
                                                                 //   *
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=(r+1-i); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int i=r; i>=1; i--)
        // {
        //     for(int j=1; j<=i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
    
}
