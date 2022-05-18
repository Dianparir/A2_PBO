/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author ASUS
 */
public abstract class Idol {
    protected  String kategori, nama, album;
    protected int jAlbum, lightstick, pc;

    protected Idol(String nama, String album, int jAlbum, int lightstick, int pc) {
        this.nama = nama;
        this.album = album;
        this.jAlbum = jAlbum;
        this.lightstick = lightstick;
        this.pc = pc;
    }
    
    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected String getAlbum() {
        return album;
    }

    protected void setAlbum(String album) {
        this.album = album;
    }

    public int getjAlbum() {
        return jAlbum;
    }

    public void setjAlbum(int jAlbum) {
        this.jAlbum = jAlbum;
    }

    protected int getLightstick() {
        return lightstick;
    }

    protected void setLightstick(int lightstick) {
        this.lightstick = lightstick;
    }

    protected int getPc() {
        return pc;
    }

    protected void setPc(int pc) {
        this.pc = pc;
    }
    
    abstract void tampil();
    
    void info() {
        System.out.println("Pastikan tidak ada kesalahan dalam mencatat data pemesanan.\n");
    }
    
}