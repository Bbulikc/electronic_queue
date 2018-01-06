/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_queue.Ui;

import client.GetNumber;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iva417
 */

    public class ActionListeners implements ActionListener {
     public void actionPerformed(ActionEvent e) {
         try {
             GetNumber.run();
         } catch (Exception ex) {
             Logger.getLogger(ActionListeners.class.getName()).log(Level.SEVERE, null, ex);
         }
     }

   
   
}

