package com.company;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileReader reader = null;
        try{
            reader = new FileReader("file.txt");
        }
        catch(Exception ex){

        }
        finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
