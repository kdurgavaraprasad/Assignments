
package fabonacci;

/**
 *
 * @author Prasad Kankatala
 */
public class FabonacciCaliculation {
    
    
     public static long Fibonacci(int n)
	{

		if (n == 0)
		{
                        return 0;
		}
		else if (n == 1)
		{
			return 1;
		}
		long a = 0;
		long b = 1;
		for (int i = 31; i >= 0; i--)
		{
			long d = a * (b * 2 - a); // f2n+1
			long e = a * a + b * b; //f2n
			a = d;
			b = e;
			if ((((int)n >>> i) & 1) != 0)
			{
				long c = a + b; //f2n+1 + f2n
				a = b;
				b = c;
			}
		}
		return a;
	}
}
