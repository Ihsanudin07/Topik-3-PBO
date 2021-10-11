package ihsanudin;

public class Main {

    public static void main(String[] args) {

        //membuat objek Jurusan yaitu d3rpla dan d3si
        Jurusan d3rpla = new Jurusan("D3RPLA", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan d3si = new Jurusan("D3SI","Diploma 3 Sistem Informasi");

        //membuat objek mahasiswa d3rpla
        Mahasiswa rendi = new Mahasiswa("6701","Rendi");
        Mahasiswa chaca = new Mahasiswa("6702","Chaca");
        Mahasiswa agus = new Mahasiswa("6703","Agus");

        //menambah mahasiswa ke dalam jurusan
        d3rpla.addMhs(rendi);
        d3rpla.addMhs(chaca);
        d3rpla.addMhs(agus);

        //membuat objek mahasiswa d3si
        Mahasiswa ridwan = new Mahasiswa("6301", "Ridwan");
        Mahasiswa siska = new Mahasiswa("6302","Siska");
        Mahasiswa zayn = new Mahasiswa("6303","Zayn");
        Mahasiswa rahmat = new Mahasiswa("6304","Rahmat");

        //menambah mahasiswa kedalam jurusan
        d3si.addMhs(ridwan);
        d3si.addMhs(siska);
        d3si.addMhs(zayn);
        d3si.addMhs(rahmat);

        //membuat output dari isi arraylist objek jurusan d3rpla
        System.out.println("Kode : "+ d3rpla.getKode());
        System.out.println("Nama : "+ d3rpla.getNama());
        System.out.println("Daftar Mahasiswa :");
        int nomer = 1; //menambah variabel untuk nomernya
        //menggunakan for each
        for (Mahasiswa mhs : d3rpla.getMhs()){
            System.out.println(nomer++ + ". " + mhs.getNim() + " - " +mhs.getNama());
        }
        System.out.println("--------------------------------");
        //membuat output dari isi arraylist objek jurusan d3si
        System.out.println("Kode : "+ d3si.getKode());
        System.out.println("Nama : "+ d3si.getNama());
        System.out.println("Daftar Mahasiswa :");
        int nomer2 = 1; //menambah variabel untuk nomernya
        //menggunakan for each
        for (Mahasiswa mhs : d3si.getMhs()){
            System.out.println(nomer2++ + ". " + mhs.getNim() + " - " +mhs.getNama());
        }
    }
}
