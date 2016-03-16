/* Program runs the encryption algorithm using RSA. It will take a message m (an integer) and
   key (e, n) - two integers, and generate the ciphertext c (another integer). The value of c
   is then printed out to the user. */

import java.util.Scanner;
import java.util.ArrayList;

public class rsa
{
	public static void main(String[] args)
	{
		/* Prepare the scanner variable. Grab the variables m, e, and n from the user's input.
		   Store these values in variables for further use in encryption. */

		Scanner scan = new Scanner(System.in);

		System.out.print("What is M? ");
		int m = scan.nextInt();

		System.out.print("\nWhat are the values of the key?\nWhat is e? ");
		int e = scan.nextInt();
		System.out.print("What is n? ");
		int n = scan.nextInt();

        
        /* Use the modular arithmetic technique that we learned in class. Divide the powers up
           and obtain a smaller number to mod. */
        
		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp = e;
		while(temp > 1)
		{
			list.add((int)Math.pow(m, 2));
			temp -= 2;
		}
		if(temp == 1)
			list.add(m);
        
        
        /* Finally calculate the ciphertext integer by multiplying all the values in the list and
           taking the mod of the value obtained by n. Then print this value to the user. */
        
        int c = 1;
        for(int i = 0; i < list.size(); i++)
            c *= list.get(i);
        c %= n;
        System.out.println("\nc = " + c);
	}
}