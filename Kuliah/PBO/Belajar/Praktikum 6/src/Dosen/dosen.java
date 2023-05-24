/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dosen;

/**
 *
 * @author GESIT
 */
public class dosen {
    protected String nama;
    protected String nik;
    protected String jurusan;
    
    //membuat konstruktor
    dosen(String namaX, String nikX, String jurX){
        nama = namaX;
        nik = nikX;
        jurusan = jurX;
    }
    
    //menampilkan informasi
    public void view(){
        System.out.println("Nama    : " + nama);
        System.out.println("NIK     : " + nik);
        System.out.println("Jurusan : " + jurusan);
    }
}
