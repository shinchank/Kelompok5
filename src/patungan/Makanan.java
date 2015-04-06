/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patungan;

/**
 *
 * @author shinchank
 */
public class Makanan {
	private String nama;
	private double harga;
	private double pajak;

	public Makanan(String nama, double harga, double pajak){
		this.nama = nama;
		this.harga = harga;
		this.pajak = pajak;
	}

	public String getNama(){
		return this.nama;
	}

	public double getHarga(){
		return this.harga;
	}

	public double getPajak(){
		return this.pajak;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public void setHarga(double harga){
		this.harga = harga;
	}

	public void setPajak(double pajak){
		this.pajak = pajak;
	}
}
