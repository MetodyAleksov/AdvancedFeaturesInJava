package com.company;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (var reader = new FileReader("file.txt")){
        }
        catch(Exception ex){

        }
    }
}
