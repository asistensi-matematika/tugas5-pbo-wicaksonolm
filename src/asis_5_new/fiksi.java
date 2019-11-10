/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asis_5_new;


public class fiksi extends buku {
      private String jenisBuku;
     
     public fiksi(String jenisBuku, String judul, String pengarang, String jenis, int halaman) {
        super(judul, pengarang, jenis, halaman);
        this.jenisBuku = jenisBuku;
    }
     public fiksi() {
        super();
        jenisBuku="fiksi";
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
