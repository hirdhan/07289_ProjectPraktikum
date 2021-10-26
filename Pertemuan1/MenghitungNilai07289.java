package MenghitungNilai07289;

import java.util.Scanner;

public class MenghitungNilai07289 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rata, total = 0, nilai;
        String nama;

        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jumlah = input.nextInt();
        System.out.println();

        for(int i=1; i<=jumlah; i++ ){
            System.out.print("Nama Mata Kuliah ke  - "+ i+ ": ");
            nama = input.next();
            System.out.print("Nilai Mata Kuliah ke- "+i+ ": ");
            nilai = input.nextDouble();
            total +=  nilai;
        }

//        do {
//            System.out.print("Nama Mata Kuliah ke -" + j + " : ");
//            nama = input.next();
//            System.out.print("Nilai Mata Kuliah ke -" + j + " : ");
//            nilai = input.nextDouble();
//            System.out.println();
//            total += nilai;
//            i++;
//            j++;
//        }
//        while (i <= jumlah);

        rata = total / jumlah;
        System.out.println("Nilai Rata-rata : " + rata);

        if (rata >= 71) {
            System.out.println("Keterangan : LULUS");
        } else {
            System.out.println("Keterangan : GUGUR");
        }

    }
}
