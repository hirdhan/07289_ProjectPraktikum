package Pertemuan1;

import java.util.Scanner;

public class MenghitungNilai07289 {
    public static void main(String[] args) {
        Scanner input07289 = new Scanner(System.in);
        double rata07289, total07289 = 0, nilai07289;
        int i=1, j=1;
        String nama07289;

        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jumlah07289 = input07289.nextInt();
        System.out.println();

        do {
            System.out.print("Nama Mata Kuliah ke -" + j + " : ");
            nama07289 = input07289.next();
            System.out.print("Nilai Mata Kuliah ke -" + j + " : ");
            nilai07289 = input07289.nextDouble();
            System.out.println();
            total07289 += nilai07289;
            i++;
            j++;
        }
        while (i <= jumlah07289);

        rata07289 = total07289 / jumlah07289;
        System.out.println("Nilai Rata-rata : " + rata07289);

        if (rata07289 >= 71) {
            System.out.println("Keterangan : LULUS");
        } else {
            System.out.println("Keterangan : GUGUR");
        }

    }
}
