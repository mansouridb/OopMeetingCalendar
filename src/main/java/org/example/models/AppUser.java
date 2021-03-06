package org.example.models;

import java.rmi.server.UID;
import java.util.Objects;
import java.util.Scanner;
import java.util.UUID;

public class AppUser {
    public String username;
    public int id;
    private String password;
    public static int count = 1;
    public static String input;
    // constructor
    public AppUser(String username, int id, String password) {
       setUsername(username);
        this.id = getCount(count);
        setPassword(password);
    }

    public AppUser(String username, String password) {
        this(username, getCount(count), password);

    }

    public String getUsername(String username) {
        if (username == null) throw new IllegalArgumentException("You should enter a User name");
        if (username.contains(username))  throw new IllegalArgumentException("This user used before please select another user name!!!");
       return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return username.equals(appUser.username) && password.equals(appUser.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    public static int getCount(int count) {
        return AppUser.count;
    }

    public static void setCount(int count) {
        AppUser.count = count++;
    }

    public static String getInput() {
        return input;
    }

    public static void setInput(String input) {
        AppUser.input = input;
    }
}