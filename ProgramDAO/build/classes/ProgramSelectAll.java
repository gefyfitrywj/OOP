/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
import java.util.List;
public class ProgramSelectAll {
    
    public static void main(String[] args) {
      fasilitas perintah = new fasilitas();
      List<barang> list = perintah.selectAll();
      for(barang barang : list){
        System.out.println(barang.getKode_barang());
        System.out.println(barang.getNama_barang());
        System.out.println(barang.getJumlah());
        System.out.println(barang.getHarga());
        System.out.println("-------------------------");
       }
    }
}

