package com.mainacad.ObjectData;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

public class SourceObject implements Serializable {
    private String userName;
    private long session_Id;
    private long connectionTime;
    private String userIP;

    public SourceObject(String userName, long session_Id, long connectionTime, String userIP) {
        this.userName = userName;
        this.session_Id = session_Id;
        this.connectionTime = connectionTime;
        this.userIP = userIP;
    }

    public SourceObject() {
    }
    private static int getRandomNumber(int from, int to){
        return from + new Random().nextInt(to - from);
    }

    public static SourceObject getRandomUserInfo(){
        SourceObject sourceObject = new SourceObject();
        sourceObject.setUserName("Alex_0" + getRandomNumber(0, 9));
        sourceObject.setSession_Id(getRandomNumber(10000, 99999));
        sourceObject.setConnectionTime(new Date().getTime() - getRandomNumber(0, 20000));
        sourceObject.setUserIP(
                        getRandomNumber(100,255) + "." +
                        getRandomNumber(100,255) + "." +
                        getRandomNumber(100,255) + "." +
                        getRandomNumber(100,255)
        );
        return sourceObject;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getSession_Id() {
        return session_Id;
    }

    public void setSession_Id(long session_Id) {
        this.session_Id = session_Id;
    }

    public long getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(long connectionTime) {
        this.connectionTime = connectionTime;
    }

    public String getUserIP() {
        return userIP;
    }

    public void setUserIP(String userIP) {
        this.userIP = userIP;
    }
}
