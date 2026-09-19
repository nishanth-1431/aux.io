package com.auxio.model;
import com.auxio.model.UserType;
/*  
    MySQL                          Java
    ────────────────────────────────────────
    Users table          →         User class

    user_id              →         int userId
    user_name            →         String userName
    password             →         String password
    usertype              →        UserType userType
*/
public class User {
   private int userId;
   private String userName;
   private String password;
   private UserType userType;

    public int getUserId(){
        return this.userId;
    }

    void setUserId(int userId){
        this.userId = userId;
    }

    public String getUserName(){
        return this.userName;
    }

    void setUserName(String Username){
        this.userName = Username;
    }

    public String getPassword() {
         return this.password; 
    }

    public void setPassword(String password) { 
        this.password = password;
    } 

    public UserType getUserType() {
         return this.userType;
    }

    public void setUserType(UserType userType) { 
        this.userType = userType; 
    }

}