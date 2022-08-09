package com.ldangeles;

import java.sql.SQLException;

public class App {

    public static void main (String[] args){
        try {
            FrontEnd_Sim frontEnd = new FrontEnd_Sim();
            frontEnd.run();
        } catch (SQLException exception){
            System.err.println("Database error");
        }
    }

}
