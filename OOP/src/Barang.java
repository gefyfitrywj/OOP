/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
public class Barang {
    String kode;
    private String nama;
    public Barang(String kode,String nama){
        this.kode = kode;
        this.nama = nama;
    }
    public void TampilkanBarang(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama : "+nama );
    }
}
