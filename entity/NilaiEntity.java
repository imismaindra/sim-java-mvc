package sim.entity;

public class NilaiEntity {
    int id, nilai, idmatakuliah, idSiswa;

    public NilaiEntity(int id, int nilai, int idmatakuliah, int idSiswa) {
        this.id = id;
        this.nilai = nilai;
        this.idmatakuliah = idmatakuliah;
        this.idSiswa = idSiswa;

    }

    public int getId(){
        return id;
    }
    public int getNilai(){
        return nilai;
    }
    public int getIdmatakuliah(){
        return idmatakuliah;
    }
    public int getIdSiswa(){
        return idSiswa;
    }
}
