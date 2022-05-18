/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author ASUS
 */
public final class Solo extends Idol{
    public static final String kategoriB = "Soloist";
    private String group, fan, alamat, email, tanggal;

    protected Solo(String group, String fan, String alamat, String email, String tanggal, String kategori, String nama, String album, int jAlbum, int lightstick, int pc) {
        super(nama, album, jAlbum, lightstick, pc);
        this.group = group;
        this.fan = fan;
        this.alamat = alamat;
        this.email = email;
        this.tanggal = tanggal;
    }

    protected String getGroup() {
        return group;
    }

    protected void setGroup(String group) {
        this.group = group;
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
    
    protected void total(int totalS){
        int total = jAlbum + lightstick + pc;
        System.out.println("Total merchandise   : " + total + " pcs");
    }
    
    @Override
    public void tampil() {
        System.out.println("Tanggal Pemesanan (DD/MM/YY): " + this.tanggal);
        System.out.println("Nama Pemesan        : " + this.fan);
        System.out.println("Alamat Pemesan      : " + this.alamat);
        System.out.println("Email Pemesan       : " + this.email);
        System.out.println("Kategori            : " + this.kategoriB);
        System.out.println("Soloist             : " + this.nama + " of " + this.group);
        System.out.println("Solo Album          : " + this.album + " " + this.jAlbum + " pcs");
        System.out.println("Lightstick          : " + this.lightstick + " pcs");
        System.out.println("Photocards          : " + this.pc + " pcs");   
    }
    
    void done(String solo) {
        System.out.println("\nPesanan atas nama " + solo + " telah dicatat.");
    }
    
    @Override
    void info() {
        System.out.println("Pastikan tidak ada kesalahan dalam mencatat data pemesanan.\n");
    }
    
}
