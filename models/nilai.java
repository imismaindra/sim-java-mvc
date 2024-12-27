package sim.models;
import java.util.ArrayList;

import sim.entity.NilaiEntity;
public class nilai {
    private static ArrayList<NilaiEntity>nilaiList = new ArrayList<>();

    public void initData() {
        nilaiList.add(new NilaiEntity(1, 90, 1, 1));
        nilaiList.add(new NilaiEntity(2, 80, 2, 1));
        nilaiList.add(new NilaiEntity(3, 70, 1, 2));
        nilaiList.add(new NilaiEntity(4, 60, 2, 2));
    }
    
    public static ArrayList<NilaiEntity> getNilaiList() {
        return nilaiList;
    }

}
