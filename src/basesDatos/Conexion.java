
package basesDatos;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Conexion {
    Connection conexion = null;
    PreparedStatement insert = null;
    public  PreparedStatement consult = null;
     
    public Conexion(){
     
    }
    public int conectar2(){
           
        try {
             Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:D:/Mis Documentos/Escritorio/Bases de datos/baseDatos.s3db");
            if(conexion != null){
                System.out.println("Conexión exitosa en la base de datos numero2");
                 
            }
        } catch (Exception e) {
            System.out.println("ha ocurrido un error de conexión en la base de datos numero 2");
        }
 
        return 0;
    }
    
    public int insertarDatos (String sentenciaInsertar){
        try {
             insert = conexion.prepareStatement(sentenciaInsertar);
             insert.execute();
             insert.close();
             return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
   
    public ResultSet consultarInformacion (String sentciaConsultar){
        try {
             consult = conexion.prepareStatement(sentciaConsultar);
             
             ResultSet consultame = consult.executeQuery();
             return consultame;
        } catch (Exception e) {
            System.out.println(e);
             return null;
        }
        
    }   
    

    public void close() {
        try {
            conexion.close();
            System.out.println("conexion cerrada exitosamnte");
        } catch (SQLException ex) {
            System.out.println("no se pudo cerrar la conexion "+ex);
        }
    }
}
