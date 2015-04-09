import java.io.Serializable;

public class Game implements Serializable
{
	// variables that hold information on the game. 
	String name;
	String developer;
	String publisher;
	double price;
	
	
	// sets all values. 
	public Game(String name, String developer, String publisher, double price)
	{
		this.name = name;
		this.developer = developer;
		this.publisher = publisher;
		this.price = price;
	}
	
	// setters and getters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setDeveloper(String developer)
	{
		this.developer = developer;
	}
	
	public String getDeveloper()
	{
		return developer;
	}
	
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	// prints the values of this object
	public String toString()
	{
		return "Name: " + name + "\nDeveloper: " + developer + "\nPublisher: " + publisher + "\nPrice: " + price + "\n";
	}
}