
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conector {
    String url = "C:\\Users\\usuario\\Desktop\\Proyecto\\Gestion_Repartos\\src\\proyecto.sqlite";
    Connection conect;
    
    
    public Conector(){
        
    }
    
    public void connect(){
        try{
            
            conect = DriverManager.getConnection("jdbc:sqlite:" + url);
            if(conect != null){
                System.out.println("Conectado");
            }
        }catch(SQLException ex){
            System.out.println("Error en la conexion \n"+ex.getMessage());
        }
    }
    public void close(){
        try {        
            conect.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexion \n"+ex.getMessage());
        }
        
    }
//    public static void main(String args[]){
//        Conector con=new Conector();
//        con.connect();
//    }
}
