package com.auxio.dao;

import com.auxio.model.User;
import com.auxio.model.UserType;

public class UserDAOTest {

    public static void main(String[] args) {

        User user = new User();

        user.setUserName("Vidhula");
        user.setpasswordHash("testHash123");
        user.setUserType(UserType.LISTENER);

        UserDAO userDAO = new UserDAO();

        boolean result = userDAO.createUser(user);

        System.out.println("User created: " + result);
    }
}