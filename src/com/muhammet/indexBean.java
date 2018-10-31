package com.muhammet;

import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="indexBean")
@SessionScoped
public class indexBean {

	private int id;
	private String ad;
	private String tarih;
	private String tutar;
	
	private ArrayList<tblmusteri> liste = new ArrayList<>(Arrays.asList(
			new tblmusteri(1, "Muhammet HOCA", "01.10.2018", "1.265 tl"),
			new tblmusteri(2, "Bahar BBBBB", "01.12.2018", "4.360 tl"),
			new tblmusteri(3, "Fatih FFFFF", "01.06.2018", "9.990 tl"),
			new tblmusteri(4, "Gülseren GGGGG", "01.04.2018", "10.187 tl")		
			));
	
	public String musteriEkle() {		 
	      tblmusteri mst = new tblmusteri(id,ad,tarih,tutar);
	      liste.add(mst);
	      return null;
	   }

	   public String musteriSil(tblmusteri mst) {
	      liste.remove(mst);		
	      return null;
	   }

	   public String musteriDuzenle(tblmusteri mst) {
	      mst.setDuzenle(true);
	      return null;
	   }
	   
	  public String musteriKaydet() {
		  
		  for (tblmusteri mst : liste) {
			  	mst.setDuzenle(false);
		  }
		  return null;
	  }
	
	
	public ArrayList<tblmusteri> getListe() {
		return liste;
	}
	public void setListe(ArrayList<tblmusteri> liste) {
		this.liste = liste;
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
