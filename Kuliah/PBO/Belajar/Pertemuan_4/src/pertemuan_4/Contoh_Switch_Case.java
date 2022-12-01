/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author GESIT
 */
import javax.swing.*;
public class Contoh_Switch_Case {
    public static void main(String[] args) {
        int A = 100, B = 25;
        System.out.println("Menu Pilihan :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        String data_pilihan = JOptionPane.showInputDialog("Masukan pilihan anda [1-4] : ");
        int pilihan = Integer.parseInt(data_pilihan);
        
        switch (pilihan){
            case 1:{
                int jumlah = A + B;
                System.out.println("Penjumlahan " + A + " + " + B + " = " + jumlah);
                break;
            }
            case 2:{
                int kurang = A - B;
                System.out.println("Penjumlahan " + A + " - " + B + " = " + kurang);
                break;
            }
            case 3:{
                int kali = A * B;
                System.out.println("Penjumlahan " + A + " X " + B + " = " + kali);
                break;
            }
            case 4:{
                float bagi = A / B;
                System.out.println("Penjumlahan " + A + " + " + B + " = " + bagi);
                break;
            }
            default:
                System.out.println("Pilihan anda salah");
                break;
        }
    }
}
