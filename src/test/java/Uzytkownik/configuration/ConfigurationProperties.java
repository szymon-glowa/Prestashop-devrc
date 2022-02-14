package Uzytkownik.configuration;

import java.util.Properties;

public class ConfigurationProperties {

    private static Properties properties;

    private ConfigurationProperties(){

    }
    //Metoda służy do załadowania obiektu properties do statycznego obiektu typu Properties, dostępnego dla wszystkich
    // wątków
    public static void setProperties(Properties properties){
        ConfigurationProperties.properties=properties;
    }

    //Metoda zwraca nam wszystkie załadowane properties, jeśli nie są one null-em
    public static Properties getProperties(){
        if(properties==null){
            throw new IllegalStateException("Please set properties using setProperties() before calling getProperties()");
        }
        return properties;
    }

}
