package daoImplement;
import java.sql.DriverManager;
public class Connexion {
public com.mysql.jdbc.Connection conn;
{
String url= "jdbc:mysql://localhost:3306/";
String dbName;
dbName = "session_formation";
String driver= "com.mysql.jdbc.Driver";
String userName= "root";
String password="";
try
{
Class.forName(driver);
conn= (com.mysql.jdbc.Connection)
DriverManager.getConnection(url+dbName,userName, password);
System.out.println("la connexion a reussie");
}catch(Exception e)
{
System.out.println("la connexion est echoue");
}
}


}
