import java.util.Scanner; //nested package/ hierarchical package
import java.sql.SQLException;

public class Busdemo {

	public static void main(String[] args)  {
		
		Busdao busdao = new Busdao();
		
		try {
			busdao.Displaybusinfo();
			
			int userOpt = 1;
			Scanner scanner = new Scanner(System.in);
					
			while(userOpt==1) {
				System.out.println("Enter 1 to Book and 2 to exit");
				userOpt = scanner.nextInt();
				if(userOpt == 1) {
					Booking booking = new Booking();
					if(booking.isAvailable()) {
						Bookingdao bookingdao = new Bookingdao();
						bookingdao.addBooking(booking);
						System.out.println("Your booking is confirmed");
					}
					else
						System.out.println("Sorry. Bus is full. Try another bus or date.");
				}
			}
			scanner.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}