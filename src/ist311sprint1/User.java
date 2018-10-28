/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311sprint1;

/**
 *
 * @author bso5036
 */
public class User {
    private String username;
    private String password;
    
    public User(String inUsername, String inPassword){
        username = inUsername;
        password = inPassword;
    }
    
    @Override
    public String toString(){
        return "Username: " + username + " Password: " + password;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
}
