/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311sprint1;

import java.util.ArrayList;

/**
 *
 * @author bso5036
 */
public class UserList {
    private ArrayList<User> userList;
    public UserList(){
        userList = new ArrayList<>();
        addUsersToList();
        System.out.println(userList.get(0).toString());
    }
    
    private void addUsersToList(){
        userList.add(new User("12345678", "12345678"));
        userList.add(new User("password", "password"));
        userList.add(new User("rockyou", "rockyou"));
        userList.add(new User("babygirl", "babygirl"));
        userList.add(new User("iloveyou", "iloveyou"));
    }
    
    public ArrayList<User> getUserList(){
        return userList;
    }
    
}
