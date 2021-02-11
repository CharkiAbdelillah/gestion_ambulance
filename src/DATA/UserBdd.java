/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import BDD.Connexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserBdd {
    public Connection con;
    public Statement st;
    public ResultSet re;
//    Connexion c=new Connexion();
    public  boolean verifier(String user,String pass) 
    {
       try{
            con=Connexion.connecterDB();
            st=con.createStatement();
            re=st.executeQuery("select * from login where username='"+user+"' and password='"+pass+"'");
             while(re.next())
            {
                con.close();
                return true;
            }
               con.close();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
              
        return false;
    }
}
