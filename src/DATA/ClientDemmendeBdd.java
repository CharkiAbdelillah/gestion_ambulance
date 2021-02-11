
package DATA;

import BDD.Connexion;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class ClientDemmendeBdd implements Serializable{
   static Connection cnx;
    static Statement st;
    static ResultSet rst;
    
    public int addDemmande( String n, String cni,String loca) {
        try{
//            Connexion c=new Connexion();
//            c.Setconnection();
//            Connexion.Setconnection();
            
            cnx=Connexion.connecterDB();
            //Preparing a CallableStatement to call a function
            CallableStatement stmt=cnx.prepareCall("{?=call demmande_function(?,?,?)}");
            //Registering the out parameter of the function (return type)
            stmt.registerOutParameter(1,Types.INTEGER);  
            //Setting the input parameters of the function
            stmt.setString(2, n);
            stmt.setString(3, cni);
            stmt.setString(4, loca);
            //Executing the statement
//            ResultSet hasResult=
                stmt.executeUpdate();
//                stmt.executeUpdate();
//                System.out.println("haaaaaaaa : 11111111 "+stmt.getInt(1));
            return stmt.getInt(1);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return 4;
    }
    
    public boolean addValider( String n, String cni) {
        try{
//            Connexion c=new Connexion();
//            c.Setconnection();
//            Connexion.Setconnection();
            
            cnx=Connexion.connecterDB();
            CallableStatement stmt=cnx.prepareCall("{call valider_procedure('"+n+"','"+cni+"')}");
            boolean hasResult=stmt.execute();
//            if(hasResult){
//                ResultSet res=stmt.getResultSet();
//                while(res.next()){
//                    System.out.println(res.getString("smit column"));
//                }
                
//            }
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteValider( String n) {
        try{
//            Connexion c=new Connexion();
//            c.Setconnection();
//            Connexion.Setconnection();
            
            cnx=Connexion.connecterDB();
            CallableStatement stmt=cnx.prepareCall("{call delete_valider_procedure('"+n+"')}");
            boolean hasResult=stmt.execute();
//            if(hasResult){
//                ResultSet res=stmt.getResultSet();
//                while(res.next()){
//                    System.out.println(res.getString("smit column"));
//                }
                
//            }
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public String getName1( String cni) {
        String hah = null;
        try{
        String requet="select nom from insc where cni='"+cni+"'";
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            rst=st.executeQuery(requet);
//            System.out.println("client bien ajoute");
    while(rst.next()){
        hah=rst.getString("nom");
    }
            return hah;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return "false";
    }

    public String[] getClient1( String cni) {
        String hah []= new String[5];
        try{
        String requet="select * from insc where cni='"+cni+"'";
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            rst=st.executeQuery(requet);
//            System.out.println("client bien ajoute");
//System.out.println("hhhhhhhhhhhaaaaaaaaaaaaaa"+cni);

    while(rst.next()){
//System.out.println("rsttttttttt "+rst.getString("cni"));
        hah[0]=rst.getString("cni");
        hah[1]=rst.getString("nom");
        hah[2]=rst.getString("prenom");
        hah[3]=rst.getString("email");
        hah[4]=rst.getString("tele");
    }
        return hah;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}


    