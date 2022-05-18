/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.io.IOException;
import static posttest6.Posttest6.dataGroup;
import static posttest6.Posttest6.dataSolo;
import static posttest6.Posttest6.home;
import static posttest6.Posttest6.input;

/**
 *
 * @author ASUS
 */
public class Admin implements Akunlv1{
    private String username, password;

    public Admin(String username, String password) {
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
    
    static void jenisBand() throws IOException {
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
        System.out.println("+------------------------------------+");
        System.out.println("|               M E N U              |");
        System.out.println("| [1] Lihat Pesanan                  |");
        System.out.println("| [2] Update Data Pesanan            |");
        System.out.println("| [3] Hapus Pesanan                  |");
        System.out.println("| [4] Logout                         |");
        System.out.println("| [0] Keluar                         |");
        System.out.println("+------------------------------------+");
        System.out.print("Pilih Menu : ");
                    
        int pilih = Integer.parseInt(input.readLine());
        
        switch(pilih){
            case 1 :
                showOrder();
            case 2 : 
                updateOrder();
            case 3 : 
                deleteOrder();
            case 4 : 
                home();
            case 0 : 
                keluar();
            default : 
                System.out.println("\nMenu tidak tersedia!\n"); 
        }
        
    }

    @Override
    public void showOrder() throws IOException {
        System.out.println("\n+------------------------------------+");
        System.out.println("|            Lihat Pesanan           |");
        System.out.println("+------------------------------------+");
        System.out.println("| Kategori:                          |");
        System.out.println("| [1] Group Band                     |");
        System.out.println("| [2] Solo                           |");
        System.out.println("| [9] Kembali                        |");
        System.out.println("+------------------------------------+");
        System.out.print("Pilih Kategori : ");
                    
        int tipe = Integer.parseInt(input.readLine());
        
        switch(tipe){
            case 1 -> showGroup();
            case 2 -> showSolo();
            case 9 -> menu();
            default -> System.out.println("\nMenu tidak tersedia!\n"); 
        }
        menu();
        
    }
    
    static void showGroup()throws IOException {
        if(dataGroup.isEmpty()){
            System.out.println("\n          Tidak ada pesanan!\n");
        }
        else{
            System.out.println("\n+------------------------------------+");
            System.out.println("|            Lihat Pesanan           |");
            System.out.println("|       Group Band Merchandise       |");
            System.out.println("+------------------------------------+");
            for(int i = 0; i < dataGroup.size(); i++){
                System.out.println("\nPesanan ke-" + (i + 1));
                dataGroup.get(i).tampil();
                dataGroup.get(i).total(i);
            }
        }
        
    }
    
    static void showSolo()throws IOException {
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
        
    }

    @Override
    public void updateOrder() throws IOException {
        System.out.println("\n+------------------------------------+");
        System.out.println("|           Update Pesanan           |");
        System.out.println("+------------------------------------+");
        System.out.println("| Kategori:                          |");
        System.out.println("| [1] Group Band                     |");
        System.out.println("| [2] Solo                           |");
        System.out.println("| [9] Kembali                        |");
        System.out.println("+------------------------------------+");
        System.out.print("Pilih Kategori : ");
                    
        int tipe = Integer.parseInt(input.readLine());
        
        switch(tipe){
            case 1 -> updateGroup();
            case 2 -> updateSolo();
            case 9 -> menu();
            default -> System.out.println("\nMenu tidak tersedia!\n"); 
        }
    }
    
    static void updateGroup() throws IOException {
        if(dataGroup.isEmpty()){
            System.out.println("\n          Tidak ada pesanan!\n");
        }
        else{
            System.out.println("\n+------------------------------------+");
            System.out.println("|           Update Pesanan           |");
            System.out.println("|       Group Band Merchandise       |");
            System.out.println("+------------------------------------+");
            System.out.print("\nInput nama pemesan : ");
            String edit = input.readLine();
            for (Groupband group : dataGroup) {
                if (group.getFan().equals(edit)) {
                    System.out.print("\nTanggal Pemesanan (DD/MM/YY): ");
                    group.setTanggal(input.readLine());
                    System.out.print("Nama Pemesan          : ");
                    group.setFan(input.readLine());
                    System.out.print("Alamat Pemesan        : ");    
                    group.setAlamat(input.readLine());
                    System.out.print("Email Pemesan         : ");  
                    group.setEmail(input.readLine());
                    jenisBand();
                    System.out.print("Group Band            : ");
                    group.setNama(input.readLine());
                    System.out.print("Album                 : ");
                    group.setAlbum(input.readLine());
                    System.out.print("Jumlah Album          : ");
                    group.setjAlbum(Integer.parseInt(input.readLine()));
                    System.out.print("Jumlah Lightstick     : ");
                    group.setLightstick(Integer.parseInt(input.readLine()));
                    System.out.print("PC All Members        : ");
                    group.setPc(Integer.parseInt(input.readLine()));
                    System.out.print("PC Bias (Nama)        : ");
                    group.setPc_member(input.readLine());
                    System.out.print("Jumlah PC Bias        : ");
                    group.setPcBias(Integer.parseInt(input.readLine()));
                    
                    System.out.println("\nData telah diperbarui.\n");
                    break;
                }
                else{
                    System.out.println("\nMaaf, data tidak ditemukan!\n");
                    updateGroup();
                }
            }
        }
        
    }
    
    static void updateSolo() throws IOException {
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
        
    }
    
    @Override
    public void deleteOrder() throws IOException{
        System.out.println("\n+------------------------------------+");
        System.out.println("|            Hapus Pesanan           |");
        System.out.println("+------------------------------------+");
        System.out.println("| Kategori:                          |");
        System.out.println("| [1] Group Band                     |");
        System.out.println("| [2] Solo                           |");
        System.out.println("| [9] Kembali                        |");
        System.out.println("+------------------------------------+");
        System.out.print("Pilih Kategori : ");
                    
        int tipe = Integer.parseInt(input.readLine());
        
        switch(tipe){
            case 1 -> deleteGroup();
            case 2 -> deleteSolo();
            case 9 -> menu();
            default -> System.out.println("\nMenu tidak tersedia!\n"); 
        }
        
    }
    
    static void deleteGroup() throws IOException{
        if(dataGroup.isEmpty()){
            System.out.println("\n          Tidak ada pesanan!\n");
        }
        else{
            System.out.println("\n+------------------------------------+");
            System.out.println("|            Hapus Pesanan           |");
            System.out.println("|       Group Band Merchandise       |");
            System.out.println("+------------------------------------+");
            System.out.print("\nInput nama pemesan : ");
            String fan = input.readLine();
            for (int i = 0; i < dataGroup.size(); i++) {
                if (dataGroup.get(i).getFan().equals(fan)) {
                    dataGroup.remove(i);
                    System.out.println("\nData berhasil dihapus\n");
                    break;
                }
                else{
                    System.out.println("\nMaaf, data tidak ditemukan!\n");
                    deleteGroup();
                }
            }   
        }
        
    }
    
    static void deleteSolo() throws IOException{
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
        
    }
    
    static void keluar() {
        System.out.println("\nThank You. Bye~\n");
        System.exit(0);
        
    }

}
