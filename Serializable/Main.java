import java.io.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// variables for temporarily holding the address information.
		String name;
		String developer;
		String publisher;
		double price;
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		
		// ask user which option they want to execute	
		printf("Game writing and reading program\n");
		printf("1  Read a game\n2  Write a game\n3  Quit\nChoice: ");
		choice = scan.nextInt();
		
		// loop until the user chooses to quit
		while(choice != 3)
		{
			// if user chose option 1, then read in a file
			if(choice == 1)
			{
				// ask user for file name and add .seo extension
				printf("\nEnter filename (don't add any file extension, only name): ");
				String filename = scan.nextLine();
				filename = scan.nextLine();
				filename += ".soe";
				
				// read the file and store it in an object
				try
				{
					FileInputStream fp = new FileInputStream(filename);
					ObjectInputStream op = new ObjectInputStream(fp);
					Game game = (Game)op.readObject();
					printf("\nSuccessfully read file\n\n");
				
					// print the object to confirm its the same object
					printf(game);
				}
				
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			// if user chose option 2, then write to a file
			else if(choice == 2)
			{
				// grab values from user and store in the temporary variables	
				printf("\nName: ");
				name = scan.nextLine();
				name = scan.nextLine();
				printf("Developer: ");
				developer = scan.nextLine();
				printf("Publisher: ");
				publisher = scan.nextLine();
				printf("Price: ");
				price = scan.nextDouble();
				
				// create the object and store the values in it
				Game game = new Game(name, developer, publisher, price);
				
				// ask for file name from user and then add file extension .soe
				printf("Enter filename (don't add any file extension, only name): ");
				String filename = scan.nextLine();
				filename = scan.nextLine();
				filename += ".soe";
				
				// save object to file
				try
				{
					FileOutputStream fp = new FileOutputStream(filename);
					ObjectOutputStream op = new ObjectOutputStream(fp);
					op.writeObject(game);
					op.close();
					printf("\nSuccessfully created file!\n");
				} 
				
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			// if user chose 3, then the program will quit
			else if(choice == 3)
				break;
				
			// ask user which option they want to execute	
			printf("\n**************************************\nGame writing and reading program\n");
			printf("1  Read a game\n2  Write a game\n3  Quit\nChoice: ");
			choice = scan.nextInt();
		}
	}
	
	// easier to print values
	public static void printf(String print)
	{
		System.out.print(print);
	}
	
	// overload for printing Game objects
	public static void printf(Game print)
	{
		System.out.print(print);
	}
}