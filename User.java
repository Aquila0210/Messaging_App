/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register_design;

public class User {
   
    private String username;
    private String fullName;
    
    public User (String Username,String FullName){
        this.username=Username;
        this.fullName=FullName;
        
    }
    public String getUsername(){
        return username;
    }
    
    public String getFullName(){
        return fullName;
    }
}
