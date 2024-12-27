package sim.controllers;

import sim.models.matakul;
import sim.entity.MatakulEntity;
import sim.views.matkulPage;

import java.util.ArrayList;

public class matkulController {
    private matkulPage view;

    public matkulController() {
        this.view = new matkulPage();
    }

    public void displayMatkul() {
        ArrayList<MatakulEntity> matkulList = matakul.getMatkulList();
        view.displayMatkulList(matkulList);
    }
}
