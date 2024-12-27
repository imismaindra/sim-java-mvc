package sim.views;

import sim.entity.SiswaEntity;
import java.util.ArrayList;

public class siswaPage {
    public void displaySiswaList(ArrayList<SiswaEntity> siswaList) {
        System.out.println("\n=== DAFTAR SISWA ===");
        for (SiswaEntity siswa : siswaList) {
            System.out.println("ID: " + siswa.getId() + ", Nama: " + siswa.getNama());
        }
    }
}
