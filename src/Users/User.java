/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author HP
 */
public class User {
    public String getUsername() { 
        return username;
    }
    
    public void setUsername(String Username) { 
        username = Username;
    }
    
    public String getPassword() { 
        return password; 
    }
    
    public void setPassword(String Password) { 
        password = Password; 
    }
    
    public void setUserType(String UserType){
        userType = UserType;
    }
    
    public String getUserType(){ 
        return userType;
    }
    
    String username = new String();
    String password = new String();;
    String userType = new String();
}