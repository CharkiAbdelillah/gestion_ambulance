
package DATA;


public class Stock {
        String no;
        String managedBy;
        String category;
        String ville;
        String phone;
        String status;
        StockBdd s=new StockBdd();
                
    public Stock(String no, String managedBy, String category,String ville, String phone, String status) {
        this.no = no;
        this.managedBy = managedBy;
        this.category = category;
        this.ville = ville;
        this.phone = phone;
        this.status = status;
    }

    public Stock() {
    }

    
    
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(String managedBy) {
        this.managedBy = managedBy;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return no+" "+managedBy+" "+category+" "+phone+" "+status; //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean ajouter(){
//        System.out.println("hhhhhhhhh");
        
        return s.add(no, managedBy, category,ville, phone, status);
    }
    public boolean modifier(){
//        System.out.println("hhhhhhhhh");
        
        return s.update(no, managedBy, category,ville, phone);
    }
    public boolean supprimer(){
//        System.out.println("hhhhhhhhh");
        
        return s.delete(no);
    }
    public boolean supprimerTous(){
//        System.out.println("hhhhhhhhh");
        
        return s.deleteAll();
    }
    
}
