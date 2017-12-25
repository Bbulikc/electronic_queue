/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.io.FileInputStream;
import java.io.InputStream;
import Control.AUDIO;
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
    
    public void Add(AUDIO newAudio) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("insert into AUDIO('url','value') values(?,?)");
        pr.setString(1, newAudio.getUrl());
         pr.setString(2, newAudio.getValue());
         
        pr.executeQuery();    
    }
    
     public void update(AUDIO newAudio) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("update  AUDIO set url=?,value=? where id=?");
        pr.setString(1, newAudio.getUrl());
         pr.setString(2, newAudio.getValue());
         pr.setString(3, Integer.toString(newAudio.getId()));
         
        pr.executeUpdate();
        
    }
     
     public void delete(AUDIO newAudio) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("delete * from Audio where id=?");
        pr.setString(1, Integer.toString(newAudio.getId()));
        pr.executeQuery();
    }
     
      public AUDIO select(AUDIO newAudio) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("select * from Audio where id=?");
        pr.setString(1, Integer.toString(newAudio.getId()));
        //pr.executeQuery();
        ResultSet rs = pr.executeQuery();
        AUDIO newAud=new AUDIO( rs.getInt("id"),rs.getString("url"),rs.getString("value"));
        return newAud;
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
