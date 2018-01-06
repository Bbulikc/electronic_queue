/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import client.SocetData;
/**
 *
 * @author iva417
 */
public class GetNumber {
    public static void run() throws Exception{
        new Client();
        printCheck();
    }
    
    private static SocetData date;

    public static SocetData getDate() {
        return date;
    }

    public static void setDate(SocetData date) {
        GetNumber.date = date;
    }
    
    private static void printCheck(){
    String numberValue=date.getValue();
    //print chek
    System.out.println(numberValue);
    }
}
