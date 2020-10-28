package fr.lille.ios;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread{
	
	Socket socket ;
	Request request;
	
	public ServerThread(Socket ss) {
		// TODO Auto-generated constructor stub
		this.socket = ss;
	}

	public void run() {
		
		try {
			request = new Request(socket);
			RequestAnalyzer reqAnalyse = new RequestAnalyzer();
			reqAnalyse.handleRequest(request);
			socket.close();
			System.out.println("connexion fermee");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
