/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.tableModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import Control.DAO.Audio;
/**
 *
 * @author User
 */
public class AudioTable extends AbstractTableModel {
    
    
    private static final int object_col=-1;
   private static final int id=0;
    private static final int url=1;
    private static final int value=2;

    private ArrayList<Audio> audio;
    private  final String[] columnNames={"id","url","value"};
    
    public AudioTable(ArrayList<Audio> theAudios) {
        this.audio=theAudios;
        
    }

    @Override
    public int getRowCount() {
       return audio.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
       Audio curentaudio=this.audio.get(row);
       
       switch(col){
           case id:{return curentaudio.getId();}
           case url:return curentaudio.getUrl();
           case value:return curentaudio.getValue();
           default: return object_col;
       
       }
     
    }
    
    
    
}
