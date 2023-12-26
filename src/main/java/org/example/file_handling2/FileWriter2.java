package org.example.file_handling2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2 {
    public static void main(String[] args) {


        try{

            FileWriter fw = new FileWriter(new File("./output.txt"), true);

           for(int i = 0; i < 10; i++){
               fw.write(generateData());
           }
            fw.flush();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private static String generateData() {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 10000; i++){
            sb.append("java -javaagent:/Applications/IntelliJ IDEA CE.app/C");
            sb.append("\n");
        }
        return sb.toString();
    }
}
