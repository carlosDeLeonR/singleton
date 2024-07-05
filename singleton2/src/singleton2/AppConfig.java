/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton2;

/**
 *
 * @author Carlos Andres
 */
public class AppConfig {

    private static AppConfig instance;
    private String serverUrl;
    private int port;
    
    private AppConfig() {
        // TODO: Inicializa tu configuración aquí si es necesario
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }


    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

// TODO: Métodos adicionales para otras propiedades
}
