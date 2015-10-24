package com.egorov;



import java.sql.SQLException;
import java.util.List;


/**
 * Created by Uzed on 17.10.2015.
 */
public class ConsoleUI  {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        TestTable testTable= new TestTable();
        List<User> user = testTable.getAll();

    }




}
