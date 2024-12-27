package sim.views;

import sim.entity.MatakulEntity;
import java.util.ArrayList;

public class matkulPage {
    public void displayMatkulList(ArrayList<MatakulEntity> matkulList) {
        System.out.println("\n=== DAFTAR MATA KULIAH ===");
        for (MatakulEntity matkul : matkulList) {
            System.out.println("ID: " + matkul.getId() + ", Nama: " + matkul.getKuliah());
        }
    }
}
