package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import client.Const;
import electronic_queue.СheckSettings;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client {
	private ObjectInputStream in;
	private ObjectOutputStream out;
	private Socket socket;

	
	public Client()throws Exception  {
		Scanner scan = new Scanner(System.in);
                 Properties prop=new Properties();
                 
                prop.load(new FileInputStream("src/Control/DAO/info.properties"));
                String ip=prop.getProperty("ipserver");
                String port=prop.getProperty("port");
		
		

		try {
			
			socket = new Socket(ip, Const.Port);
			
                     
			out = new ObjectOutputStream(socket.getOutputStream());
                       
			
			//out.println(scan.nextLine());

			
			//Resender resend = new Resender();
			
                        
                         SocetData sd=new SocetData();
                          // sd.setValue("");
                           //out.writeObject(sd);
                            //in = new ObjectInputStream(socket.getInputStream());
			// resend.start();
			String str = "";
                       
				str = scan.nextLine();
                               
                               
                              
                                 sd.setValue(str);
                               out.writeObject(sd);
                                  System.out.println("6");
                                 in = new ObjectInputStream(socket.getInputStream());
                                 
                                 sd=(SocetData)in.readObject();
                                 GetNumber.setDate(sd);//get number
                                        // System.out.println(sd.getValue());
                                         //close();
				//out.println(sd);
			//}
			//resend.setStop();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		} finally {
			close();
		}
	}

	public Client(String s)  {
		Scanner scan = new Scanner(System.in);
                 Properties prop=new Properties();
                 try {
                prop.load(new FileInputStream("src/Control/DAO/info.properties"));
                String ip=prop.getProperty("ipserver");
                String port=prop.getProperty("port");
		
		

		
			
			socket = new Socket(ip, Const.Port);
			
                     
			out = new ObjectOutputStream(socket.getOutputStream());
                       
			
			//out.println(scan.nextLine());

			
			//Resender resend = new Resender();
			
                        
                         SocetData sd=new SocetData();
                          // sd.setValue("");
                           //out.writeObject(sd);
                            //in = new ObjectInputStream(socket.getInputStream());
			// resend.start();
			String str = "";
                       
				str = "test";
                               
                               
                              
                                 sd.setValue(str);
                               out.writeObject(sd);
                                  System.out.println("6");
                                 in = new ObjectInputStream(socket.getInputStream());
                                 
                                 sd=(SocetData)in.readObject();
                                //get number
                                        // System.out.println(sd.getValue());
                                         //close();
				//out.println(sd);
			//}
			//resend.setStop();
                        СheckSettings.status=true;
		} catch (Exception e) {
			System.out.print(e.getMessage());
                          СheckSettings.status=false;
		} 
                finally {
			close();
		}
	}

	private void close() {
		try {
			in.close();
			out.close();
			socket.close();
		} catch (Exception e) {
			System.err.println("��⮪� �� �뫨 �������!");
		}
	}

	
	
	

}
