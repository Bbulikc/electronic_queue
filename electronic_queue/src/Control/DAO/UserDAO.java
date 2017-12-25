/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.DAO;

import Control.ClassTable.AUDIO;
import Control.ClassTable.User;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author User
 */
public class UserDAO {
    
    private Connection myConnect;
     public UserDAO() throws Exception {
        Properties prop=new Properties();
        prop.load(new FileInputStream("info.properties"));
        String user=prop.getProperty("user");
        String password=prop.getProperty("password");
        String url=prop.getProperty("url");
        myConnect=DriverManager.getConnection(user, password, url);
                       
    }
    
    public void Add(User newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("insert into User('login','password') values(?,?)");
        pr.setString(1, newObject.getLogin());
         pr.setString(2, newObject.getPassword());
         
        pr.executeQuery();    
    }
    
     public void update(User newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("update  User set login=?,password=? where id=?");
         pr.setString(1, newObject.getLogin());
         pr.setString(2, newObject.getPassword());
         pr.setString(3, Integer.toString(newObject.getId()));
         
        pr.executeUpdate();
        
    }
     
     public void delete(User newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("delete * from User where id=?");
        pr.setString(1, Integer.toString(newObject.getId()));
        pr.executeQuery();
    }
     
      public AUDIO select(User newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("select * from User where id=?");
        pr.setString(1, Integer.toString(newObject.getId()));
        //pr.executeQuery();
        ResultSet rs = pr.executeQuery();
        AUDIO rezult=new AUDIO( rs.getInt("id"),rs.getString("login"),rs.getString("password"));
        return rezult;
    }
    
       public ArrayList<User> select() throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("select * from User ");
       // pr.setString(1, Integer.toString(newAudio.getId()));
        //pr.executeQuery();
        ResultSet rs = pr.executeQuery();
        ArrayList<User> result=new ArrayList<User>();
        while(rs.wasNull()){
        User user=new User( rs.getInt("id"),rs.getString("login"),rs.getString("password"));
        rs.next();
        result.add(user);}
        
        
        return result;
    }
      
}
