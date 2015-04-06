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
public class MenuMakan {
	private Makanan[] m;
	private int nMakanan = 0;

	public void addMakanan(String nama, double harga, double pajak){
		m[nMakanan] = new Makanan(nama,harga,pajak);
		nMakanan++;
	}
        
        public String getNama(String nama){
            String result =  "";
            return result;
        }

	public int getJumlahMakanan(){
		return this.nMakanan;
	}

	public Makanan[] lihatListMakanan(){
		return m;
	}    
        
        public String cariMakanan(String nama){
            String result = "-1";
            for(int i = 0; i < nMakanan; i++){
                if(m[i].getNama().equals(nama))
                    result = m[i].getNama();
            }
            return result;
        }
}
