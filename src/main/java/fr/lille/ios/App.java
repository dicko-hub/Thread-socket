package fr.lille.ios;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        Thread server = new Server();
        server.start();
        System.out.println("connexion en attente");
    }
}
