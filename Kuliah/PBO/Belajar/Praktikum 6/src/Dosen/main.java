/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dosen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author GESIT
 */
public class main {

    public static void main(String[] args) {
//        rektor rek = new rektor("Andi", "885230202", "Informatika", 2006, 2);
//        dekan dek = new dekan("Ahmad", "995230101", "T. Kimia", "TI");
//        kalab lab = new kalab("Indah", "035230302", "Informatika", "KSC");
//        
//        rek.view();
//        rek.viewRektor();
//        //rek.setTh_mulai(2007);
//        //rek.getTh_mulai();
//        
//        rek.view();
//        rek.viewRektor();
//        
//        dek.view();
//        dek.viewDekan();
//        
//        lab.view();
//        lab.viewKalab();

        List<rektor> rek = new ArrayList<rektor>();
        List<dekan> dek = new ArrayList<dekan>();
        List<kalab> lab = new ArrayList<kalab>();

        boolean ulang = true;
        int pil;

        while (ulang== true) {
            System.out.println("<==== Universitas ====>");
            System.out.println("1.  Rektor");
            System.out.println("2.  Dekan");
            System.out.println("3.  Kalab");
            System.out.println("4.  Tambah data");
            System.out.println("0.  Keluar");
            System.out.print("Pilihan  : ");
            Scanner myObj = new Scanner(System.in);
            pil = myObj.nextInt();

            if (pil == 1) {
               for(int i = 0; i < rek.size(); i++){
                   rek.get(i).view();
                   rek.get(i).viewRektor();
                   System.out.println("");
               }
               
            } else if (pil == 2) {

            } else if (pil == 3) {

            } else if (pil == 4) {
                int pil2;

                System.out.println("<==== Tambah Data ====>");
                System.out.println("1.  Rektor");
                System.out.println("2.  Dekan");
                System.out.println("3.  Kalab");
                System.out.print("Pilihan  : ");
                pil2 = myObj.nextInt();

                if (pil2 == 1) {
                    String inp_nama;
                    String inp_nik;
                    String inp_jurusan;
                    int inp_thMulai;
                    int inp_jurusanKe;

                    System.out.print("Masukan Nama       : ");
                    inp_nama = myObj.next();
                    System.out.print("Masukan NIK        : ");
                    inp_nik = myObj.next();
                    System.out.print("Masukan Jurusan    : ");
                    inp_jurusan = myObj.next();
                    System.out.print("Masukan Th Mulai   : ");
                    inp_thMulai = myObj.nextInt();
                    System.out.print("Masukan Jurusan-Ke : ");
                    inp_jurusanKe = myObj.nextInt();

                    rek.add(new rektor(inp_nama, inp_nik, inp_jurusan, inp_thMulai, inp_jurusanKe));
                } else if (pil2 == 2) {

                } else if (pil2 == 3) {

                }
            } else {
                ulang = false;
            }

        }
    }

}
