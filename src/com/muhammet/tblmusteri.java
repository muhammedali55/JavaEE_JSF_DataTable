package com.muhammet;


public class tblmusteri {

	private int id;
	private String ad;
	private String tarih;
	private String tutar;
	private boolean Duzenle = false;
	
	public tblmusteri(int id, String ad, String tarih, String tutar) {
		this.id = id;
		this.ad = ad;
		this.tarih = tarih;
		this.tutar = tutar;	
	}
	
	
	public boolean isDuzenle() {
		return Duzenle;
	}


	public void setDuzenle(boolean Duzenle) {
		this.Duzenle = Duzenle;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getTarih() {
		return tarih;
	}
	public void setTarih(String tarih) {
		this.tarih = tarih;
	}
	public String getTutar() {
		return tutar;
	}
	public void setTutar(String tutar) {
		this.tutar = tutar;
	}
	
	
	
}
