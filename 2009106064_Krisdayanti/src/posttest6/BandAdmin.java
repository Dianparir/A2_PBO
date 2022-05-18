/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.io.IOException;
import static posttest6.Posttest6.dataGroup;
import static posttest6.Posttest6.home;
import static posttest6.Posttest6.input;

/**
 *
 * @author ASUS
 */
public class BandAdmin implements Akunlv2a {
    private String username, password;

    public BandAdmin(String username, String password) {
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
        System.out.println("|        Kategori Group Band         |");
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
                addGroup();
            case 2 :
                showGroup();
            case 3 :
                updateGroup();
            case 4 :
                deleteGroup();
            case 5 :
                home();
            case 0 :
                keluar();
            default :
                System.out.println("\nMenu tidak tersedia!\n"); 
        }
    }

    @Override
    public void addGroup() throws IOException {
        jenisBand();
        System.out.println("\n+------------------------------------+");
        System.out.println("|           Tambah Pesanan           |");
        System.out.println("|       Group Band Merchandise       |");
        System.out.println("+------------------------------------+");
        System.out.print("\nTanggal Pemesanan (DD/MM/YY): ");
        String tanggal = input.readLine();
        System.out.print("Nama Pemesan          : ");
        String fan = input.readLine();      
        System.out.print("Alamat Pemesan        : ");    
        String alamat = input.readLine();  
        System.out.print("Email Pemesan         : ");  
        String email = input.readLine(); 
        String kategori = "Group Band";
        jenisBand();
        System.out.print("Group Band            : ");
        String nama = input.readLine();
        System.out.print("Album                 : ");
        String album = input.readLine();
        System.out.print("Jumlah Album          : ");
        int jAlbum = Integer.parseInt(input.readLine());
        System.out.print("Jumlah Lightstick     : ");
        int lightstick = Integer.parseInt(input.readLine());
        System.out.print("PC All Members        : ");
        int pc = Integer.parseInt(input.readLine());
        System.out.print("PC Bias (Nama)        : ");
        String pc_member = input.readLine();
        System.out.print("Jumlah PC Bias        : ");
        int pcBias = Integer.parseInt(input.readLine());
        
        Groupband newGroup = new Groupband(pc_member, fan, alamat, email, tanggal, pcBias, kategori, nama, album, jAlbum, lightstick, pc);
        newGroup.done(fan);
        newGroup.info();
        dataGroup.add(newGroup);
        
        menu();
        
    }

    @Override
    public void showGroup() throws IOException {
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
        menu();
        
    }

    @Override
    public void updateGroup() throws IOException {
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
        menu();
        
    }

    @Override
    public void deleteGroup() throws IOException {
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
        menu();
        
    }
    
    static void keluar() {
        System.out.println("\nThank You. Bye~\n");
        System.exit(0);
        
    }
    
}
