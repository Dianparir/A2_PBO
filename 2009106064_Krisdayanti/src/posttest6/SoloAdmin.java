/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.io.IOException;
import static posttest6.Posttest6.dataSolo;
import static posttest6.Posttest6.home;
import static posttest6.Posttest6.input;

/**
 *
 * @author ASUS
 */
public class SoloAdmin implements Akunlv2b {
    private String username, password;

    public SoloAdmin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUname() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPw() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void jenisBand() throws IOException {
        System.out.println("\nGroup Band:");
        System.out.println("- AESPA \t - NCT (all unit)");
        System.out.println("- Blackpink \t - Red Velvet");
        System.out.println("- BTS \t\t - Seventeen");
        System.out.println("- ENHYPEN \t - TXT");
        System.out.println("- EXO \t\t - Twice\n");
        
    }
    
    @Override
    public void menu() throws IOException {
        System.out.println("\n+------------------------------------+");
        System.out.println("|     Pemesanan Merchandise KPOP     |");
        System.out.println("|          Kategori Soloist          |");
        System.out.println("+------------------------------------+");
        System.out.println("|               M E N U              |");
        System.out.println("| [1] Tambah Pesanan                 |");
        System.out.println("| [2] Lihat Pesanan                  |");
        System.out.println("| [3] Update Data Pesanan            |");
        System.out.println("| [4] Hapus Pesanan                  |");
        System.out.println("| [5] Logout                         |");
        System.out.println("| [0] Keluar                         |");
        System.out.println("+------------------------------------+");
        System.out.print("Pilih Menu : ");
                    
        int pilih = Integer.parseInt(input.readLine());
        
        switch(pilih){
            case 1 :
                addSolo();
            case 2 :
                showSolo();
            case 3 :
                updateSolo();
            case 4 :
                deleteSolo();
            case 5 :
                home();
            case 0 :
                keluar();
            default :
                System.out.println("\nMenu tidak tersedia!\n"); 
        }
    }

    @Override
    public void addSolo() throws IOException {
        jenisBand();
        System.out.println("\n+------------------------------------+");
        System.out.println("|           Tambah Pesanan           |");
        System.out.println("|          Solo Merchandise          |");
        System.out.println("+------------------------------------+");
        System.out.print("\nTanggal Pemesanan (DD/MM/YY): ");
        String tanggal = input.readLine();
        System.out.print("Nama Pemesan          : ");
        String fan = input.readLine();      
        System.out.print("Alamat Pemesan        : ");    
        String alamat = input.readLine();  
        System.out.print("Email Pemesan         : ");
        String kategori = "Soloist";
        String email = input.readLine(); 
        System.out.print("Soloist               : ");
        String nama = input.readLine();
        System.out.print("Member of             : ");
        String group = input.readLine();
        System.out.print("Solo Album            : ");
        String album = input.readLine();
        System.out.print("Jumlah Album          : ");
        int jAlbum = Integer.parseInt(input.readLine());
        System.out.print("Jumlah Lightstick     : ");
        int lightstick = Integer.parseInt(input.readLine());
        System.out.print("Jumlah Photocards     : ");
        int pc = Integer.parseInt(input.readLine());
        
        Solo newSolo = new Solo(group, fan, alamat, email, tanggal, kategori, nama, album, jAlbum, lightstick, pc);
        newSolo.done(fan);
        newSolo.info();
        dataSolo.add(newSolo);
        
        menu();
        
    }

    @Override
    public void showSolo() throws IOException {
        if(dataSolo.isEmpty()){
            System.out.println("\n          Tidak ada pesanan!\n");
        }
        else{
            System.out.println("\n+------------------------------------+");
            System.out.println("|            Lihat Pesanan           |");
            System.out.println("|          Solo Merchandise          |");
            System.out.println("+------------------------------------+");
            for(int i = 0; i < dataSolo.size(); i++){
                System.out.println("\nPesanan ke-" + (i + 1));
                dataSolo.get(i).tampil();
                dataSolo.get(i).total(i);
            }
        }
        menu();
        
    }

    @Override
    public void updateSolo() throws IOException {
        if(dataSolo.isEmpty()){
            System.out.println("\n          Tidak ada pesanan!\n");
        }
        else{
            System.out.println("\n+------------------------------------+");
            System.out.println("|           Update Pesanan           |");
            System.out.println("|          Solo Merchandise          |");
            System.out.println("+------------------------------------+");
            System.out.print("\nInput nama pemesan : ");
            String edit = input.readLine();
            for (Solo solo : dataSolo) {
                if (solo.getFan().equals(edit)) {
                    System.out.print("\nTanggal Pemesanan (DD/MM/YY): ");
                    solo.setTanggal(input.readLine());
                    System.out.print("Nama Pemesan      : ");
                    solo.setFan(input.readLine());
                    System.out.print("Alamat Pemesan    : ");
                    solo.setAlamat(input.readLine());
                    System.out.print("Email Pemesan     : ");
                    solo.setEmail(input.readLine());
                    System.out.print("Soloist           : ");
                    solo.setNama(input.readLine());
                    System.out.print("Member of         : ");
                    solo.setGroup(input.readLine());
                    System.out.print("Solo Album        : ");
                    solo.setAlbum(input.readLine());
                    System.out.print("Jumlah Album      : ");
                    solo.setjAlbum(Integer.parseInt(input.readLine()));
                    System.out.print("Lightstick        : ");
                    solo.setLightstick(Integer.parseInt(input.readLine()));
                    System.out.print("Photocards        : ");
                    solo.setPc(Integer.parseInt(input.readLine()));
                
                    System.out.println("\nData telah diperbarui.\n");
                    break;
                }
                else{
                    System.out.println("\nMaaf, data tidak ditemukan!\n");
                    updateSolo();
                }
            }
        }
        menu();
        
    }

    @Override
    public void deleteSolo() throws IOException {
        if(dataSolo.isEmpty()){
            System.out.println("\n          Tidak ada pesanan!\n");
        }
        else{
            System.out.println("\n+------------------------------------+");
            System.out.println("|            Hapus Pesanan           |");
            System.out.println("|          Solo Merchandise          |");
            System.out.println("+------------------------------------+");
            System.out.print("\nInput nama pemesan : ");
            String fan = input.readLine();
            for (int i = 0; i < dataSolo.size(); i++) {
                if (dataSolo.get(i).getFan().equals(fan)) {
                    dataSolo.remove(i);
                    System.out.println("\nData berhasil dihapus\n");
                    break;
                }
                else{
                    System.out.println("\nMaaf, data tidak ditemukan!\n");
                    deleteSolo();
                }
            }   
        }
        menu();
        
    }
    
    static void keluar() {
        System.out.println("\nThank You. Bye~\n");
        System.exit(0);
        
    }
    
}
