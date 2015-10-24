package com.egorov;

import java.sql.*;

/**
 * Created by Uzed on 17.10.2015.
 */
public class Select {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "dbuser" , "123");

        Statement statement = conn.createStatement();
        statement.executeUpdate("insert into test (Name, Number) values ('asdf',234.987)");

        ResultSet dataSet =  statement.executeQuery("select * from test");
        while(dataSet.next()) {
            int id = dataSet.getInt("Id");
            String s = dataSet.getString("Name");
            System.out.format("ID=%d Name=%s\n",id,s);
        }
        conn.close();
    }
}
