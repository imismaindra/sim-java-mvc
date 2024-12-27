package sim.entity;

public class SiswaEntity {
    private String nama;
    private int id, nilai,matakuliah;

    public SiswaEntity(int id, String nama) {
     this.id = id;
     this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public int getId() {
        return id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setId(int id) {
        this.id = id;
    }
}
