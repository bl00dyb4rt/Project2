package com.b4rt.projecto2.repositories;

import com.b4rt.projecto2.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public static List<User> users = new ArrayList<>();

    static{
        users.add(new User(100, "b4rt", "tecsup", "Jose Manuel"));
        users.add(new User(100, "jose", "tecsup", "Jose Manuel"));

    }

    public static User login(String username, String password){
        for (User user : users){
            if(user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public static User getUser(String username){
        for (User user : users){
            if(user.getUsername().equalsIgnoreCase(username)){
                return user;
            }
        }
        return null;
    }

}

