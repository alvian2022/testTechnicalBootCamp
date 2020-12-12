package projekAlpro;

import java.util.Arrays;

public class cariHuruf {
	public static void main(String[] args) {
		
	cekHuruf("aku calon peserta bootcamp dumbways","o");		
		
	}private static int cekHuruf(String kata, String cari) {
		int jumlah=0;
		char[] huruf=new char[kata.length()];
		int angka = kata.indexOf(cari);
		int i;
		for(i=0; i<huruf.length; i++) {
			huruf[i]=kata.charAt(i);
			if(huruf[i]==kata.charAt(angka)) {
				jumlah++;
			}
			
		}
		System.out.println(cari+" muncul sebanyak "+jumlah+" kali");
		
	return jumlah;	
	}

}
