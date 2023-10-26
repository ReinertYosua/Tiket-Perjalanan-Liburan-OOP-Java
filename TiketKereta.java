package TiketPerjalanan;

public class TiketKereta extends Tiket{
	private String jenisKereta;
	private String kursi;
	
	public TiketKereta(String namaTiket, double hargaTiket, String jenisKereta, String kursi) {
		super(namaTiket, hargaTiket);
		this.jenisKereta = jenisKereta;
		this.kursi = kursi;
	}

	public String getJenisKereta() {
		return jenisKereta;
	}

	public void setJenisKereta(String jenisKereta) {
		this.jenisKereta = jenisKereta;
	}

	public String getKursi() {
		return kursi;
	}

	public void setKursi(String kursi) {
		this.kursi = kursi;
	}

	@Override
    public String toString() {
        return super.toString() + ", Jenis Kereta: " + jenisKereta + ", Kursi: " + kursi;
    }
	
	
	
	
	
	
}
