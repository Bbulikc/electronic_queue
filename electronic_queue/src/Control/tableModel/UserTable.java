/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.tableModel;

import Control.ClassTable.Check;
import Control.ClassTable.User;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class UserTable extends AbstractTableModel {
    
    private static final int object_col=-1;
    private static final int id=0;
    private static final int login=1;
    private static final int password=2;  
    


   
   
    private ArrayList<User> list;
    private  final String[] columnNames={"id","login","password"};
    
   

    @Override
    public int getRowCount() {
       return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
       User curent=this.list.get(row);
       
       switch(col){
           case id:{return curent.getId();}
           case login:return curent.getLogin();
           case password:return curent.getPassword();
        
           default: return object_col;
       
       }
     
    }
}
