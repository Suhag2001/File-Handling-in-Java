package org.example.file_handling;

import java.io.*;

public class FileWriteEx1 {
    public static void main(String[] args) {


        //OutputStream
        // FileOutputStream
        // FileWriter
        //
//        BufferedWriter

        try{

            String text = "I am learning java";
            FileOutputStream fos = new FileOutputStream(new File("src/main/resources/demo.txt"));
            fos.write(text.getBytes());

            BufferedWriter bmw = new BufferedWriter(new FileWriter(new File("src/main/resources/demo.txt")));
            bmw.write("BMW Car aayegi... 20??");
            bmw.flush();

            PrintStream ps = new PrintStream(new FileOutputStream(new File("src/main/resources/demo.txt"), true));
            ps.println("Test");
            ps.println("Print karenge...");

            System.out.println();
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
