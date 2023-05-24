/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dosen;

/**
 *
 * @author GESIT
 */
public class dekan extends dosen {
    private String fakultas;
    
    //inisialisasi
    dekan(String namaX, String nikX, String jurX, String fakX){
        super(namaX, nikX, jurX);
        fakultas = fakX;
    }
    
    //menampilkan informasi 
    public void viewDekan(){
        System.out.println("Fakultas    : " + fakultas);
    }
}
