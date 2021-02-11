
package DATA;

import BDD.Connexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StockBdd {
    static Connection cnx;
    static Statement st;
    static ResultSet rst;
    
    public boolean add( String no, String diriger, String category,String ville ,String tele,String disponible) {
        try{
//            Connexion c=new Connexion();
//            c.Setconnection();
//            Connexion.Setconnection();
            String requet="insert into stock values('"+no+"','"+diriger+"','"+category+"','"+tele+"','"+disponible+"','"+ville+"')";
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean update( String no, String diriger, String category,String ville, String tele) {
        try{
//            Connexion c=new Connexion();
//            c.Setconnection();
//            Connexion.Setconnection();
            String requet="update stock set MANAGEDBY='"+diriger+"',CATEGORY='"+category+"',phone='"+tele+"',ville='"+ville+"' where no='"+no+"'";
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean delete( String no) {
        try{
            String requet="delete from stock where no='"+no+"'";
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteAll() {
        try{
            String requet="truncate table stock";
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
}
