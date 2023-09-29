package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import javax.persistence.Query;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        UserServiceImpl userService = new UserServiceImpl();
//        userDaoHibernate.doSomething();
//        userService.saveUser("aibek", "akynbekov", (byte) 23);
//        userService.saveUser("artur", "kanybekov", (byte) 25);
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
//        userService.createUsersTable();
    }
}
