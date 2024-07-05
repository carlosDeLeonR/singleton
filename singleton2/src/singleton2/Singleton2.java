/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton2;

/**
 *
 * @author Carlos Andres
 */
public class Singleton2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AppConfig config = AppConfig.getInstance();
        config.setServerUrl("http://miapi.com");
        System.out.println("URL del Servidor antiguo: " + config.getServerUrl());
        
        config.setServerUrl("http://tuapi.com.com");
        System.out.println("URL del Servidor nuevo: " + config.getServerUrl());
// TODO code application logic here
    }
    
}
