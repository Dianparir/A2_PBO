/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author ASUS
 */
public class Groupband extends Idol{

    public static final String kategoriA = "Groupband";
    private String pc_member, fan, alamat, email, tanggal;
    private int pcBias;

    protected Groupband(String pc_member, String fan, String alamat, String email, String tanggal, int pcBias, String kategori, String nama, String album, int jAlbum, int lightstick, int pc) {
        super(nama, album, jAlbum, lightstick, pc);
        this.pc_member = pc_member;
        this.fan = fan;
        this.alamat = alamat;
        this.email = email;
        this.tanggal = tanggal;
        this.pcBias = pcBias;
    }

    protected String getPc_member() {
        return pc_member;
    }

    protected void setPc_member(String pc_member) {
        this.pc_member = pc_member;
    }

    protected String getFan() {
        return fan;
    }

    protected void setFan(String fan) {
        this.fan = fan;
    }

    protected String getAlamat() {
        return alamat;
    }

    protected void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected String getTanggal() {
        return tanggal;
    }

    protected void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    protected int getPcBias() {
        return pcBias;
    }

    protected void setPcBias(int pcBias) {
        this.pcBias = pcBias;
    }
    
    protected void total(int totalG){
        int total = jAlbum + lightstick + pc + pcBias;
        System.out.println("Total merchandise   : " + total + " pcs");
    }
    
    @Override
    public void tampil() {
        System.out.println("Tanggal Pemesanan (DD/MM/YY): " + this.tanggal);
        System.out.println("Nama Pemesan        : " + this.fan);
        System.out.println("Alamat Pemesan      : " + this.alamat);
        System.out.println("Email Pemesan       : " + this.email);
        System.out.println("Kategori            : " + this.kategoriA);
        System.out.println("Group Band          : " + this.nama);
        System.out.println("Album               : " + this.album + " " + this.jAlbum + " pcs");
        System.out.println("Lightstick          : " + this.lightstick + " pcs");
        System.out.println("Photocards          : " + this.pc + " pcs");
        System.out.println("PC Bias             : " + this.pc_member + " " + this.pcBias + " pcs");
    }
    
    void done(String gb) {
        System.out.println("\nPesanan Tn/Nn. " + gb + " telah dicatat.");
    }
    
    @Override
    void info() {
        System.out.println("Pastikan tidak ada kesalahan dalam mencatat data pemesanan.\n");
    }

}