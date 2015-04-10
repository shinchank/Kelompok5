/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patungan;

/**
 *
 * @author SYAIR
 */
public class TempatMakan {
    private String namaTempat;
	private String alamat;
	private String noTelp;
	//private int nMenu = 0;
	private MenuMakan menu;

	public TempatMakan(String nama, String alamat, String noTelp){
		this.namaTempat = nama;
		this.alamat = alamat;
		this.noTelp = noTelp;
	}

	public String getNama(){
		return this.namaTempat;
	}

	public String getAlamat(){
		return this.alamat;
	}

	public String getNoTelp(){
		return this.noTelp;
	}

	public void addMenuMakan(){
		menu = new MenuMakan();
		//nMenu++;
	}

	public MenuMakan lihatMenuMakan(){
		return menu;
	}
    
}
