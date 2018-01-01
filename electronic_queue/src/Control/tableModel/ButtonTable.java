/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.tableModel;

import Control.DAO.Button;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ButtonTable extends AbstractTableModel{
        private static final int object_col=-1;
    private static final int id=0;
    private static final int value=1;
    private static final int parent=2;  
   
  
    private ArrayList<Button> list;
    private  final String[] columnNames={"id","value","parent"};
    
   

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
       Button curentaudio=this.list.get(row);
       
       switch(col){
           case id:{return curentaudio.getId();}
           case parent:return curentaudio.getParent();
           case value:return curentaudio.getValue();
           default: return object_col;
       
       }
     
    }
}
