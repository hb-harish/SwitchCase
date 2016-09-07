import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the days in the month");
		int days = sc.nextInt();
        String monthName;
        switch (days) {
            case 31:  monthName = "January,March,May,July,August,October,December";
                     break;
            case 30: monthName = "February,April,June,September,November";
            		 break;
            default: monthName = String.format("There are no months with only %d days",days);
                     break;
        }
        System.out.println(monthName);
		// TODO Auto-generated method stub

	}

}
