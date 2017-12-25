/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.DAO;

import Control.ClassTable.Button;
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
public class ButtonDAO {
    private Connection myConnect;
     public ButtonDAO() throws Exception {
        Properties prop=new Properties();
        prop.load(new FileInputStream("info.properties"));
        String user=prop.getProperty("user");
        String password=prop.getProperty("password");
        String url=prop.getProperty("url");
        myConnect=DriverManager.getConnection(user, password, url);
                       
    }
    
    public void Add(Button newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("insert into Button('value','parent') values(?,?)");
        pr.setString(1, newObject.getValue());
         pr.setString(2, Integer.toString(newObject.getParent()));
         
        pr.executeQuery();    
    }
    
     public void update(Button newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("update  Button set value=?,parent=? where id=?");
        pr.setString(1, newObject.getValue());
         pr.setString(2, Integer.toString(newObject.getParent()));
         pr.setString(3, Integer.toString(newObject.getId()));
         
        pr.executeUpdate();
        
    }
     
     public void delete(Button newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("delete * from Button where id=?");
        pr.setString(1, Integer.toString(newObject.getId()));
        pr.executeQuery();
    }
     
      public Button  select(Button newObject) throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("select * from Button where id=?");
        pr.setString(1, Integer.toString(newObject.getId()));
        //pr.executeQuery();
        ResultSet rs = pr.executeQuery();
        Button rezult=new Button( rs.getInt("id"),rs.getString("value"),rs.getInt("parent"));
        return rezult;
    }
    
       public ArrayList<Button> select() throws SQLException{
        PreparedStatement pr=null;
        pr=this.myConnect.prepareStatement("select * from Button ");
       // pr.setString(1, Integer.toString(newAudio.getId()));
        //pr.executeQuery();
        ResultSet rs = pr.executeQuery();
        ArrayList<Button> result=new ArrayList<Button>();
        while(rs.wasNull()){
        Button button=new Button( rs.getInt("id"),rs.getString("value"),rs.getInt("parent"));
        rs.next();
        result.add(button);
        }
        
        
        return result;
    }
}
