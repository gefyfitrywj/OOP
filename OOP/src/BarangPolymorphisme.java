/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
public class BarangPolymorphisme {
 private String kode, nama;
    int HPP , harga_jual , Stok,jumlah_jual;
    public BarangPolymorphisme(String nama,String kode,int HPP,int harga_jual,int Stok,int jumlah_jual){
        this.kode = kode;
        this.nama = nama;
        this.HPP = HPP;
        this.harga_jual = harga_jual;
        this.Stok = Stok;
        this.jumlah_jual = jumlah_jual;
    }
    public void TampilkanBarang(){
        System.out.println("Kode          : "+kode);
        System.out.println("Nama          : "+nama );
        System.out.println("INPUT:");
        System.out.println("HPP           : "+HPP);
        System.out.println("Harga Jual    : "+harga_jual);
        System.out.println("Stok          : "+Stok);
        System.out.println("Jumlah Jual   : " + jumlah_jual);
        System.out.println("OUTPUT: ");
        System.out.println("Stok Sekarang : "+ (Stok-jumlah_jual));
        System.out.println("Total Bayar   : "+(harga_jual*jumlah_jual));
        System.out.println("laba          :"+(harga_jual*jumlah_jual-(HPP*jumlah_jual)));

    }
}
