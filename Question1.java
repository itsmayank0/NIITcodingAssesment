package nIIT;
import java.util.*;

public class TotalItems {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int moneySpent = sc.nextInt();
		
		int priceOfAnItem = sc.nextInt();
		
		int itemsToBrought = sc.nextInt();
		
		int result = getResult(itemsToBrought);
		
		System.out.println("The total number of items (purchased + free items) = " + result);
	}
	
	public static int getResult(int itemsToBrought)
	{
		if (itemsToBrought < 10)
			return itemsToBrought;
		else
			return 11 + getResult(itemsToBrought-10);
	}

}
