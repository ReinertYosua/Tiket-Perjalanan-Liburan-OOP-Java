package TiketPerjalanan;

public class TiketPesawat extends Tiket{
	private String maskapai;
	private String kelas;
	
	public TiketPesawat(String namaTiket, double hargaTiket, String maskapai, String kelas) {
		super(namaTiket, hargaTiket);
		this.maskapai = maskapai;
		this.kelas = kelas;
	}

	public String getMaskapai() {
		return maskapai;
	}

	public void setMaskapai(String maskapai) {
		this.maskapai = maskapai;
	}

	public String getKelas() {
		return kelas;
	}

	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
    @Override
    public String toString() {
        return super.toString() + ", Maskapai: " + maskapai + ", Kelas: " + kelas;
    }
	
}
