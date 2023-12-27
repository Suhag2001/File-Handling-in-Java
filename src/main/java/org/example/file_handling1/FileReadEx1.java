package org.example.file_handling1;

import java.io.*;
import java.util.Scanner;

public class FileReadEx1 {

    public static void main(String[] args) {
        File file = new File("src/main/resources/Online Retail.csv");

        // 1 using BufferedReader
        try{

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            System.out.println(line);
            int i=0 ;
            while((line = br.readLine()) != null){
                if(i++<=10){
                    System.out.println(line);
                }

            }
        }catch (IOException ex){
            ex.printStackTrace();
        }

        // 2 using Scanner
        try{
            Scanner sc = new Scanner(new FileInputStream(file));

            while(sc.hasNext()){
                //System.out.println(sc.nextLine());
            }
        }catch (IOException ex){

        }

        // 3 using FileReader - character wise
        try{

            FileReader fr = new FileReader(file);
            int i = 0;
            while((i = fr.read()) != - 1){
//                System.out.print((char) i);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
