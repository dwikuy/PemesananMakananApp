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
import java.util.Scanner;

public class PemesananMakananApp {
    private static Scanner inp = new Scanner(System.in);
    private static SistemPemesananMakanan sistem = new SistemPemesananMakanan();
    private static ArrayList<Makanan> daftarMakanan = new ArrayList<>();

    public static void main(String[] args) {
        DaftarMakananBaru();

        int pilihan;
        do {
            tampilkanMenuUtama();
            pilihan = inp.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanDaftarMakanan();
                    break;
                case 2:
                    pesanMakanan();
                    break;
                case 3:
                    tampilkanDaftarPesananDanTotalHarga();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan aplikasi kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
    }

    private static void DaftarMakananBaru() {
        daftarMakanan.add(new Makanan("Beef Steak ", 50000, "Main Course"));
        daftarMakanan.add(new Makanan("CranBerry Cheese ", 30000, "Appetizer"));
        daftarMakanan.add(new Makanan("Es Krim ", 15000, "Dessert"));
    }

    private static void tampilkanMenuUtama() {
        System.out.println("\nMenu Utama");
        System.out.println("1. Lihat Daftar Makanan");
        System.out.println("2. Pesan Makanan");
        System.out.println("3. Lihat Daftar Pesanan dan Total Harga");
        System.out.println("4. Keluar");
        System.out.print("Pilih: ");
    }

    private static void tampilkanDaftarMakanan() {
        System.out.println("\nDaftar Makanan:");
        for (int i = 0; i < daftarMakanan.size(); i++) {
            Makanan makanan = daftarMakanan.get(i);
            System.out.println((i + 1) + ". " + makanan.menuInfo());
        }
    }

    private static void pesanMakanan() {
        tampilkanDaftarMakanan();
        System.out.print("Pilih makanan (nomor): ");
        int nomorMakanan = inp.nextInt();
        System.out.print("Jumlah pesanan: ");
        int jumlah = inp.nextInt();

        if (nomorMakanan > 0 && nomorMakanan <= daftarMakanan.size()) {
            Makanan makananDipilih = daftarMakanan.get(nomorMakanan - 1);
            PesananMakanan pesanan = new PesananMakanan(makananDipilih, jumlah);
            sistem.tambahPesanan(pesanan);
            System.out.println("Makanan berhasil dipesan!");
        } else {
            System.out.println("Nomor makanan tidak valid.");
        }
    }

    private static void tampilkanDaftarPesananDanTotalHarga() {
        System.out.println("\nDaftar Pesanan:");
        sistem.tampilkanDaftarPesanan();
        System.out.println("Total Harga: " + sistem.hitungTotalSemuaPesanan());
    }
}