/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patungan;

/**
 *
 * @author shinchank
 */
import java.util.*;

public class MenuUtama {

    private int pil;
    final int maxGrup = 5;
    private Grup[] daftarGrup = new Grup[maxGrup];
    private TempatMakan tempatMakan;
    private MenuMakan[] menuMakan;
    private int nGrup = 0;
    Scanner sc;

    public void showMenu() {
        sc = new Scanner(System.in);
        System.out.println("Aplikasi Patungan");
        System.out.println("1. Daftar");
        System.out.println("2. Login");
        System.out.print("Pilihan : ");
        pil = sc.nextInt();
        switch (pil) {
            case 1:
                daftar();
            case 2:
                login();
        }
    }

    public void menuAdmin() {
        sc = new Scanner(System.in);
        do {
            System.out.println("Menu Utama");
            System.out.println("1. Buat grup");
            System.out.println("2. Lihat grup");
            System.out.println("3. Lihat tempat makan");
            System.out.println("4. Cari tempat makan");
            System.out.println("5. Administrasi");
            System.out.println("6. Keluar");
            System.out.print("Pilihan : ");
            pil = sc.nextInt();
            switch (pil) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
            }
        } while (pil != 6);
    }

    public void daftar() {
        sc = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Id : ");
        String id = sc.nextLine();
        Admin admin = new Admin(nama, id);
        System.out.print("Alamat : ");
        System.out.print("No HP : ");
        System.out.print("Facebook (Link) : ");

    }

    public void login() {
        Scanner name = new Scanner(System.in);
        Scanner pass = new Scanner(System.in);
        System.out.print("Username : ");
        name.next();
        System.out.print("Password : ");
        pass.next();
        TempatMakan p = new TempatMakan("Nama1", "Alamat1", "NoTelp1");
        Grup g = new Grup("Grup1");
        g.addTempatMakan(p);
        //System.out.println(g.lihatTempatMakan());
    }

    public void buatGrup(String nama) {
        Grup grup = new Grup(nama);
        daftarGrup[nGrup] = grup;
        nGrup++;
    }

    public String lihatGrup() {
        String lihat = "";
        for (int i = 0; i < nGrup; i++) {
            lihat = lihat + (i + 1) + ". Nama : " + daftarGrup[i].getNamaGrup() + "\nJumlah Anggota : " + daftarGrup[i].getNP();
        }
        return lihat;
    }

    public void administrasi() {
        sc = new Scanner(System.in);
        String nama, alamat, noTelp;
        double harga, pajak;
        System.out.println("1. Tambah tempat makan");
        System.out.println("2. Tambah menu makan");
        System.out.println("3. Edit harga makanan");
        System.out.println("4. Kembali");
        System.out.print("Pilihan : ");
        pil = sc.nextInt();
        switch (pil) {
            case 1:
                System.out.print("Masukkan nama tempat makan : ");
                nama = sc.nextLine();
                System.out.print("Masukkan Alamat tempat makan : ");
                alamat = sc.nextLine();
                System.out.print("Masukkan No Telp tempat makan : ");
                noTelp = sc.nextLine();
                tempatMakan = new TempatMakan(nama, alamat, noTelp);
                daftarGrup[nGrup].addTempatMakan(tempatMakan);
            case 2:
                System.out.print("Masukkan nama makanan : ");
                nama = sc.nextLine();
                System.out.print("Masukkan harga makanan : ");
                harga = sc.nextDouble();
                System.out.print("Masukkan pajak makanan : ");
                pajak = sc.nextDouble();
                menuMakan[nGrup].addMakanan(nama, harga, pajak);
            case 3:
                System.out.print("Masukkan nama tempat makan : ");
                nama = sc.nextLine();
                System.out.print("Masukkan nama makanan : ");
                String nama1 = sc.nextLine();
                if (!daftarGrup[nGrup].cariTempatMakan(nama).equals("-1")) {
                    System.out.println("Nama : " + daftarGrup[nGrup].cariTempatMakan(nama));
                
                    if (!menuMakan[nGrup].cariMakanan(nama).equals("-s1")) {
                        System.out.println("Nama Makanan ;" + menuMakan[nGrup].equals(nama1));
                    } else {
                        System.out.println("File tidak ditemukan");
                    }
                }else{
                        System.out.println("Tempat Makan belum ada");
                }
            case 4:
        }
    }
}
