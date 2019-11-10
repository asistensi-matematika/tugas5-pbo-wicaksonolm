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
public class nonfiksi extends buku {
    private String jenisBuku;
     public nonfiksi(String jenisBuku, String judul, String pengarang, String jenis, int halaman) {
        super(judul, pengarang, jenis, halaman);
        this.jenisBuku = jenisBuku;
    }
     public nonfiksi() {
        super();
        jenisBuku="nonfiksi";
     }
    @Override
    public String getJenisBuku() {
        return jenisBuku;
    }

    @Override
    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }
}
