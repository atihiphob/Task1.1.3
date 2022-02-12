package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl tablet = new UserDaoJDBCImpl();
        tablet.createUsersTable();
        tablet.saveUser("Вася", "Пупкин", (byte) 2);
        tablet.saveUser("Вася", "Пупкин", (byte) 2);
        tablet.saveUser("Вася", "Пупкин", (byte) 2);
        tablet.saveUser("Вася", "Пупкин", (byte) 2);
        List <User> userList = tablet.getAllUsers();
        System.out.println(userList);
        tablet.cleanUsersTable();
        tablet.dropUsersTable();

    }
}
