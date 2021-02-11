
package DATA;

import java.io.Serializable;

public  class ClientDemmande {
    String numeroV;
    String cni;
    String loca;
    
    ClientDemmendeBdd c=new ClientDemmendeBdd();
            
    public ClientDemmande(String numeroV,String cni, String loca) {
        this.numeroV = numeroV;
        this.cni = cni;
        this.loca = loca;
        
    }

    public ClientDemmande() {
    }

    public String getNumeroV() {
        return numeroV;
    }

    public void setNumeroV(String numeroV) {
        
        this.numeroV = numeroV;
        System.out.println("kaaaaaaaaaaalaaaaaaaaaa f set :"+numeroV);
    }

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public String getLoca() {
        return loca;
    }

    public void setLoca(String loca) {
        this.loca = loca;
    }

    public int ajouterDemm(){
         return c.addDemmande(numeroV,cni,loca);
    }
    public boolean ajouterValider(){
        return c.addValider(numeroV,cni);
    }
    
    public boolean supprimerValider(){
        return c.deleteValider(numeroV);
    }
//    public void getName11(String s){
//        this.nom=c.getName1(s);
////        return c.getName1(s);
//    }
//    public String[] getClient(String c1){
//        String info[]=c.getClient1(c1);
//        return info;
//    }
    
    
}
