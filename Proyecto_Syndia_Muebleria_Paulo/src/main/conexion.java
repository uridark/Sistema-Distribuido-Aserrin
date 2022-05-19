package main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    Connection conectar = null;
    ServerSocket server = null;
    Socket sc = null;
    DataInputStream in;
    DataOutputStream out;
    final int Puerto = 49667;

    public Connection conexion() throws InstantiationException, IllegalAccessException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String dbURL = "jdbc:sqlserver://DESKTOP-UISA1MN\\SQLEXPRESS;databaseName=MuebleriaPaulodb;encrypt = false;integratedSecurity=true;";
            conectar = DriverManager.getConnection(dbURL);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
