/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_queue;

import electronic_queue.Ui.ActionListeners;
import javax.swing.JButton;

/**
 *
 * @author iva417
 */
public class Button extends JButton{
    private String id;
    private String value;
    private boolean status;
    private String color;
    public Button(String text,int x,int y,int width, int height){
     super(text);
       
     setBounds(x, y, width,height);   
     
     }

    
}
