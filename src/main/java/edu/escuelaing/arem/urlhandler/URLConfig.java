/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.urlhandler;

import edu.escuelaing.arem.servicescustomer.URLReader;
import java.net.URL;

/**
 *
 * @author 2099190
 */
public class URLConfig {
    
    private static String protocol;
    private static String authority;
    private static String host;
    private static int port;
    private static String path;
    private static String query;
    private static String file;
    private static String ref;
    
    public static void printComponents(URL domain){
        
        System.out.println("URL: " +domain);
        System.out.println();
        System.out.println("Protocol: " +getProtocol(domain));
        System.out.println("Authority: " +getAuthority(domain));
        System.out.println("Host: " +getHost(domain));
        System.out.println("Port: " +getPort(domain));
        System.out.println("Path: " +getPath(domain));
        System.out.println("Query: " +getQuery(domain));
        System.out.println("File: " +getFile(domain));
        System.out.println("Ref: " +getRef(domain));
    }
    
    public static String getProtocol(URL domain){
        protocol = domain.getProtocol();
        return protocol;
    }
    
    public static String getAuthority(URL domain){
        authority = domain.getAuthority();
        return authority;
    }
    
    public static String getHost(URL domain){
        host = domain.getHost();
        return host;
    }
    
    public static int getPort(URL domain){
        port = domain.getPort();
        return port;
    }
    
    public static String getPath(URL domain){
        path = domain.getPath();
        return path;
    }
    
    public static String getQuery(URL domain){
        query = domain.getQuery();
        return query;
    }
    
    public static String getFile(URL domain){
        file = domain.getFile();
        return file;
    }
    
    public static String getRef(URL domain){
        ref = domain.getRef();
        return ref;
    }
    
}
