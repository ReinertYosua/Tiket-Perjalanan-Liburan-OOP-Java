package TiketPerjalanan;

import java.util.ArrayList;

public class Destinasi {
	private String namaDestinasi;
    private String deskripsiDestinasi;
    private ArrayList<Tiket> daftarTiket;

    public Destinasi(String namaDestinasi, String deskripsiDestinasi) {
        this.namaDestinasi = namaDestinasi;
        this.deskripsiDestinasi = deskripsiDestinasi;
        this.daftarTiket = new ArrayList<>();
    }

    public String getNamaDestinasi() {
        return namaDestinasi;
    }

    public void setNamaDestinasi(String namaDestinasi) {
        this.namaDestinasi = namaDestinasi;
    }

    public String getDeskripsiDestinasi() {
        return deskripsiDestinasi;
    }

    public void setDeskripsiDestinasi(String deskripsiDestinasi) {
        this.deskripsiDestinasi = deskripsiDestinasi;
    }

    public ArrayList<Tiket> getDaftarTiket() {
        return daftarTiket;
    }

    public void addTicket(Tiket tiket) {
        daftarTiket.add(tiket);
    }

    @Override
    public String toString() {
        return "Nama Destinasi: " + namaDestinasi + ", Deskripsi Destinasi: " + deskripsiDestinasi;
    }
	
}
