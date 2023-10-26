package TiketPerjalanan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Destinasi>daftarDestinasi = new ArrayList<>();
		//ArrayList<Tiket> daftarTiket = new ArrayList<>();
		
		
		Scanner input = new Scanner(System.in);
		
		int pilihan;
		do {
			System.out.println("Menu: ");
			System.out.println("1. Tambah Destinasi");
			System.out.println("2. Lihat Daftar Destinasi");
			System.out.println("3. Pesan Tiket");
			System.out.println("4. Lihat Tiket yang dipesan");
			System.out.println("5. Keluar");
			System.out.println("Pilih opsi:");
			pilihan = input.nextInt();
			
			switch (pilihan) {
			case 1:
				String namaDest=null;
				String desDest=null;
				input.nextLine();
				do {
					
					System.out.println("Masukkan Nama Destinasi :");
					namaDest = input.nextLine();
					
					System.out.println("Masukkan Deskripsi Destinasi :");
					desDest = input.nextLine();

				}while(namaDest.length() <= 0);
				
					
				daftarDestinasi.add(new Destinasi(namaDest, desDest));
					
				System.out.println("Destinasi dan Tiket berhasil dipesan");
				
				
				break;
			case 2:
				System.out.println("Daftar Destinasi:");
				//System.out.println(daftarDestinasi.size());
				for(Destinasi ds : daftarDestinasi) {
					
					System.out.println(ds.toString());
				}
				
				break;
			case 3:
				int pilDestinasi=0;
				int no=1;
				for(Destinasi ds : daftarDestinasi) {
					
					System.out.println(no+"."+ds.toString());
					no++;
				}
				System.out.println("Pilih Destinasi untuk pesan Tiket: ");
				pilDestinasi = input.nextInt();
				Destinasi destinasi = daftarDestinasi.get(pilDestinasi-1);
				int pilTiket=0;
				
				System.out.println("1. Tiket pesawat");
                System.out.println("2. Tiket kereta");
                System.out.println("3. Tiket bus");
                System.out.println("Pilih jenis Tiket: ");
				//System.out.println(daftarDestinasi.get(pilDestinasi-1));
                pilTiket = input.nextInt();
                String namaTiket;
                double hargaTiket;
                switch (pilTiket) {
				case 1:
					String maskapai;
					String kelas;
					input.nextLine();
					System.out.println("Masukkan Nama Tiket: ");
					namaTiket = input.nextLine();
					System.out.println("Masukkan Nama Maskapai: ");
					maskapai = input.nextLine();
					System.out.println("Masukkan Kelas(Eksekutif, Bisnis, Ekonomi): ");
					kelas = input.nextLine();
					System.out.println("Masukkan Harga: ");
					hargaTiket = input.nextDouble();
					destinasi.addTicket(new TiketPesawat(namaTiket, hargaTiket, maskapai, kelas));
					
					break;
				case 2:
					String jenisKereta,kursi;
					input.nextLine();
					System.out.println("Masukkan Nama Tiket: ");
					namaTiket = input.nextLine();
					System.out.println("Masukkan Nama Jenis Kereta: ");
					jenisKereta = input.nextLine();
					System.out.println("Masukkan Kursi(Exp: 12A): ");
					kursi = input.nextLine();
					System.out.println("Masukkan Harga: ");
					hargaTiket = input.nextDouble();
					destinasi.addTicket(new TiketKereta(namaTiket, hargaTiket, jenisKereta, kursi));
					
					break;
				case 3:
					String tipeBus;
					input.nextLine();
					System.out.println("Masukkan Nama Tiket: ");
					namaTiket = input.nextLine();
					System.out.println("Masukkan Nama Tipe Bus(Normal Deck, High Decker dll): ");
					tipeBus = input.nextLine();
					System.out.println("Masukkan Harga: ");
					hargaTiket = input.nextDouble();
					destinasi.addTicket(new TiketBus(namaTiket, hargaTiket, tipeBus));
					
					break;

				default:
					break;
				}
				
				break;
			case 4:
				int pilDestinasiTiket=0;
				int not=1;
				for(Destinasi ds : daftarDestinasi) {
					
					System.out.println(not+"."+ds.toString());
					not++;
				}
				System.out.println("Pilih Destinasi untuk lihat Tiket: ");
				pilDestinasiTiket = input.nextInt();
				Destinasi destinasiTiket = daftarDestinasi.get(pilDestinasiTiket-1);
				for (Tiket tiket : destinasiTiket.getDaftarTiket()) {
					System.out.println(tiket);
				}
				
				break;
			case 5:
					System.out.println("Terima kasih!");
				break;

			default:
				System.out.println("Not Valid");
				break;
			}
		}while(pilihan !=5);
	}

}
