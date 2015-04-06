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
public class Admin extends Person{
	private String nama;
	private String id;
	private Grup g;

	public Admin(String nama, String id){
		super(nama);
		this.id = id;
	}

	public long getTotalHarga(){
		return 10000;
	}

	public void createGrup(String nama){
		g = new Grup(nama);
		this.id = id+"_"+g.getNamaGrup();
	}
}
