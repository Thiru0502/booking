
import java.sql.SQLException;
import java.sql.*;

public class Bookingdao {
    private String Passengername;
    public int getBookedCount(int Busno,java.util.Date date)throws SQLException{
        String Query="select count(passenger_name) from booking where bus_no=? and travel_date=?";
        Connection conn =Dbconnection.getConnection();
         PreparedStatement pst=conn.prepareStatement(Query);
         java.sql.Date sqldate= new java.sql.Date(date.getTime());
         pst.setInt(1, Busno);
         pst.setDate(2, sqldate);
         ResultSet rs=pst.executeQuery();
        return rs.getInt(1);
    }
    public void addBooking(Booking booking)throws SQLException{
        String query="insert into booking values(?,?,?)";
        Connection conn =Dbconnection.getConnection();
        java.sql.Date sqldate= new java.sql.Date(booking.date.getTime());
        PreparedStatement pst=conn.prepareStatement(query);
        pst.setString(1, booking.Passengername);
        pst.setInt(2,booking.Busno);
        pst.setDate(3, sqldate);
        pst.executeUpdate();


    }
}
