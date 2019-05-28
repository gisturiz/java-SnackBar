package snackBar;

public class Snacks
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineID;

	public Snacks(String name, int quantity, double cost, int vendingMachineID)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineID = vendingMachineID;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getname()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public int getVendingId()
	{
		return vendingMachineID;
	}

	public void setVendingId(int id)
	{
		this.vendingMachineID = vendingMachineID;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void addQuantity(int addQuantity) 
	{
		return this.quantity += addQuantity;
	}

	public void buySnack(int buyQuantity)
	{
		return this.quantity -= buyQuantity;
	}

	public double totalCost(int totalQuantity)
	{
		return this.cost * totalQuantity;
	}

}