/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
import java.io.*;
public class InputMerk1 {
    public static void main(String[] args) throws IOException {
              BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String merk;
        System.out.println("Masukan Merk : ");
        merk = input.readLine();
        System.out.println("Merk motor ini adalah " + merk);
    }  
}

