
package DATA;

import BDD.Connexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Get {
    Connection con;
    Statement st;
    ResultSet re;
    
    public int Janvier()throws SQLException{
        String deb,fin;
        int numberRow = 0;
        deb="TO_DATE('1-01-2021','DD-MM-YYYY')";fin="TO_DATE('31-01-2021','DD-MM-YYYY')";
        try {
            con=Connexion.connecterDB();
            Statement stm=con.createStatement();
        String s="select count(*) from nmbr_demmande where datemois between "+deb+" and "+fin+" ";
            ResultSet r=stm.executeQuery(s);
            while(r.next()){    
                numberRow=r.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Get.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return numberRow;

    }
    public int Fevrier() throws SQLException{
        String deb,fin;
        int numberRow = 0;
        deb="TO_DATE('1-02-2021','DD-MM-YYYY')";fin="TO_DATE('28-02-2021','DD-MM-YYYY')";
        try {
            con=Connexion.connecterDB();
            Statement stm=con.createStatement();

//        String s="select count(*) from nmbr_demmande where datemois between "+deb+" and "+fin+" ";
        String s="select count(*) from nmbr_demmande ";
            ResultSet r=stm.executeQuery(s);
            while(r.next()){    
                numberRow=r.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Get.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return numberRow;

    }
    public int Mars()throws SQLException{
        String deb,fin;
        int numberRow = 0;
        deb="TO_DATE('1-03-2021','DD-MM-YYYY')";fin="TO_DATE('31-03-2021','DD-MM-YYYY')";
        try {
            con=Connexion.connecterDB();
            Statement stm=con.createStatement();
        String s="select count(*) from nmbr_demmande where datemois between "+deb+" and "+fin+" ";
            ResultSet r=stm.executeQuery(s);
            while(r.next()){    
                numberRow=r.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Get.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return numberRow;

    }
    public int Avril()throws SQLException{
        String deb,fin;
        int numberRow = 0;
        deb="TO_DATE('1-04-2021','DD-MM-YYYY')";fin="TO_DATE('30-04-2021','DD-MM-YYYY')";
        try {
            con=Connexion.connecterDB();
            Statement stm=con.createStatement();
        String s="select count(*) from nmbr_demmande where datemois between "+deb+" and "+fin+" ";
            ResultSet r=stm.executeQuery(s);
            while(r.next()){    
                numberRow=r.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Get.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return numberRow;

    }
    public int Mai()throws SQLException{
        String deb,fin;
        int numberRow = 0;
        deb="TO_DATE('1-05-2021','DD-MM-YYYY')";fin="TO_DATE('31-05-2021','DD-MM-YYYY')";
        try {
            con=Connexion.connecterDB();
            Statement stm=con.createStatement();
        String s="select count(*) from nmbr_demmande where datemois between "+deb+" and "+fin+" ";
            ResultSet r=stm.executeQuery(s);
            while(r.next()){    
                numberRow=r.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Get.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return numberRow;

    }
    public int Juin()throws SQLException{
        String deb,fin;
        int numberRow = 0;
        deb="TO_DATE('1-06-2021','DD-MM-YYYY')";fin="TO_DATE('30-06-2021','DD-MM-YYYY')";
        try {
            con=Connexion.connecterDB();
            Statement stm=con.createStatement();
        String s="select count(*) from nmbr_demmande where datemois between "+deb+" and "+fin+" ";
            ResultSet r=stm.executeQuery(s);
            while(r.next()){    
                numberRow=r.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Get.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return numberRow;

    }
    public int Juillet()throws SQLException{
        String deb,fin;
        int numberRow = 0;
        deb="TO_DATE('1-07-2021','DD-MM-YYYY')";fin="TO_DATE('31-07-2021','DD-MM-YYYY')";
        try {
            con=Connexion.connecterDB();
            Statement stm=con.createStatement();
        String s="select count(*) from nmbr_demmande where datemois between "+deb+" and "+fin+" ";
            ResultSet r=stm.executeQuery(s);
            while(r.next()){    
                numberRow=r.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Get.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return numberRow;

    }
    public int Aout()throws SQLException{
        String deb,fin;
        int numberRow = 0;
        deb="TO_DATE('1-08-2021','DD-MM-YYYY')";fin="TO_DATE('31-08-2021','DD-MM-YYYY')";
        try {
            con=Connexion.connecterDB();
            Statement stm=con.createStatement();
        String s="select count(*) from nmbr_demmande where datemois between "+deb+" and "+fin+" ";
            ResultSet r=stm.executeQuery(s);
            while(r.next()){    
                numberRow=r.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Get.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return numberRow;

    }
    public int Septembre()throws SQLException{
        String deb,fin;
        int numberRow = 0;
        deb="TO_DATE('1-09-2021','DD-MM-YYYY')";fin="TO_DATE('30-09-2021','DD-MM-YYYY')";
        try {
            con=Connexion.connecterDB();
            Statement stm=con.createStatement();
        String s="select count(*) from nmbr_demmande where datemois between "+deb+" and "+fin+" ";
            ResultSet r=stm.executeQuery(s);
            while(r.next()){    
                numberRow=r.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Get.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return numberRow;

    }
    public int Octobre()throws SQLException{
        String deb,fin;
        int numberRow = 0;
        deb="TO_DATE('1-10-2021','DD-MM-YYYY')";fin="TO_DATE('31-10-2021','DD-MM-YYYY')";
        try {
            con=Connexion.connecterDB();
            Statement stm=con.createStatement();
        String s="select count(*) from nmbr_demmande where datemois between "+deb+" and "+fin+" ";
            ResultSet r=stm.executeQuery(s);
            while(r.next()){    
                numberRow=r.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Get.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return numberRow;

    }
    public int Novembre()throws SQLException{
        String deb,fin;
        int numberRow = 0;
        deb="TO_DATE('1-11-2021','DD-MM-YYYY')";fin="TO_DATE('30-11-2021','DD-MM-YYYY')";
        try {
            con=Connexion.connecterDB();
            Statement stm=con.createStatement();
        String s="select count(*) from nmbr_demmande where datemois between "+deb+" and "+fin+" ";
            ResultSet r=stm.executeQuery(s);
            while(r.next()){    
                numberRow=r.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Get.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return numberRow;

    }
    public int Decembre()throws SQLException{
        String deb,fin;
        int numberRow = 0;
        deb="TO_DATE('1-12-2021','DD-MM-YYYY')";fin="TO_DATE('31-12-2021','DD-MM-YYYY')";
        try {
            con=Connexion.connecterDB();
            Statement stm=con.createStatement();
        String s="select count(*) from nmbr_demmande where datemois between "+deb+" and "+fin+" ";
            ResultSet r=stm.executeQuery(s);
            while(r.next()){    
                numberRow=r.getInt("count(*)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Get.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return numberRow;

    }
    
}
