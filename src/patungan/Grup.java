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
import java.util.*;
import java.text.*;

public class Grup{
	private String nama;
	private static int idGrup = 0;
	private int nP;
	private ArrayList<TempatMakan> tempat = new ArrayList<TempatMakan>();
	private ArrayList<Person> person = new ArrayList<Person>();
	private String tanggal;
        
        /**
         * 
         * @param nama 
         */
	public Grup(String nama){	
		this.nama = nama +"_G"+Grup.idGrup;
		Grup.idGrup++; 
	}
        
        /**
         * 
         * @return 
         */
	public String getNamaGrup(){
		return this.nama;
	}
        
        /**
         * 
         * @param p 
         */
	public void addPerson(Person p){
		person.add(p);
		nP++;
	}
        
        /**
         * 
         * @return 
         */
	public int getNP(){
		return this.nP;
	}
        
        /**
         * 
         * @param t 
         */
	public void addTempatMakan(TempatMakan t){
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		tanggal = sdf.format(date);
		//System.out.println("Tanggal : "+tanggal);
		tempat.add(t);
	}
        
        /**
         * 
         * @return 
         */
	public ArrayList<TempatMakan> lihatTempatMakan(){
		return new ArrayList<TempatMakan>(tempat);
	}
        
        /**
         * 
         * @param nama
         * @return 
         */
        public String cariTempatMakan(String nama){
            String result = "-1";
            for(int i = 0; i < tempat.size(); i++){
                if(tempat.contains(nama))
                    result = tempat.get(i).getNama();
            }
            return result;
        }
}
