/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.DAO;

import Control.ClassTable.Check;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

/**
 *
 * @author User
 */
public class CheckDAO {
    private Connection myConnect;
     public CheckDAO() throws Exception {
        Properties prop=new Properties();
        prop.load(new FileInputStream("info.properties"));
        String user=prop.getProperty("user");
        String password=prop.getProperty("password");
        String url=prop.getProperty("url");
        myConnect=DriverManager.getConnection(user, password, url);
                       
    }
    
    public void Add(Check newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("insert into Check('number','operator','date') values(?,?,?)");
        pr.setString(1, Integer.toString(newObject.getNumber()));
         pr.setString(2, Integer.toString(newObject.getOperatorid()));
         
            pr.setDate(3, new java.sql.Date(newObject.getDate().getTime()));//newObject.getDate()
         
        pr.executeQuery();    
    }
    
     public void update(Check newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("update  Check set number=?,operator=?, date where id=?");
       pr.setString(1, Integer.toString(newObject.getNumber()));
         pr.setString(2, Integer.toString(newObject.getOperatorid()));
         
            pr.setDate(3, new java.sql.Date(newObject.getDate().getTime()));//newObject.getDate()
         
        pr.executeUpdate();
        
    }
     
     public void delete(Check newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("delete * from Check where id=?");
        pr.setString(1, Integer.toString(newObject.getId()));
        pr.executeQuery();
    }
     
      public Check   select(Check newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("select * from Check where id=?");
        pr.setString(1, Integer.toString(newObject.getId()));
        //pr.executeQuery();
        ResultSet rs = pr.executeQuery();
        Check rezult=new Check( rs.getInt("id"),rs.getInt("number"),rs.getInt("operator"),rs.getDate("date"));
        return rezult;
    }
    
       public ArrayList<Check> select() throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("select * from Button ");
       // pr.setString(1, Integer.toString(newAudio.getId()));
        //pr.executeQuery();
        ResultSet rs = pr.executeQuery();
        ArrayList<Check> result=new ArrayList<Check>();
        while(rs.wasNull()){
        Check check=new Check( rs.getInt("id"),rs.getInt("number"),rs.getInt("operator"),rs.getDate("date"));
        rs.next();
        result.add(check);
        }
        
        
        return result;
    }
}
