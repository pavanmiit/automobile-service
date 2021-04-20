
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MY HP
 */
public class db {
          public static void main(String[] args)
    {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
                PreparedStatement stmt;
                stmt=con.prepareStatement("Create Database autoservice");
                stmt.executeUpdate();
                stmt=con.prepareStatement("use autoservice");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table users(ulogin varchar(20),upass varchar(20),utype varchar(20))");
                stmt.executeUpdate();
                stmt=con.prepareStatement("insert into users values('admin','admin123','admin')");
                stmt.executeUpdate();
                 stmt=con.prepareStatement("Create Table indianstates(states varchar(20),city varchar(30),address varchar(100),contect varchar(10))");
                stmt.executeUpdate();
               stmt=con.prepareStatement("Create Table costumer(name varchar(20),user_id varchar(20),address varchar(100),mobile_number varchar(10),password varchar(10))");
                stmt.executeUpdate();
                 stmt=con.prepareStatement("Create Table orders(name varchar(20),phon_no varchar(10),address varchar(100),service_plan varchar(20),Vehicl_number varchar(20),Vehicl_name varchar(20),date date)");
                stmt.executeUpdate();
                 stmt=con.prepareStatement("Create Table plans(whecihal varchar(15),price varchar(10),facilities varchar(200),start_date date,last_date date)");
                stmt.executeUpdate();
                System.out.println("Done");
        }catch(Exception ee)
        {
            System.out.println(ee);
        }
    }
}
