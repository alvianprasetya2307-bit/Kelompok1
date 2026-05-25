/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan13;

/**
 *
 * @author ASUS
 */
public class Pengeluaran extends Transaksi {
    private String jenis;

   
    public Pengeluaran(String tanggal, String deskripsi, double jumlah, String jenis){
        super(tanggal, deskripsi, jumlah);
        this.jenis = jenis;
    }
    
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    @Override
    public double hitungSaldo(){
        double total = getJumlah();
        if(jenis.equalsIgnoreCase("UKT")) {
            total += 2000;
        }else if (jenis.equalsIgnoreCase("Hiburan")){
            total += getJumlah() * 0.11;
        }
        return total;
    }
}
