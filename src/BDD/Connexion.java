
package BDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public  class Connexion {
    
    public static Connection con;
    public static Statement st;
    public static ResultSet re;
    
    public static Connection connecterDB(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abdo", "abdo");
            st=  con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);//bnisba statement fiha deux type:1)- executeupdate(query) return 0 ola 1 (si traitement effectuer 1) .2)-executeuery(query) return ResultSet(requete ktjib lina les resultats)
//            JOptionPane.showMessageDialog(null,"connecter avec succes");
        return con;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    public  static void Setconnection() throws SQLException
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abdo", "abdo");
            st=  con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);//bnisba statement fiha deux type:1)- executeupdate(query) return 0 ola 1 (si traitement effectuer 1) .2)-executeuery(query) return ResultSet(requete ktjib lina les resultats)
            JOptionPane.showMessageDialog(null,"connecter avec succes");
//            re=st.executeQuery("select * from personne");//3mrna resultSet bax tkhdm dik botton next o ..
        } catch (ClassNotFoundException |SQLException ex) {
            JOptionPane.showMessageDialog(null,"erreur: "+ex.toString());
        }
    }
    
    public  static boolean checkUserAndPass(String user,String pass) throws ClassNotFoundException, SQLException
    {
        try
        {
//            System.out.println(user+" pass "+pass);
            Setconnection();
            st=con.createStatement();
            String sql="select * from login where username='"+user+"' and password='"+pass+"'";
            re=st.executeQuery(sql);
            
            
            if(re.next())
            {
//                System.out.println("hhhhhhhhhh");
                con.close();
                return true;
            }
            return true ;
        }
        catch(SQLException ex)
        {
            ex.printStackTrace(); 
        }
                con.close();

        return false;
    }
    
    
}
