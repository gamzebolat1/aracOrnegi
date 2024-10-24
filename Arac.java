package classlar;

public class Arac {

	private long id;
	private String aracIsmi;
	private String renk;
	private double fiyat;
	private int lastikSayisi;
	private String marka;
	private String model;
	public Arac(long id, String aracIsmi, String renk, double fiyat, int lastikSayisi, String marka, String model) {
		super();
		this.id = id;
		this.aracIsmi = aracIsmi;
		this.renk = renk;
		this.fiyat = fiyat;
		this.lastikSayisi = lastikSayisi;
		this.marka = marka;
		this.model = model;
	}
	
	public void aracBilgileriGoster() {
		System.out.println("Araç Bilgileri");
		System.out.println("---------------");
	}
	
	public void trafikCezasiOde(double cezaTutar) {
		System.out.println("Trafik Cezası");
		System.out.println("--------------");
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAracIsmi() {
		return aracIsmi;
	}
	public void setAracIsmi(String aracIsmi) {
		this.aracIsmi = aracIsmi;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public int getLastikSayisi() {
		return lastikSayisi;
	}
	public void setLastikSayisi(int lastikSayisi) {
		this.lastikSayisi = lastikSayisi;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
