/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
public class Polymorphisme {
        public static void main(String[] args) {
        BarangPolymorphisme[] barang1 = new BarangPolymorphisme[2];
        barang1[0] = new BukuGambarPolymorphisme("Buku Gambar","B001",2500,3000,5,2);
        barang1[1] = new Pensil("Pensil","P002",1500,1750,10,1);
        for(int i = 0; i<= barang1.length; i++){
            System.out.println("_______________________________");
            barang1[i].TampilkanBarang();
        }
    }
}