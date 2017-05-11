
package com.toy.anagrams.lib;

public class e_KTP {
     private String rt;
     private String kel;
     private String nama;
     private int ktp;
        
	public e_KTP(String rt, String kel, String nama, int ktp){
		setRt(rt);
		setKel(kel);
                setNama(nama);
		setKtp(ktp);
	}
	public void setRt(String rt){
		this.rt = rt;
	}
	public String getRt(){
		return rt;
	}
	public void setKel(String kel) {
		this.kel = kel;
	}
	public String getKel() {
		return kel;
        }
        public void setNama(String nama){
		this.nama = nama;
	}
	public String getNama(){
		return nama;
	}
	public void setKtp(int ktp) {
		this.ktp = ktp;
	}
	public int getKtp() {
		return ktp;
        }
        public int compareTo(e_KTP b) {
		if(nama.compareTo(b.getNama()) < 0 ) return -1; 
	      if (nama.compareTo(b.getNama()) == 0) return 0;      
	    return 1; 
	}
    
}
