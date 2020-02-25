package Main;
import static java.lang.System.out;
import java.util.*;
import Exception.NoDataFoundException;
import Service.DistributorDetailsService;
public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		control:while(true)
		{
			out.println("Enter \n 1:Display Distributor Details     \n 2:Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				DistributorDetailsService obj = new DistributorDetailsService();
			    out.println("Display Distributor Details");
			    out.println("---------------------------");
			    out.println("Available Distributor ID'S are- \n"+obj.getId());
			   out.println("Enter the ID from the given list...");
			   int id = sc.nextInt();
				try {
					out.println(obj.getDistributorDetailsService(id));
				} catch (NoDataFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   break;
			case 2:
				default:out.println("Wrong Choice");
			}
		}
	}

}
