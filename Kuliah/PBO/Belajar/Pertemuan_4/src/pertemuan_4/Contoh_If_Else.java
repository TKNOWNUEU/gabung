/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_4;

/**
 *
 * @author GESIT
 */

import javax.swing.JOptionPane;

public class Contoh_If_Else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Hasil = "";
        String data_nilai = JOptionPane.showInputDialog("Masukan nilai ANda = ");
        float nilai = Float.parseFloat(data_nilai);
        if(nilai > 70.0f){
            Hasil = "Anda Lulus";
        }
        else{
            Hasil = "Anda Tidak Lulus";
        }
        
        System.out.println(Hasil);
    }    
}
