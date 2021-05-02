package org.example.sequencers;

import java.util.UUID;

public class appUserId {
    private  static int   appUserId ;
    public  static int count=1;

    public static int getCount() {
        return count;
    }

    public static void setAppUserId(int appUserId) {
        appUserId = getCount();
    }

    public static void setCount(int count) {

    }

    public static int getAppUserId() {
        return appUserId;
    }
}
