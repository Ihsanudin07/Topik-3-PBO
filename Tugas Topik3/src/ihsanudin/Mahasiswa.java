package ihsanudin;

public class Mahasiswa {

    //atribut dari mahasiswa
    private String nim;
    private String nama;

    //membuat konstruktor dengan menggunakan 2 paramater
    public Mahasiswa (String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    //membuat method get untuk memanggil nim dan nama
    public String getNim(){
        return nim;
    }

    public String getNama(){
        return  nama;
    }
}
