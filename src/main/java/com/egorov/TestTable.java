package com.egorov;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Uzed on 17.10.2015.
 */
public class TestTable {
    public List<User> getAll() throws ClassNotFoundException, SQLException {
        List<User> user = new ArrayList<User>();
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "dbuser", "123");

        Statement statement = conn.createStatement();
       // statement.executeUpdate("insert into test (Name, Number) values ('asdf',234.987)");

        ResultSet dataSet =  statement.executeQuery("select * from test");
        while(dataSet.next()) {
            int id = dataSet.getInt("Id");

            String s = dataSet.getString("Name");
            
            Double number = dataSet.getDouble("Number");

            user.add(new User(id,s,number));

        }
        conn.close();
        return user;
    }

    public void add (User user) throws ClassNotFoundException, SQLException {


    }




}
