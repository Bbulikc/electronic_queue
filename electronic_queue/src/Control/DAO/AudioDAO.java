/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.DAO;
import java.io.FileInputStream;
import java.io.InputStream;
/**
 *
 * @author User
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
public class AudioDAO {

    private Connection myConnect;
    public AudioDAO() throws Exception {
        Properties prop=new Properties();
        prop.load(new FileInputStream("src/Control/DAO/info.properties"));
        String user=prop.getProperty("user");
        
        String password=prop.getProperty("password");
        String url=prop.getProperty("url");
        myConnect=DriverManager.getConnection(url,user, password);
                 Class.forName("org.h2.Driver");      
    }
    
    public void Add(Audio newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("insert into AUDIO(url,value) values(?,?)");
        pr.setString(1, newObject.getUrl());
         pr.setString(2, newObject.getValue());
         
        pr.execute();    
    }
    
     public void update(Audio newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("update  AUDIO set url=?,value=? where id=?");
        pr.setString(1, newObject.getUrl());
         pr.setString(2, newObject.getValue());
         pr.setString(3, Integer.toString(newObject.getId()));
         
        pr.executeUpdate();
        
    }
     
     public void delete(Audio newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("delete  from Audio where id=?");
        pr.setString(1, Integer.toString(newObject.getId()));
        pr.execute();
    }
     
      public Audio select(Audio newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("select * from Audio where id=?");
        pr.setString(1, Integer.toString(newObject.getId()));
        //pr.executeQuery();
        ResultSet rs = pr.executeQuery();
        rs.next();
        Audio rezult=new Audio( rs.getInt("id"),rs.getString("url"),rs.getString("value"));
        return rezult;
    }
    
       public ArrayList<Audio> select() throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("select * from Audio ");
       // pr.setString(1, Integer.toString(newAudio.getId()));
        //pr.executeQuery();
        ResultSet rs = pr.executeQuery();
        ArrayList<Audio> result=new ArrayList<Audio>();
        while(rs.next()){
        Audio audio=new Audio( rs.getInt("id"),rs.getString("url"),rs.getString("value"));
        
        result.add(audio);}
        
        
        return result;
    }
      
}
