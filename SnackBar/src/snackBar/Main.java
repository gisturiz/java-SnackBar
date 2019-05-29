package snackBar;

public class Main
{
	private static void workWithData()
	{
		Customer cust1 = new Customer("Jane", 45.25);
		Customer cust2 = new Customer("Bob", 33.14);

		Vendingmachine ven1 = new Vendingmachine("Food");
		Vendingmachine ven2 = new Vendingmachine("Drink");
		Vendingmachine ven3 = new Vendingmachine("Office");

		Snacks sna1 = new Snacks("Chips", 36, 1.75, ven1.getId());
		Snacks sna2 = new Snacks("Chocolate Bar", 36, 1.00, ven1.getId());
		Snacks sna3 = new Snacks("Pretzel", 30, 2.00, ven1.getId());

		Snacks sna4 = new Snacks("Soda", 24, 2.50, ven2.getId());
		Snacks sna5 = new Snacks("Water", 20, 2.75, ven2.getId());


		//1
		System.out.println(cust1.getCash() - sna4.totalCost(3));
		System.out.println(sna4.lessQuantity(3));

		//2
		System.out.println(cust1.getCash() - sna3.totalCost(1));
		System.out.println(sna3.lessQuantity(1));

		//3
		System.out.println(cust2.getCash() - sna4.totalCost(2));
		System.out.println(sna4.lessQuantity(2));

		//4
		System.out.println(cust1.addCash(10));

		//5
		System.out.println(cust1.getCash() - sna2.totalCost(1));
		System.out.println(sna2.lessQuantity(1));

		//6
		System.out.println(sna3.plusQuantity(12));

		//7
		System.out.println(cust2.getCash() - sna3.totalCost(2));
		System.out.println(sna3.lessQuantity(2));

	}

	public static void main(String[] args)
	{
		workWithData();
	}
}