package com.netec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConeccionDao {
    
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void Conectar(){
        String url = "jdbc:derby://localhost:1527/BaseTest";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String userName = "root";
        String password = "root";
        
        try{
            
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Conexion exitosa");
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void cerrar(){
        try {
            if(con != null && !con.isClosed()){
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ConeccionDao con = new ConeccionDao();
        con.Conectar();
    }
    
}
