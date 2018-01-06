/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_queue;

import client.Client;
import client.Const;
import client.SocetData;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iva417
 */
public class СheckSettings {
    
    public static boolean status;
    public static boolean CheckConnection()  {
         Properties prop=new Properties();
        try {
            new Client("test");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
                System.out.print("");
               
                  
                
		    return status;
    }
    
    public void ShowSetting(){}
    
    void SetSetting(){}
    
    void SetFrameSetting(){};
    
    
}
