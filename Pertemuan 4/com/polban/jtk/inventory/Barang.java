package com.polban.jtk.inventory;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;

    public void setStok(int stok) {
        this.stok += stok;
    }

    public int getStok(){
        return this.stok;
    }

    public String getNamaBarang(){
        return this.nama_barang;
    }

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}