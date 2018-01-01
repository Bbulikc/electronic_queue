/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_queue;
import Control.DAO.*;
import electronic_queue.Ui.*;
import Control.DAO.*;
import Control.tableModel.AudioTable;
import java.sql.SQLException;
import java.util.ArrayList;
import electronic_queue.Ui.*;
import javax.swing.JButton;
/**
 *
 * @author User
 */
public class Electronic_queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Helloy World");
       // Operatorsettings os=new Operatorsettings();
       // os.setVisible(true);
       Terminal terminal=new Terminal();
        //terminal.setUndecorated(true);
      //  terminal.c
       terminal.setVisible(true);
      
   /*  try{
      /*    // System.out.println("Helloy World");
           Audio a2=new Audio(2,"t8585t","jnc");
           
     AudioDAO a=new AudioDAO();
    // a2.setId(2);
           
  //a2.setUrl("hef");
   //  a.Add(a2);
    //a.update(a2);
  //  a2=a.select(a2);
  //  System.out.println(a2.getUrl());
   ArrayList<Audio> p=a.select();
    for( Audio t:p ){
      System.out.println(t.getUrl());
    }
    
    }
    // catch(SQLException e){
   //  System.out.print(e.getMessage());}
     catch(Exception e){
     System.out.print(e.getMessage());}
    // AudioTable aaa=new AudioTable(a.select());
     
       //NewJFrame nj=new New JFrame();
      // terminal.setVisible(true);*/
  // Terminal terminal=new Terminal("ds");
   
   
   
    }
    
}
