package Dao;

import Model.User;

import java.util.ArrayList;

public class UserDao {


    private ArrayList<User> userrs;



    public ArrayList<User> getUserrs() {
        return userrs;
    }

    public void setUserrs(ArrayList<User> userrs) {
        this.userrs = userrs;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "userrs=" + userrs +
                '}';
    }
}

