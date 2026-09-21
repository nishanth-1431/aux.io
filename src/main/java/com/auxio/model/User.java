package com.auxio.model;
/*  
    MySQL                          Java
    ────────────────────────────────────────
    Users table          →         User class

    user_id              →         int userId
    user_name            →         String userName
    passwordHash         →         String passwordHash
    usertype             →        UserType userType
*/
public class User {
   private int userId;
   private String userName;
   private String passwordHash;
   private UserType userType;

    public int getUserId(){
        return this.userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setUserName(String Username){
        this.userName = Username;
    }

    public String getpasswordHash() {
         return this.passwordHash; 
    }

    public void setpasswordHash(String passwordHash) { 
        this.passwordHash = passwordHash;
    } 

    public UserType getUserType() {
         return this.userType;
    }

    public void setUserType(UserType userType) { 
        this.userType = userType; 
    }

}