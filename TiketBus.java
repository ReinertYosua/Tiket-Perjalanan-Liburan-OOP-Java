package TiketPerjalanan;

public class TiketBus extends Tiket {
	private String tipeBus;

	public TiketBus(String namaTiket, double hargaTiket, String tipeBus) {
		super(namaTiket, hargaTiket);
		this.tipeBus = tipeBus;
	}

	public String getTipeBus() {
		return tipeBus;
	}

	public void setTipeBus(String tipeBus) {
		this.tipeBus = tipeBus;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", Tipe Bus: " + tipeBus;
    }
}
