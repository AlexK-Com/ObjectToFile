package com.mainacad;

import com.mainacad.ObjectData.SourceObject;

import java.io.*;
import java.util.logging.Logger;

public class ApplicationRunner {
    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {
        SourceObject sourceObject = new SourceObject();

        for (int i = 0; i < 10; i++) {

            try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("userData.dat")))
            {
                sourceObject = new SourceObject().getRandomUserInfo();
                objectOutputStream.writeObject(sourceObject);
            }
            catch(Exception ex){

                System.out.println(ex.getMessage());
            }


        }









    }
}
