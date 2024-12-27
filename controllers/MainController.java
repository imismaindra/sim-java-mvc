package sim.controllers;

import sim.models.*;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        // Inisialisasi Data
        matakul matkulModel = new matakul();
        matkulModel.initData();

        nilai nilaiModel = new nilai();
        nilaiModel.initData();

        siswa siswaModel = new siswa();
        siswaModel.initData();

        // Controller Instances
        matkulController matkulController = new matkulController();
        siswaController siswaController = new siswaController();
        nilaiController nilaiController = new nilaiController();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== SISTEM INFORMASI AKADEMIK ===");
            System.out.println("1. Lihat Daftar Mata Kuliah");
            System.out.println("2. Lihat Daftar Siswa");
            System.out.println("3. Lihat Daftar Nilai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    matkulController.displayMatkul();
                    break;
                case 2:
                    siswaController.displaySiswa();
                    break;
                case 3:
                    nilaiController.displayNilai();
                    break;
                case 4:
                    System.out.println("Terima kasih, keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi!");
            }
        } while (choice != 4);

        scanner.close();
    }
}
