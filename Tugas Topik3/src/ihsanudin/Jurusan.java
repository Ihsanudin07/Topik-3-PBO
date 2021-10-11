package ihsanudin;

import java.util.ArrayList;

public class Jurusan {

    //atribut dari jurusan
    private String kode,nama;
    private ArrayList<Mahasiswa> mhs = new ArrayList<>();

    //membuat konstruktor
    public Jurusan(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
    }

    void  addMhs(Mahasiswa m){
        this.mhs.add(m);
    }

    //method get
    public String getKode(){
        return kode;
    }

    public String getNama(){
        return nama;
    }

    public ArrayList<Mahasiswa> getMhs(){
        return mhs;
    }

}
