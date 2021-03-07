
package DATA;

import BDD.Connexion;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientBdd implements Serializable{
   static Connection cnx;
    static Statement st;
    static ResultSet rst;
    
    public boolean add( String cni, String nom, String prenom, String pass,String pass_conf,String email,String tele) {
        try{
//            Connexion c=new Connexion();
//            c.Setconnection();
//            Connexion.Setconnection();
            String requet="insert into insc values('"+cni+"','"+nom+"','"+prenom+"','"+pass+"','"+pass_conf+"','"+email+"','"+tele+"','0')";
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
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
    public boolean getPassTest( String cni, String pass) {
        try{
//            System.out.println("passs :   nnnnnn "+pass);
            String requet="select * from insc where pass='"+pass+"' and cni='"+cni+"'";
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            rst=st.executeQuery(requet);
            if(rst.next())// si important pour voir select si il contient des resultats
                return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
      return false;
    }
    public boolean updateInfoClient( String cni,String nom,String prenom,String pass,String passConf,String email,String tele) {
        try{
//            System.out.println("passs :   nnnnnn "+pass);
            String requet="update insc set nom='"+nom+"',prenom='"+prenom+"' ,pass='"+pass+"',pass_conf='"+passConf+"' ,email='"+email+"',tele='"+tele+"' where cni='"+cni+"'";
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
                return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
      return false;
    }
    
    public String getEmailByCni( String cni) {
        String hah = null;
        try{
        String requet="select email from insc where cni='"+cni+"'";
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            rst=st.executeQuery(requet);
//            System.out.println("client bien ajoute");
//System.out.println("hhhhhhhhhhhaaaaaaaaaaaaaa"+cni);

    while(rst.next()){
//System.out.println("rsttttttttt "+rst.getString("cni"));
        hah=rst.getString("email");
        
    }
        return hah;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}


    