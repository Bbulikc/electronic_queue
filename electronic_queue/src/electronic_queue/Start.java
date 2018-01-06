/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_queue;

import electronic_queue.Ui.Registratorsettings;
import electronic_queue.Ui.Terminal;
import electronic_queue.Ui.Terminal1;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author iva417
 */
public class Start {
    static GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
    public static void run(){
     
      if(!СheckSettings.CheckConnection()){
          
      
           Registratorsettings rseting=new Registratorsettings();
          rseting.SetActivePanel(2);
            rseting.MessageConnectError();
           rseting.setVisible(true);
      }else{
          
            Terminal terminal=new Terminal();
       terminal.setVisible(true);
       //device.setFullScreenWindow(terminal);
       
       }
     
    }
}
