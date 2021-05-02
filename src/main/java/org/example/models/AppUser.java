package org.example.models;

import java.rmi.server.UID;
import java.util.Scanner;
import java.util.UUID;

public class AppUser {
    public String username;
    public int id;
    private String password;
    public static int count = 1;
    public static String input;

    public AppUser(String username, int id, String password) {
        this.username = username;
        this.id = getCount(count);
        this.password = password;
    }

    public AppUser(String username, String password) {
        this(username,getCount(count),password);

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

    public static int getCount(int count) {
        return AppUser.count;
    }

    public static void setCount(int count) {
        AppUser.count = count;
    }

    public static String getInput() {
        return input;
    }

    public static void setInput(String input) {
        AppUser.input = input;
    }
}