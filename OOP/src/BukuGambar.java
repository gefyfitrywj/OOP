/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
public class BukuGambar extends Barang{
            int HPP , harga_jual , Stok,jumlah_jual;
public BukuGambar(String nama,String kode,int HPP,int harga_jual,int Stok){
        super(nama,kode);
        this.HPP = HPP;
        this.harga_jual = harga_jual;
        this.Stok = Stok;

    }
    public void tampilkanOutput(int jumlah_jual){
        System.out.println("INPUT:");
        super.TampilkanBarang();
        System.out.println("HPP: "+HPP);
        System.out.println("Harga Jual: "+harga_jual);
        System.out.println("Stok: "+Stok);
        System.out.println("Jumlah Jual: " + jumlah_jual);
        System.out.println("OUTPUT: ");
        System.out.println("Stok Sekarang: "+ (Stok-jumlah_jual));
        System.out.println("Total Bayar: "+(harga_jual*jumlah_jual));
        System.out.println("laba:"+(harga_jual*jumlah_jual-(HPP*jumlah_jual)));

    }
}

