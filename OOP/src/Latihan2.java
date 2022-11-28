/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
import javax.swing.JOptionPane;

public class Latihan2 {
  private String kode_Barang;
    String nama_Barang;
    int HPP;
    int harga_Jual,stok , jumlah_jual,stok_sekarang,total_bayar,laba;
     public void inputKodeBarang(String kode_Barang){
        this.kode_Barang = kode_Barang;
    }
    public void inputNamaBarang(String nama_Barang){
         this.nama_Barang=nama_Barang;
    }
    public void inputHPP(int HPP){
         this.HPP = HPP;
    }
    public void inputHargaJual(int harga_Jual){
        this.harga_Jual = harga_Jual;
    }
    public void inputStok(int stok){
        this.stok = stok;
    }
    public void inputJumlahJual(int jumlah_jual){
        this.jumlah_jual = jumlah_jual;
        if(jumlah_jual > stok){
            System.out.println("maaf kekurangan stok barang");
        }
    }
    public String tampilkanKodeBarang(){
        return kode_Barang;
    }
    public String tampilkanNamaBarang(){
        return nama_Barang;
    }
    public int tampilkanHargaJual(){
        return  harga_Jual;
    }
    public int tampilkanStok(){
        return stok;
    }
    public int tampilkanJumlahJual(){
        return jumlah_jual;
    }
    public int TampilkanStokSekarang(){
        stok_sekarang = stok - jumlah_jual;

        return stok_sekarang;
    }
    public int tampilkanHPP(){
        return HPP;
    }
    public int tampilkanTotalBayar(){
        total_bayar = harga_Jual * jumlah_jual;
        return total_bayar;
    }
    public int tampilkanLaba(){
         laba = total_bayar - (HPP * jumlah_jual);
         return laba;
    }

    public static void main(String[] args) {
        Latihan2 buku = new Latihan2();
        buku.inputKodeBarang("B001");
        buku.inputNamaBarang("BUKU GAMBAR");
        buku.inputHPP(2500);
        buku.inputHargaJual(3000);
        buku.inputStok(5);
        buku.inputJumlahJual(2);
        System.out.println("INPUT : ");
        System.out.println("Kode Barang : "+ buku.tampilkanKodeBarang());
        System.out.println("Nama Barang : "+buku.tampilkanNamaBarang());
        System.out.println("HPP         : "+buku.tampilkanHPP());
        System.out.println("Harga Jual  : "+buku.tampilkanHargaJual());
        System.out.println("Stok        : "+buku.tampilkanStok());
        System.out.println("Jumlah Jual : "+buku.tampilkanJumlahJual());
        System.out.println("OUTPUT : ");
        System.out.println("Stok Sekarang : "+buku.TampilkanStokSekarang());
        System.out.println("Total Bayar   : "+buku.tampilkanTotalBayar());
        System.out.println("Laba          : "+buku.tampilkanLaba());
    }
}

