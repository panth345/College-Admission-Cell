/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    public static String userName = "root";
    public static String password = "";
    public static String url = "jdbc:mysql://localhost:3306/university";
    public static String driver = "com.mysql.cj.jdbc.Driver";
   public static  Connection conn;
    static{
        try{
            Class.forName(driver);
          conn = DriverManager.getConnection(url, userName, password);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static Connection getConnection(){
        return conn;
    }
}
