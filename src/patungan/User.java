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
public class User extends Person{
	private String nama;
	private String id;

	public User(String nama, String id){
		super(nama);
		this.id = id;
	}
}
