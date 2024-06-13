/* 
*
**
***
****
***** 
*/
package BasicJava;

import java.util.Scanner;

public class T_67_Pattern_01 {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter The Range: ");
        int Range = Input.nextInt();
        for (int i = 1; i <= Range; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
