package classlar;

public class motorsiklet extends Arac{
	private double trafikCezaTutari;
	public motorsiklet(long id, String aracIsmi, String renk, double fiyat, int lastikSayisi, String marka,
			String model,double trafikCezaTutari) {
		super(id, aracIsmi, renk, fiyat, lastikSayisi, marka, model);
		 this.trafikCezaTutari=trafikCezaTutari;
	}

	@Override
	public void aracBilgileriGoster() {
		// TODO Auto-generated method stub
		super.aracBilgileriGoster();
		System.out.println("ID           :"+getId());
		System.out.println("Araç ismi    :"+getAracIsmi());
		System.out.println("Araç rengi   :"+getRenk());
		System.out.println("Fiyat        :"+getFiyat());
		System.out.println("Lastik sayısı:"+getLastikSayisi());
		System.out.println("Marka        :"+getMarka());
		System.out.println("Model        :"+getModel());
	}

	@Override
	public void trafikCezasiOde(double cezaTutar) {
		// TODO Auto-generated method stub
		super.trafikCezasiOde(cezaTutar);
		System.out.println(getAracIsmi()+ " tipli aracın trafik cezası tutarı:"+getTrafikCezaTutari());
	}

	public double getTrafikCezaTutari() {
		return trafikCezaTutari;
	}

	public void setTrafikCezaTutari(double trafikCezaTutari) {
		this.trafikCezaTutari = trafikCezaTutari;
	}
	

}
