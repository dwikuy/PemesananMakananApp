/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesananmakananapp;

/**
 *
 * @author PCL-B00-00
 */
  class PesananMakanan implements PesanMakanan{
     private Makanan makanan;
     private int jumlahPesan;
     
     public PesananMakanan(Makanan makanan, int jumlahPesan){
         this.makanan = makanan;
         this.jumlahPesan = jumlahPesan;
     }
     @Override
     public void pesanMakanan(int jumlah){
         jumlahPesan = jumlah;
     }
     @Override
     public double hitungTotalHarga(){
         return makanan.getHarga() * jumlahPesan;
     }
     public String getInfoPesanan(){
         return makanan.menuInfo() + "\nJumlah Pesanan: " + jumlahPesan;
     }
     
     
    
}
