package com.example.self.util;

import android.app.Application;

public class JournalApi extends Application {

       String userName;
       String userID;
       public  static  JournalApi instance;

       public  static JournalApi getInstance(){
           if(instance==null){
               instance=new JournalApi();
           }

              return instance;
       }

       public  JournalApi(){}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
