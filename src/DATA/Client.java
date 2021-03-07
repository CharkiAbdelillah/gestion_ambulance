
package DATA;

import java.io.Serializable;

public  class Client implements Serializable{
    String cni;
     String nom;
    String prenom;
    String pass;
    String pass_conf;
    String email;
    String tele;
    ClientBdd c=new ClientBdd();
    public Client(String cni, String nom, String prenom, String pass, String pass_conf, String email, String tele) {
        this.cni = cni;
        this.nom = nom;
        this.prenom = prenom;
        this.pass = pass;
        this.pass_conf = pass_conf;
        this.email = email;
        this.tele = tele;
    }

    public Client() {
    }

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass_conf() {
        return pass_conf;
    }

    public void setPass_conf(String pass_conf) {
        this.pass_conf = pass_conf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTele() {
        return tele;
    }

    public  void setTele(String tele) {
        this.tele = tele;
    }
    
    public boolean ajouterInsc(){
        return c.add(cni, nom, prenom, pass, pass_conf, email, tele);
    }
    public void getName11(String s){
        this.nom=c.getName1(s);
//        return c.getName1(s);
    }
    public String[] getClient(String c1){
        String info[]=c.getClient1(c1);
        return info;
    }
    public boolean testPass(String cni,String passAncien){
        return c.getPassTest(cni,passAncien);
    }
    public boolean infoUpdate(String cni,String nom,String prenom,String pass,String passConf,String email,String tele){
        return c.updateInfoClient(cni, nom, prenom, pass, passConf, email, tele);
    }
    
    public String getEmail(String c1){
        String email=c.getEmailByCni(c1);
        return email;
    }
}
