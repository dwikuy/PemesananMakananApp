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
import java.util.ArrayList;

 class SistemPemesananMakanan {
    private ArrayList<PesananMakanan> daftarPesanan;

    public SistemPemesananMakanan() {
        daftarPesanan = new ArrayList<>();
    }

    public void tambahPesanan(PesananMakanan pesanan) {
        daftarPesanan.add(pesanan);
    }

    public void tampilkanDaftarPesanan() {
        for (PesananMakanan pesanan : daftarPesanan) {
            System.out.println(pesanan.getInfoPesanan());
        }
    }

    public double hitungTotalSemuaPesanan() {
        double total = 0;
        for (PesananMakanan pesanan : daftarPesanan) {
            total += pesanan.hitungTotalHarga();
        }
        return total;
    }
}
