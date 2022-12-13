/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import com.stripbandunk.jwidget.annotation.TableColumn;

public class barang {
    @TableColumn(number=1, name ="KODE BARANG")
    private String kode_barang;
    @TableColumn(number=2, name ="NAMA BARANG")
    private String nama_barang;
    @TableColumn(number=3, name ="JUMLAH")
    private int jumlah;
    @TableColumn(number=1, name ="HARGA")
    private long harga; 
    
    
  
    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }
}

