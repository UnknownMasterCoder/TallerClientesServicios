/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.urlhandler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author 2099190
 */
public class URLInput {
    
    private static String askedPage;
    private static String html = "";
    
    public static String askURL() throws IOException {
        System.out.println("Enter any web page:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        askedPage = reader.readLine();
        System.out.println("Input: "+askedPage);
        return askedPage;
    }
    
    public static URL readURL() throws MalformedURLException {
        URL domain = new URL(askedPage);
        System.out.println("PAGE: ");     
        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(domain.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
                html += inputLine + "\n";
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        return domain;
    }
    
    public static void createHTML() throws IOException {
        FileWriter file = new FileWriter("src/main/java/edu/escuelaing/arem/webpages/resultado.html");
        file.write(html);
        file.close();
    }
}
