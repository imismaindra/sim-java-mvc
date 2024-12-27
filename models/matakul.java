package sim.models;
import java.util.ArrayList;
import sim.entity.*;

public class matakul {
    public static ArrayList<MatakulEntity> matakulList = new ArrayList<>();

    public void initData() {
        matakulList.add(new MatakulEntity(1, "Matematika"));
        matakulList.add(new MatakulEntity(2, "Bahasa Indonesia"));
    }

    public static ArrayList<MatakulEntity> getMatkulList(){
        return matakulList;
    }




}
