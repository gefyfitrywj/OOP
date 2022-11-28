
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
public class Segitiga {
    String alas, tinggi;
    public void input(){
      alas = JOptionPane.showInputDialog("masukan alas: ");
      tinggi = JOptionPane.showInputDialog("masukan tinggi: ");
      hasil();   
    }
    public double hitung(){
        long a = Long.parseLong(alas);
        long t = Long.parseLong(tinggi);
        return (0.5*a*t);
    }
     public void hasil(){
        
        JOptionPane.showMessageDialog(null,"0.5 *"+"a"+"+"+"t"+"=" + hitung());
    }
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga();
        segitiga1.input();
        
    }
}

