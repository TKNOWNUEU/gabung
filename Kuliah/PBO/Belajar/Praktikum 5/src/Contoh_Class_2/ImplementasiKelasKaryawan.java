/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoh_Class_2;


/**
 *
 * @author GESIT
 */
public class ImplementasiKelasKaryawan {
    public static void main(String[] args) {
        //Membuat objek karyawan dengan nama Aurel
        Karyawan Aurel = new Karyawan();
        
        //Mengisi nilai kedalam data-data objek karyawan
        Aurel.ID = "K001";
        Aurel.nama = "Aurel Dian";
        Aurel.divisi = "Marketing";
        Aurel.gaji = (double) 2500000;
        
        //Mencetak data-data ovjeck karyawan
        System.out.println("Data Karyawan");
        System.out.println("ID      : " + Aurel.ID);
        System.out.println("Nama    : " + Aurel.nama);
        System.out.println("DIvisi  : " + Aurel.divisi);
        System.err.println("Gaji    : " + Aurel.gaji);
    }
}
