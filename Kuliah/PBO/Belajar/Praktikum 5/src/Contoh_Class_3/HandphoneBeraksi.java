/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoh_Class_3;

/**
 *
 * @author GESIT
 */
import javax.swing.JOptionPane;
public class HandphoneBeraksi {
    public static void main(String[] args) {
        
        
        boolean ulang = true;
        Handphone handphoneku = new Handphone();
        
        while(ulang == true){
            System.out.println("NUKIE");
            System.out.println("== Menu ==");
            System.out.println("1.  Hidupkan");
            System.out.println("2.  Lakukan Panggilan");
            System.out.println("3.  Kirim SMS");
            System.out.println("4.  Matikan");
            
            String data_N = JOptionPane.showInputDialog("Masukan Pilihan : ");
            int N = Integer.parseInt(data_N);
            
            if(N == 1){
                handphoneku.hidupkan();
            }
            else if(N == 2){
                handphoneku.lakukanPanggilan();
            }
            else if(N == 3){
                handphoneku.kirimSMS();
            }
            else if(N == 4){
                handphoneku.matikan();
                ulang = false;
            }
        }
    }
}
