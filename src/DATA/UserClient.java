/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import BDD.Connexion;
import java.sql.SQLException;

public class UserClient {
    private String username;
    private String password;
    UserClientBdd b=new UserClientBdd();
    

    public UserClient() {
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    public boolean loginClient() {
        
        return b.verifier(username, password);
    }
}
