package ir.maktab92.onlineshop.service;

import ir.maktab92.onlineshop.base.domain.User;
import ir.maktab92.onlineshop.repository.Database;

public class SignIn {
    Database database = new Database();


    public void saveUser(User user) {
        User[] users =database.getUsers();
        for (int i = 0; i < database.getUsers().length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }

        }
        database.setUsers(users);
    }

    public boolean getUserInfo(String emailAddress, String password) {
        User user = new User();
        for (int i = 0; i < database.getUsers().length; i++) {
            if (database.getUsers()[i] != null) user = database.getUsers()[i];
            if (user.getEmailAddress().equals(emailAddress) && user.getPassword().equals(password)) return true;
        }
        return false;
    }
}
