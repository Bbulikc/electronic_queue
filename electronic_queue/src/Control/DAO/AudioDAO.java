/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.DAO;
import java.io.FileInputStream;
import java.io.InputStream;
import Control.ClassTable.AUDIO;
import Control.ClassTable.AUDIO;
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
        prop.load(new FileInputStream("info.properties"));
        String user=prop.getProperty("user");
        String password=prop.getProperty("password");
        String url=prop.getProperty("url");
        myConnect=DriverManager.getConnection(user, password, url);
                       
    }
    
    public void Add(AUDIO newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("insert into AUDIO('url','value') values(?,?)");
        pr.setString(1, newObject.getUrl());
         pr.setString(2, newObject.getValue());
         
        pr.executeQuery();    
    }
    
     public void update(AUDIO newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("update  AUDIO set url=?,value=? where id=?");
        pr.setString(1, newObject.getUrl());
         pr.setString(2, newObject.getValue());
         pr.setString(3, Integer.toString(newObject.getId()));
         
        pr.executeUpdate();
        
    }
     
     public void delete(AUDIO newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("delete * from Audio where id=?");
        pr.setString(1, Integer.toString(newObject.getId()));
        pr.executeQuery();
    }
     
      public AUDIO select(AUDIO newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("select * from Audio where id=?");
        pr.setString(1, Integer.toString(newObject.getId()));
        //pr.executeQuery();
        ResultSet rs = pr.executeQuery();
        AUDIO rezult=new AUDIO( rs.getInt("id"),rs.getString("url"),rs.getString("value"));
        return rezult;
    }
    
       public ArrayList<AUDIO> select() throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("select * from Audio ");
       // pr.setString(1, Integer.toString(newAudio.getId()));
        //pr.executeQuery();
        ResultSet rs = pr.executeQuery();
        ArrayList<AUDIO> result=new ArrayList<AUDIO>();
        while(rs.wasNull()){
        AUDIO audio=new AUDIO( rs.getInt("id"),rs.getString("url"),rs.getString("value"));
        rs.next();
        result.add(audio);}
        
        
        return result;
    }
      
}
