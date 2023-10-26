package TiketPerjalanan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Buat objek destinasi
		Scanner scan=new Scanner(System.in);
        Destinasi destinasi1 = new Destinasi("Bali", "Pulau Dewata");
        Destinasi destinasi2 = new Destinasi("Yogyakarta", "Kota Pelajar");
        
        ArrayList<Destinasi>daftarDestinasi = new ArrayList<>();
        daftarDestinasi.add(destinasi1);
        daftarDestinasi.add(destinasi2);

        // Buat objek tiket
        TiketPesawat tiketPesawat1 = new TiketPesawat("Tiket Pesawat Jakarta-Bali", 1000000, "Garuda Indonesia", "Ekonomi");
        TiketKereta tiketKereta1 = new TiketKereta("Tiket Kereta Jakarta-Yogyakarta", 500000, "Kereta Api Argo Bromo Anggrek", "Kelas Eksekutif");
        TiketBus tiketBus1 = new TiketBus("Tiket Bus Jakarta-Yogyakarta", 200000, "Bus Patas");

        ArrayList<Tiket> daftarTiket = new ArrayList<>();
        daftarTiket.add(tiketBus1);
        daftarTiket.add(tiketKereta1);
        daftarTiket.add(tiketPesawat1);
        // Tambahkan tiket ke destinasi
//        destinasi1.addTicket(tiketPesawat1);
//        destinasi2.addTicket(tiketKereta1);
//        destinasi2.addTicket(tiketBus1);

        // Tampilkan daftar destinasi
        System.out.println("Daftar Destinasi:");
        int no=1;
        int pil;
        for(Destinasi ds : daftarDestinasi) {
        	System.out.println(no+"."+ds.getNamaDestinasi()+"-"+ds.getDeskripsiDestinasi());
            //System.out.println(no+"."+ds.getNamaDestinasi()+"-"+ds.getDeskripsiDestinasi());
            no++;
        }
        // Pesan tiket
        System.out.println("Pilih destinasi untuk tiket yang ingin dipesan:");
        pil = scan.nextInt();
        Destinasi tujuanDestinasi = daftarDestinasi.get(pil-1);
        int not=1;
        for (Tiket tiket : daftarTiket) {
        	System.out.println(not+"."+tiket.getNamaTiket()+"-"+tiket.getHargaTiket());
            //System.out.println(no+"."+ds.getNamaDestinasi()+"-"+ds.getDeskripsiDestinasi());
            not++;
		}
        int pilihanTiket = scan.nextInt();
        Tiket tiketPil = daftarTiket.get(pilihanTiket-1);
        tujuanDestinasi.addTicket(tiketPil);
        

        // Tampilkan tiket yang dipesan
        System.out.println("Tiket yang dipesan:");
        for (Tiket tiket : tujuanDestinasi.getDaftarTiket()) {
			System.out.println(tiket.toString());
		}
        
        
	}

}
