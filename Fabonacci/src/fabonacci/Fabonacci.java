
package fabonacci;

import java.util.Scanner;

/**
 *
 * @author Prasad Kankatala
 */
public class Fabonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number for Fibonacci calculation:");
		int num;
                while((num = scanner.nextInt()) > 0) {
                System.out.printf("\n%1$s" + "\r\n", FabonacciCaliculation.Fibonacci(num));
                }

                {
                System.out.println("Number is negative! Please Enter positive Numbers!");
                }
        }
        catch(Exception x)
        {
            System.out.println("Please Enter positive Numbers!");
        }
              
    }
   
}
