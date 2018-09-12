package edu.escuelaing.arem.servicescustomer;

import edu.escuelaing.arem.socketserver.QueryClient;
import edu.escuelaing.arem.socketserver.QueryServer;
import edu.escuelaing.arem.urlhandler.URLConfig;
import edu.escuelaing.arem.urlhandler.URLInput;
import java.net.*;

public class URLReader {

    public static void main(String[] args) throws Exception {
        
        URLConfig urlStatements= new URLConfig();
        URLInput receiveInput= new URLInput();
        receiveInput.askURL();
        URL page = receiveInput.readURL();
        urlStatements.printComponents(page);  
        receiveInput.createHTML();    
    }
}