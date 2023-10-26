package TiketPerjalanan;

public class Tiket {
	private String namaTiket;
    private double hargaTiket;

    public Tiket(String namaTiket, double hargaTiket) {
        this.namaTiket = namaTiket;
        this.hargaTiket = hargaTiket;
    }

    public String getNamaTiket() {
        return namaTiket;
    }

    public void setNamaTiket(String namaTiket) {
        this.namaTiket = namaTiket;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    @Override
    public String toString() {
        return "Nama Tiket: " + namaTiket + ", Harga Tiket: " + hargaTiket;
    }
	
}
