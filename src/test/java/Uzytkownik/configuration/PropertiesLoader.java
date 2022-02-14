package Uzytkownik.configuration;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class PropertiesLoader {
    private Logger logger= LogManager.getLogger(PropertiesLoader.class);
    //W klasie znajduje się tylko jedna metoda. Służy ona do odczytywania właściwości z zadanego pliku properties
    public Properties getPropertiesFromFile(String propertiesFileName){
        //Tworzymy obiekt InputStream, który posłuży nam  do odczytania pliku properties
        InputStream inputStream =null;
        //Obiekt Properties będzie przechowywał właściwości
        Properties properties=new Properties();
        try
        {
            logger.info("Trying to load properties with file name: " + propertiesFileName);
            //Odczytujemy plik properties i inicjalizujemy obiekt inputStream
            inputStream=getClass().getClassLoader().getResourceAsStream(propertiesFileName);
            //Ładujemy properties w formie InputStream do właściwego obiektu typu Properties
            if(inputStream!=null){
                properties.load(inputStream);
                logger.info("Successfully loaded properties for file: " + propertiesFileName);
            }else{
                throw new FileNotFoundException("Property File"+propertiesFileName+"not found in the classpath");
            }
        }catch(IOException e){
            e.printStackTrace();
            throw new RuntimeException("Cannot load properties due to IOException!");
        }finally {
            closeResource(inputStream);
        }
        return properties;

    }

    private void closeResource(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
