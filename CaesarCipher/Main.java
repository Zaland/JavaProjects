import java.util.Scanner;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		/* Prepare scanner for use, */
		
		Scanner scan = new Scanner(System.in);
		
		
		/* Ask user if they want to encrypt or decrypt a file. Then set up 
		   if statements to check which option the user chose and proceed
		   further. */
		
		System.out.print("(1) Encrypt, (2) Decrypt: ");
		int choice = scan.nextInt();
		
		if(choice == 1)
		{
			/* Open file and store it in the fp variable. Prepare the file
			   writer to write the encrypted data onto. Also declare an 
			   empty variable for storing temporary data. */
			   
			FileInputStream fp = new FileInputStream("a.txt");
			PrintWriter pr = new PrintWriter("encrypted.txt", "UTF-8");
			int r;
			
			
			/* Ask for the number to use for encoding the file with Caesar Cipher.
			   If zero, then use default of 5 for encoding. */
			   
			System.out.print("Enter number: ");
			int num = scan.nextInt();
			if(num == 0)
				num = 5;
			System.out.println(num);
			
			
			/* Loop through all the characters in the file and add the specified 
			   number from the user. */
			   
			while ((r = fp.read()) != -1) 
			{
				char c = (char) (r + num);
				pr.print(c);
			}
			
			System.out.println();
			fp.close();
			pr.close();
		}
	}
}
