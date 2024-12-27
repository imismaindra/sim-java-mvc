package sim.controllers;

import sim.models.siswa;
import sim.entity.SiswaEntity;
import sim.views.siswaPage;

import java.util.ArrayList;

public class siswaController {
    private siswaPage view;

    public siswaController() {
        this.view = new siswaPage();
    }

    public void displaySiswa() {
        ArrayList<SiswaEntity> siswaList = siswa.getSiswaList();
        view.displaySiswaList(siswaList);
    }
}
