package tugas6;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        int pilihan;
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String masukan1 = "";
        String masukan2 = "";
        String masukan3 = "";
        String nilai1 = "";
        String nilai2 = "";
        String nilai3 = "";
        int rata = 0;
        String x = "";
        String y = "";


        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan pilihan :");
        pilihan = scanner.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Nilai Ujian 1: ");
                try {
                    masukan1 = dataIn.readLine();
                } catch (IOException e) {
                    System.out.println("Erorr!");
                }
                System.out.print("Nilai Ujian 2: ");
                try {
                    masukan2 = dataIn.readLine();
                } catch (IOException e) {
                    System.out.println("Erorr!");
                }
                System.out.print("Nilai Ujian 3: ");
                try {
                    masukan3 = dataIn.readLine();
                } catch (IOException e) {
                    System.out.println("Erorr!");
                }

                try {
                    rata = (Integer.parseInt(masukan1) + Integer.parseInt(masukan2) + Integer.parseInt(masukan3)) / 3;
                    System.out.println("Nilai Rata-rata Ujian = " + rata);
                    if (rata >= 60) {
                        System.out.println(":-)");
                    } else {
                        System.out.println(":-(");
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("MAAF NILAI UJIAN TIDAK DAPAT DIPROSES.. DATA YANG DIINPUT TIDAK VALID!!");
                }
                break;

            case 2:
                nilai1 = JOptionPane.showInputDialog("Nilai 1:");
                nilai2 = JOptionPane.showInputDialog("Nilai 2:");
                nilai3 = JOptionPane.showInputDialog("Nilai 3:");
                try {
                    rata = (Integer.parseInt(nilai1) + Integer.parseInt(nilai2) + Integer.parseInt(nilai3)) / 3;
                    String msg = "Rata-Rata = " + rata;
                    if (rata >= 60) {
                        JOptionPane.showMessageDialog(null, msg + " :-)");
                    } else {
                        JOptionPane.showMessageDialog(null, msg + " :-( ");
                    }
                } catch (NumberFormatException nfe) {
                    String msg = "DATA YANG DIINPUT TIDAK VALID!!";
                    JOptionPane.showMessageDialog(null, msg);
                }
                break;

            case 3:
                int a = 1;
                Scanner input = new Scanner(System.in);

                System.out.print("masukan angka: ");
                a = input.nextInt();

                if (a >= 1 & a < 10) {
                    System.out.println(a);
                } else {
                    System.out.println("invalid number");
                }
                break;

            case 4:
                int nilai;
                Scanner Input = new Scanner(System.in);
                System.out.print("Input Nilai : ");

                nilai = Input.nextInt();

                switch (nilai) {
                    case 1:
                        System.out.println(nilai);
                        break;
                    case 2:
                        System.out.println(nilai);
                        break;
                    case 3:
                        System.out.println(nilai);
                        break;
                    case 4:
                        System.out.println(nilai);
                        break;
                    case 5:
                        System.out.println(nilai);
                        break;
                    case 6:
                        System.out.println(nilai);
                        break;
                    case 7:
                        System.out.println(nilai);
                        break;
                    case 8:
                        System.out.println(nilai);
                        break;
                    case 9:
                        System.out.println(nilai);
                        break;
                    case 10:
                        System.out.println(nilai);
                        break;
                    default:
                        System.out.println("invalid number");
                }
                break;
            case 5:
                int r = 0;
                while (r < 100) {
                    System.out.println("OSAMA FAJAR ANGGARA");
                    r++;
                }
                break;
            case 6:
                int R = 0;
                do {
                    System.out.println("OSAMA FAJAR ANGGARA");
                    R++;
                } while (R < 100);
                break;
            case 7:
                int i;
                for (i = 0; i < 100; i++) {
                    System.out.println("OSAMA FAJAR ANGGARA");
                }
                break;
            case 8:
                int hasil = 1;


                x = JOptionPane.showInputDialog("Masukkan angka");

                int angka = Integer.valueOf(x).intValue();

                y = JOptionPane.showInputDialog("Masukkan pangkat");

                int pangkat = Integer.valueOf(y).intValue();

                int l = 1;

                while (l <= pangkat) {

                    l++;

                    hasil = hasil * angka;

                }

                String st3 = angka + " pangkat " + pangkat + " = " + hasil;

                JOptionPane.showMessageDialog(null, st3);

                break;
            case 9:
                int Hasil = 1;

                String c = " ";

                String v = " ";

                c = JOptionPane.showInputDialog("Masukkan angka");

                int Angka = Integer.parseInt(c);

                v = JOptionPane.showInputDialog("Masukkan pangkat");

                int Pangkat = Integer.parseInt(v);

                int I = 1;

                do {
                    I++;

                    Hasil = Hasil * Angka;

                } while (I <= Pangkat);

                String St3 = Angka + " pangkat " + Pangkat + " = " + Hasil;

                JOptionPane.showMessageDialog(null, St3);
                break;
            case 10:
                int h = 1;
                String f = "";
                String g = "";

                x = JOptionPane.showInputDialog("masukan angka");
                int aangka = Integer.valueOf(x).intValue();
                y = JOptionPane.showInputDialog("masukan angka");
                int paangkat = Integer.valueOf(y).intValue();
                for (int z = 1; z <= paangkat; z++) {
                    h = h * aangka;
                }
                String stl3 = aangka + " pangkat " + paangkat + " = " + h;
                JOptionPane.showMessageDialog(null, stl3);
                break;
                }

            }
        }




