import java.util.Date;
import java.sql.SQLException;


class Bus{
   private int Busno;
    private boolean Ac;
   private int Capacity;
    Bus(int Busno,Boolean Ac,int Capacity){
      this.Busno=Busno;
      this.Ac=Ac;
      this.Capacity=Capacity;
    }
    public int getBusno(){
      return Busno;
  }
    public int getCapacity(){
        return Capacity;
    }
    public boolean isAc(){
        return Ac;

    }
    public void SetCapacity(int Capacity){
      Capacity=Capacity;
    }
    public void SetAc(boolean Ac){
        Ac=Ac;
    }
    
}