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
 class Makanan {
     private String nama;
     private double harga;
     private String jenis;
     
     public Makanan(String nama, double harga, String jenis){
         this.nama = nama;
         this.harga = harga;
         this.jenis = jenis;
         
     }
     public String getNama(){
         return nama;
     }
     public void setNama(String nama){
         this.nama = nama;
     }
     public double getHarga(){
        return harga;
 }
     public void setHarga(){
         this.harga = harga;
     }
     
     public String getJenis(){
        return jenis;
 }
     public void setJenis(){
         this.jenis = jenis;
     }
     
     public String menuInfo(){
         return "\nNama Makanan : " + nama + "\nHarga Makanan: " + harga + "\nJenis Makanan: " + jenis;
     }
     
    
}
