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

	public int plusQuantity(int addQuantity) 
	{
		int newQuantity = this.quantity + addQuantity;
		this.quantity = newQuantity;
		return quantity;
	}

	public int lessQuantity(int buyQuantity)
	{
		int quanBuy = this.quantity - buyQuantity;
		this.quantity = quanBuy;
		return quantity;
	}

	public double totalCost(int totalQuantity)
	{
		double costMult = this.cost * totalQuantity;
		this.cost = costMult;
		return cost;
	}

}