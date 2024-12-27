package sim.controllers;

import sim.models.matakul;
import sim.models.nilai;
import sim.models.siswa;
import sim.entity.MatakulEntity;
import sim.entity.NilaiEntity;
import sim.entity.SiswaEntity;
import sim.views.nilaiPage;

import java.util.ArrayList;

public class nilaiController {
    private nilaiPage view;

    public nilaiController() {
        this.view = new nilaiPage();
    }

    public void displayNilai() {
       ArrayList<NilaiEntity> nilaiList = nilai.getNilaiList();
        ArrayList<SiswaEntity> siswaList = siswa.getSiswaList();
        ArrayList<MatakulEntity> matkulList = matakul.getMatkulList();

        ArrayList<String> formattedNilaiList = new ArrayList<>();
        for (NilaiEntity nilai : nilaiList) {
            String namaSiswa = siswaList.stream()
                .filter(s -> s.getId() == nilai.getIdSiswa())
                .findFirst()
                .map(SiswaEntity::getNama)
                .orElse("Tidak Diketahui");

            String namaMatkul = matkulList.stream()
                .filter(m -> m.getId() == nilai.getIdmatakuliah())
                .findFirst()
                .map(MatakulEntity::getKuliah)
                .orElse("Tidak Diketahui");

            formattedNilaiList.add(
                "ID: " + nilai.getId() +
                ", Nama Siswa: " + namaSiswa +
                ", Mata Kuliah: " + namaMatkul +
                ", Nilai: " + nilai.getNilai()
            );
        }
        view.displayNilaiList(formattedNilaiList);
    }
}
