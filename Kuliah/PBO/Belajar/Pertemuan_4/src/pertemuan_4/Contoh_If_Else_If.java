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
public class Contoh_If_Else_If {
    public static void main(String[] args) {
        String Kategori;
        String data_umur = JOptionPane.showInputDialog("Masukan umur anda (dalam tahun) = ");
        float umur = Float.parseFloat(data_umur);
        if(umur < 5.0f){
            Kategori = "Balita";
        }
        else if(umur < 12.0f){
            Kategori = "Anak-Anak";
        }
        else if(umur < 18.0f){
            Kategori = "Remaja";
        }
        else if(umur < 40.0f){
            Kategori = "Dewasa";
        }
        else if(umur < 60.0f){
            Kategori = "Paruh Baya";
        }
        else{
            Kategori = "Lanjut Usia";
        }
        System.out.println("Umur " + umur + " tahun termasuk dalam kategori "+ Kategori);
    }
}
