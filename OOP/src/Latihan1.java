/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
import javax.swing.JOptionPane;

public class Latihan1 {
        public static void main(String[] args) {
                 String input1;
        String input2;
        
        int nilai1;
        int nilai2;
        
        int tambah;
        
        input1 = JOptionPane.showInputDialog("Masukan Angka Pertama : ");
        input2 = JOptionPane.showInputDialog("Masukan Angka Kedua : ");
        
        nilai1 = Integer.parseInt(input1);
        nilai2 = Integer.parseInt(input2);
        
        tambah = nilai1 + nilai2;
        
        JOptionPane.showMessageDialog(null, + nilai1 + " + " + nilai2 + " = " + tambah);
    }
    
}

