/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
public class ProgramUpdate {
    public static void main(String[] args) {
        fasilitas perintah = new fasilitas();
        barang atk = new barang();
        atk.setKode_barang("B002");
        atk.setNama_barang("BUKU GAMBAR");
        atk.setJumlah(12);
        atk.setHarga(3000);
        perintah.update(atk);
    }
}

