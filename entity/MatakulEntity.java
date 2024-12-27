package sim.entity;

public class MatakulEntity {
    int id;
    String matakuliah;

    public MatakulEntity(int id, String matakuliah) {
        this.id = id;
        this.matakuliah = matakuliah;
    }

    public int getId() {
        return id;
    }

    public String getKuliah(){
        return matakuliah;
    }

}
