package fr.lille.ios;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{
	
	private boolean  running = true;
	private static int  port = 8082;

	public void run() {
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while(running) {
			try {
				Socket socket = serverSocket.accept();
				System.out.println("connexion etablie");
				ServerThread serverThread = new ServerThread(socket);
				serverThread.start();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	public void turnOff() {
		running = false;
	}

}
