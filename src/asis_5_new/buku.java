/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asis_5_new;

/**
 *
 * @author Asus
 */
public class buku extends perpustakaan
{
     private String judul, pengarang, jenisBuku;
    private int halaman;

    public buku() {
        judul = "kosong";
        pengarang = "kosong";
        halaman = 0;
        jenisBuku = "kosong";
    }
        public buku(String judul, String pengarang, String jenisBuku, int halaman) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.jenisBuku = jenisBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getJenisBuku() {
        return jenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }
    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    @Override
    public String toString() {
        return "buku{" + "judul=" + judul + ", pengarang=" + pengarang + ", jenisBuku=" + jenisBuku + ", halaman=" + halaman + '}';
    }

  
   
    
   
    


    
}
