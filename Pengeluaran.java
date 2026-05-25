/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan13;

/**
 *
 * @author ASUS
 */
public class Pemasukan extends Transaksi {
    private String sumber;
    
    public Pemasukan(String tanggal, String deskripsi, double jumlah, String sumber){
        super(tanggal, deskripsi, jumlah);   
        this.sumber = sumber;
    }
    public String getSumber() {
        return sumber;
    }

    public void setSumber(String sumber) {
        this.sumber = sumber;
    }
    @Override
    public double hitungSaldo(){
            return getJumlah();
    }
}
