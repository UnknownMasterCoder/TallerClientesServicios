package edu.escuelaing.arem.socketserver;

import java.net.*;
import java.io.*;

public class QueryServer {
    public static void main(String[] args) throws IOException {
        
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }
        
        System.out.println("Ive nothing cool to:");
        
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
        
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String inputLine, outputLine;
        
        while ((inputLine = in.readLine()) != null) {
            System.out.println("Ive nothing cool to do 22:");
            System.out.println("Mensaje: " + inputLine);
            outputLine = "Respuesta: " + inputLine ;
            out.println(outputLine);
            if (outputLine.equals("Respuestas: Bye."))
                break;
        }
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }

    public static void echosServer() throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }
        System.out.println("Server: 1");
        
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
        System.out.println("Server: 2");

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String inputLine, outputLine;
        System.out.println("Server: 3");

        while ((inputLine = in.readLine()) != null) {
            System.out.println("Server: 4");

            System.out.println("Mensaje: " + inputLine);
            outputLine = "Respuesta: " + inputLine;
            out.println(outputLine);
            if (outputLine.equals("Respuestas: Bye.")) {
                break;
            }
        }
        System.out.println("Server: 5");
        
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
        System.out.println("Tempah Servah:");
        
        //QueryClient client = new QueryClient();
        
        //return outputLine;
    }

    public static int squaredServer() throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }
        System.out.println("Ive a cool square to do:");
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String inputLine, outputLine;
        int response;
        int square = 0;

        while ((inputLine = in.readLine()) != null) {
            System.out.println("Ive a cool square to do 22:");

            //System.out.println("Mensaje: " + inputLine);
            outputLine = "Respuesta: " + inputLine;
            
            response = Integer.parseInt(inputLine);
            square = response*response;
            System.out.println(square);
            
            System.out.println();
            if (outputLine.equals("Respuestas: Bye.")) {
                break;
            }
        }
        
        System.out.println("Tempah Server:");
        
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
        
        System.out.println("Ive square:" + square);
        return square;
    }
}