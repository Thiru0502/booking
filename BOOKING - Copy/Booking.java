import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Booking{
    String Passengername;
    int Busno;
    Date date;
    Booking(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a passenger name");
        Passengername=scanner.next();
        System.out.println("enter a bus no");
        Busno=scanner.nextInt();
        System.out.println("enter date dd-mm-yyyy");
        String dateInput=scanner.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public boolean isAvailable() throws SQLException  {
        
      Busdao busdao=new Busdao();
      Bookingdao bookingdao=new Bookingdao();
      int capacity=busdao.getCapacity(Busno);
        int booked =0;
      bookingdao.getBookedCount(Busno,date);
        
       return booked<capacity?true:false;

    
    }
}

