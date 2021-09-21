package nIIT;
import java.util.*;

public class MedicineTracker {

	public static void main(String[] args) {
		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7};
		
		String[] dayNames = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day medicine is taken on :  ");
		int dayMedTaken = sc.nextInt();
		System.out.println("Next dose to be taken after : ");
		int nextDayToTake = sc.nextInt();
		
		if((dayMedTaken+nextDayToTake-1) > 7)
		{
			System.out.println("Your next dose should be taken on "+ dayNames[((dayMedTaken+nextDayToTake-1)-7)]);
		}
		else 
		{
			System.out.println("Your next dose should be taken on "+ dayNames[(dayMedTaken+nextDayToTake)]);
		}
	}

}
