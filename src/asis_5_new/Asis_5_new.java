/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asis_5_new;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Asis_5_new {

    public static void main(String[] args) {
        awal();

    }

    public static void header(String PERPUSTAKAAN) {
        File file = new File(PERPUSTAKAAN);
        String encoding = "utf-8";
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file), encoding)) {
            int data = isr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = isr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void awal() {
        int prem = 0;

        Scanner in = new Scanner(System.in);
        buku[] perpus = new buku[1000];
        Random rand = new Random();

        double hnf = 0;
        double hf = 0;
        double hal = hf + hnf;
        int f = 0;
        int nf = 0;
        int jum = 3;
        int jb = f + nf;
        double devf = 0;
        double devnf = 0;
        double devbof = 0;
        int prob = rand.nextInt(2)+1;
        //prob
        prob=(prob%2)+1;
        
        
        for (int i = 0; i < perpus.length; i++) {
            if (prob == 1) {
                perpus[i] = new fiksi();
            } else {
                perpus[i] = new nonfiksi();
            }
        }

        //buku awal yang langsung tersedia
        for (int i = 0; i < 3; i++) {
            if (prob == 1) {
                perpus[i] = new buku("atta bebi", "vivat thoriq", "fiksi", 300);
                f++;
                jb++;
                hf += 300;
            } else {
                perpus[i] = new buku("perjalanan", "ashiap gledek", "nonfiksi", 300);
                nf++;
                jb++;
                hnf += 300;
            }
        }
        do {
            
            try {
                header("C:\\Users\\Asus\\Documents\\NetBeansProjects\\asis_5_new\\src\\asis_5_new\\judul.txt");

                System.out.println("\n[1]. input buku baru\n"
                        + "[2]. modifikisi detail buku\n"
                        + "[3]. hapus buku\n"
                        + "[0]. EXIT");
                garis();
                //hitungan

                
                double rnf = hnf / nf;
                double rf = hf / f;
                double r2 = hal / jum;
                for (int i = 0; i < jum; i++) {
                    devbof += Math.pow((perpus[i].getHalaman() - r2), 2);
                }
                for (int i = 0; i < jum; i++) {
                    if ("fiksi".equals(perpus[i].getJenisBuku())) {
                        devf += Math.pow((perpus[i].getHalaman() - rf), 2);
                    } else {
                        devnf += Math.pow((perpus[i].getHalaman() - rnf), 2);
                    }
                }

                System.out.println("Jumlah buku di dalam perpustakaan:  " + jum + "\n"
                        + "Rata-rata halaman buku dalam perpustakaan:  " + r2 + "\n"
                        + "Standar deviasi halaman buku dalam perpustakaan: " + devbof);
                garis();
                System.out.println("Jumlah Buku Fiksi dalam perpustakaan: " + f + "\n"
                        + "Rata-rata halaman Buku Fiksi dalam perpustakaan: " + rf + "\n"
                        + "Standar deviasi halaman Buku Fiksi dalam perpustakaan: " + devf);
                garis();
                System.out.println("Jumlah Buku Non Fiksi dalam perpustakaan : " + nf + "\n"
                        + "Rata-rata halaman Buku Non Fiksi dalam perpustakaan: " + rnf + "\n"
                        + "Standar deviasi halaman Buku Non Fiksi dalam perpustakaan: " + devnf);
                garis();

                int pilih = in.nextInt();
                int param = 1;

                switch (pilih) {
                    case 0:
                        System.exit(0);

                    case 1:

                        try {
                            header("C:\\Users\\Asus\\Documents\\NetBeansProjects\\asis_5_new\\src\\asis_5_new\\bukubaru.txt");
                            jum++;
                            try {
                            System.out.print("input judul buku : \n> ");
                            String judul = in.next();
                            perpus[jum - 1].setJudul(judul);
                            System.out.print("input pengarang buku : \n> ");
                            String pengarang = in.next();
                            perpus[jum - 1].setPengarang(pengarang);
                            
                                System.out.print("input jumlah halaman buku : \n> ");
                                int halaman = in.nextInt();
                                perpus[jum - 1].setHalaman(halaman);
                            } catch (Exception e) {
                                
                                System.out.println("masukan bilangan bulat!!");
                                
                            }
                            
                            for (int i = 0; i < jum; i++) {
                                if ("fiksi".equals(perpus[i].getJenisBuku())) {
                                    devf+= Math.pow((perpus[i].getHalaman() - rf), 2);
                                } else {
                                    
                                    devnf += Math.pow((perpus[i].getHalaman() - rnf), 2);
                                }
                            }
                            if ("fiksi".equals(perpus[jum-1].getJenisBuku())) {
                                f++;
                            } else {
                                nf++;
                            }

                        } catch (Exception e) {
                            System.out.println("masukan halaman dengan format bilangan bulat!");
                            

                        }
                        break;
                    case 2:
                        try {
                            header("C:\\Users\\Asus\\Documents\\NetBeansProjects\\asis_5_new\\src\\asis_5_new\\ubahbuku.txt");
                            System.out.println("pilih buku yang di ubah");
                            for (int i = 0; i < jum; i++) {
                                System.out.println("[" + (i + 1) + "] " + perpus[i].getJudul() + "\t| " + perpus[i].getPengarang());
                            }
                            int c = in.nextInt();
                            if ("fiksi".equals(perpus[c - 1].getJenisBuku())) {
                                System.out.print("input judul buku : \n> ");
                                String judul = in.next();
                                perpus[c - 1].setJudul(judul);
                                System.out.print("input pengarang buku : \n> ");
                                String pengarang = in.next();
                                perpus[c - 1].setPengarang(pengarang);
                                try {
                                    System.out.print("input jumlah halaman buku : \n> ");
                                    int halaman = in.nextInt();
                                    perpus[c - 1].setHalaman(halaman);
                                } catch (Exception e) {
                                    System.out.println("masukan bilangan bulat!!");
                                }

                            } else {
                                System.out.print("input judul buku : \n> ");
                                String judul = in.next();
                                perpus[c - 1].setJudul(judul);
                                System.out.print("input pengarang buku : \n> ");
                                String pengarang = in.next();
                                perpus[c - 1].setPengarang(pengarang);
                                System.out.print("input jumlah halaman buku : \n> ");
                                try {
                                    int halaman = in.nextInt();
                                    perpus[c - 1].setHalaman(halaman);
                                } catch (Exception e) {
                                    System.out.println("masukan bilangan bulat!");
                                }

                            }
                        } catch (Exception e) {
                            System.out.println("masukan pilihan yang ada!! ");
                        }

                        break;
                    case 3:
                        try {
                            header("C:\\Users\\Asus\\Documents\\NetBeansProjects\\asis_5_new\\src\\asis_5_new\\hapusbuku.txt");
                            System.out.println("pilih buku yang akan di hapus: ");
                            for (int i = 0; i < jum; i++) {
                                System.out.println("[" + (i + 1) + "] " + perpus[i].getJudul() + "\t| " + perpus[i].getPengarang());
                            }
                            int c = in.nextInt();
                            perpus[c - 1] = null;
                            for (int i = (c - 1); i < jum; i++) {
                                perpus[i] = perpus[i + 1];
                            }

                            if ("fiksi".equals(perpus[c - 1].getJenisBuku())) {
                                f--;
                            } else {
                                nf--;
                            }
                            jum--;
                        } catch (Exception e) {
                            System.out.println(" pilih buku yang tersedia");
                        }
                        break;

                }
            } catch (Exception e) {
                System.out.println("pilih pilihan yang ada");
            }
        } while (prem == 0);
    }

    public static void garis() {
        System.out.println("=========================================================================================================================================");
    }

}
