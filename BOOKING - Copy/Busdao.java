import java.sql.*;
import java.sql.SQLException;

import com.mysql.cj.Query;
import com.mysql.cj.x.protobuf.MysqlxExpr.Identifier;

public class Busdao {
    
    public void Displaybusinfo() throws SQLException{
      String  Query="select*from Bus";
        Connection conn =Dbconnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(Query);
        while (rs.next()) {
            System.out.println("Id :" +rs.getInt(1));
            System.out.println("ac :" +rs.getString(2));
            System.out.println("capacity  :"+rs.getInt(3));
            
        }
        conn.close(); 
      }

    public int getCapacity(int id)throws SQLException {
        String Query="Select capacity from Bus where id=" + id;
        Connection conn =Dbconnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(Query);
        rs.next();
        return rs.getInt(1);   
    }
}
