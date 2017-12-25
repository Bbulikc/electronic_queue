/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.tableModel;

import Control.ClassTable.Check;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ChechTable extends AbstractTableModel {
            private static final int object_col=-1;
    private static final int id=0;
    private static final int number=1;
    private static final int operatorid=2;  
    private static final int Date=3; 


   
   
    private ArrayList<Check> list;
    private  final String[] columnNames={"id","number","operatorid","Date"};
    
   

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
       Check curent=this.list.get(row);
       
       switch(col){
           case id:{return curent.getId();}
           case number:return curent.getNumber();
           case operatorid:return curent.getOperatorid();
           case Date:return curent.getDate();
           default: return object_col;
       
       }
     
    }
}
