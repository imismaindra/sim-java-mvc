package sim.views;

import sim.entity.NilaiEntity;
import java.util.ArrayList;

public class nilaiPage {
    public void displayNilaiList(ArrayList<String> nilaiList) {
        System.out.println("\n=== DAFTAR NILAI ===");
        for (String nilai : nilaiList) {
            System.out.println(nilai);
        }
    }
}
