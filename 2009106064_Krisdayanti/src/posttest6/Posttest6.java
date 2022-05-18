/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Posttest6 {

    static InputStreamReader inpt = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inpt);
    static ArrayList<Groupband> dataGroup = new ArrayList();
    static ArrayList<Solo> dataSolo = new ArrayList();
    
    
    public static void home () throws IOException{
        ArrayList<Admin> dataAdmin = new ArrayList<>();
        ArrayList<BandAdmin> dataBandAdmin = new ArrayList<>();
        ArrayList<SoloAdmin> dataSoloAdmin = new ArrayList<>();
        dataAdmin.add(new Admin("Admin", "admin01"));
        dataBandAdmin.add(new BandAdmin("Bandmin", "groupband"));
        dataSoloAdmin.add(new SoloAdmin("Solomin", "soloist"));
        
        System.out.println("\n+------------------------------------+");
        System.out.println("|     Pemesanan Merchandise KPOP     |");
        System.out.println("+------------------------------------+");
        System.out.println("|               M E N U              |");
        System.out.println("| [1] Login                          |");
        System.out.println("| [0] Keluar                         |");
        System.out.println("+------------------------------------+");
        System.out.print("Pilih Menu : ");

        int pilih = Integer.parseInt(input.readLine());
           
        if(pilih == 1){
            System.out.println("\nMasukkan Username dan Password Anda");
            System.out.println("+------------------------------------+");
            System.out.println("Username : ");
            String username = input.readLine();
            System.out.println("+------------------------------------+");
            System.out.println("Password : ");
            String password = input.readLine();
            System.out.println("+------------------------------------+\n");
            for (Admin admin : dataAdmin){
                if(username.equals(admin.getUname()) && password.equals(admin.getPw())){
                    admin.menu();
                }
            }
            for(BandAdmin bandmin : dataBandAdmin ){
                if(username.equals(bandmin.getUname()) && password.equals(bandmin.getPw())){
                    bandmin.menu();
                }
            }
            for(SoloAdmin solomin : dataSoloAdmin ){
                if(username.equals(solomin.getUname()) && password.equals(solomin.getPw())){
                    solomin.menu();
                }
            }
                   
        }
        else if (pilih == 0){
            System.exit(0);
        }
        else{
            System.out.println("\nMenu tidak tersedia!\n"); 
            home();
        }
            
//            System.out.println("Username atau Password salah...");
    }
    
    public static void main(String[] args) throws IOException{

//        ArrayList<Admin> dataAdmin = new ArrayList<>();
//        ArrayList<BandAdmin> dataBandAdmin = new ArrayList<>();
//        ArrayList<SoloAdmin> dataSoloAdmin = new ArrayList<>();
//        dataAdmin.add(new Admin("Admin", "admin01"));
//        dataBandAdmin.add(new BandAdmin("Bandmin", "groupband"));
//        dataSoloAdmin.add(new SoloAdmin("Solomin", "soloist"));

        while(true){
            home();
//            System.out.println("\n+------------------------------------+");
//            System.out.println("|     Pemesanan Merchandise KPOP     |");
//            System.out.println("+------------------------------------+");
//            System.out.println("|               M E N U              |");
//            System.out.println("| [1] Login                          |");
//            System.out.println("| [0] Keluar                         |");
//            System.out.println("+------------------------------------+");
//            System.out.print("Pilih Menu : ");
//
//            int pilih = Integer.parseInt(input.readLine());
//           
//            if(pilih == 1){
//                System.out.println("\nMasukkan Username dan Password Anda");
//                System.out.println("+------------------------------------+");
//                System.out.println("Username : ");
//                String username = input.readLine();
//                System.out.println("+------------------------------------+");
//                System.out.println("Password : ");
//                String password = input.readLine();
//                System.out.println("+------------------------------------+\n");
//                for (Admin admin : dataAdmin){
//                    if(username.equals(admin.getUname()) && password.equals(admin.getPw())){
//                        admin.menu();
//                    }
//                }
//                for(BandAdmin bandmin : dataBandAdmin ){
//                    if(username.equals(bandmin.getUname()) && password.equals(bandmin.getPw())){
//                        bandmin.menu();
//                    }
//                }
//                for(SoloAdmin solomin : dataSoloAdmin ){
//                    if(username.equals(solomin.getUname()) && password.equals(solomin.getPw())){
//                        solomin.menu();
//                    }
//                }
//                   
//            }
//            else if (pilih == 0){
//                System.exit(0);
//            }
//            else{
//                System.out.println("\nMenu tidak tersedia!\n"); 
//                continue;
//            }
//            
//            System.out.println("Username atau Password salah...");
        }   
        
    }
}
