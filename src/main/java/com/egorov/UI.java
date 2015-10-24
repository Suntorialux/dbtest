package com.egorov;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;


/**
 * Created by Uzed on 17.10.2015.
 */
public class UI extends JFrame {

    private JTable table;
    private DefaultTableModel model;

    public UI(List<User> users) {

        setSize(640,480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Object [] [] data = new Object[users.size()][3];
        for ( int i = 0 ; i <users.size(); i++) {
            data[i][0]= users.get(i).getId();
            data[i][0]= users.get(i).getId();
            data[i][0]= users.get(i).getId();


        };

        Object [] headers = {"id","name","number"};

        model = new DefaultTableModel(data,headers);
        table = new JTable(model);
        table.setAutoCreateRowSorter(true);


        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }

    public static void main(String[] args) {
        UI ui = new UI(null);
        ui.setVisible(true);
    }
    //JFrame frame = new JFrame();


}
