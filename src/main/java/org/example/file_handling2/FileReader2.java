package org.example.file_handling2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {


    public static void main(String[] args) {
        File file = new File("/Users/bootcoding/bootcoding-lab/assignment-service/src/main/java/com/bootcoding/lab/config/ApplicationConfig.java");

        // Reader
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while((line = bufferedReader.readLine() ) != null){
                System.out.println(line);
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
