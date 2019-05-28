package snackBar;

public class Customer
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.cash = cash;
	}

	public String getname()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCash()
	{
		return cash;
	}

	public void addCash(double addAmount) 
	{
		return this.cash += addAmount;
	}

	public void cashRemaining(double amountSpent)
	{
		return this.cash -= amountSpent;
	}
}