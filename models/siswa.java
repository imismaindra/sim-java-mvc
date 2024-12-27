package sim.models;
import java.util.*;
import sim.entity.*;

public class siswa {
    private static ArrayList<SiswaEntity>siswaList = new ArrayList<>();

    public static void initData(){
        siswaList.add(new SiswaEntity(1,"Budi"));
        siswaList.add(new SiswaEntity(2,"Ani"));
    }

    public static ArrayList<SiswaEntity> getSiswaList(){
        return siswaList;
    }

}