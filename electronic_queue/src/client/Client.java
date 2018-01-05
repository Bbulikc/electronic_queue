package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import client.Const;
import java.io.FileInputStream;
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
			System.out.println("1");
			socket = new Socket(ip, Const.Port);
			
                       //  in = new ObjectInputStream(socket.getInputStream());
                        System.out.println("2");
			out = new ObjectOutputStream(socket.getOutputStream());
                        System.out.println("21");
			
			//out.println(scan.nextLine());

			
			//Resender resend = new Resender();
			
                        System.out.println("3");
                         SocetData sd=new SocetData();
                          // sd.setValue("");
                           //out.writeObject(sd);
                            //in = new ObjectInputStream(socket.getInputStream());
			// resend.start();
			String str = "";
                        System.out.println("31");
			//while (!str.equals("exit")) {
                            System.out.println("32");
				str = scan.nextLine();
                                System.out.println("33");
                               
                              
                                 sd.setValue(str);
                               out.writeObject(sd);
                                  System.out.println("6");
                                 in = new ObjectInputStream(socket.getInputStream());
                                 sd=(SocetData)in.readObject();
                                         System.out.println(sd.getValue());
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

	
	private void close() {
		try {
			in.close();
			out.close();
			socket.close();
		} catch (Exception e) {
			System.err.println("��⮪� �� �뫨 �������!");
		}
	}

	
	
	private class Resender extends Thread {

		private boolean stoped;
		
		
		public void setStop() {
			stoped = true;
		}

		@Override
		public void run() {
			try {
                           
				while (!stoped) {
					//String str = in.readLine();
                                        SocetData sd=new SocetData();
                                       
                                        sd=(SocetData)in.readObject();
                                         System.out.println(sd.getValue());
                                        //String str = in.readLine();
					//System.out.println(str);
                                        if(sd.getValue().indexOf("#number#")>-1){
                                            System.out.println(sd.getValue());
                                        setStop();}
				}
			} catch (IOException e) {
				System.err.println("Ошибка сети");
				e.printStackTrace();
			} catch (ClassNotFoundException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}
	}

}
