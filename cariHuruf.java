package projekAlpro;

import java.util.*;

public class cariHuruf {
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	String kata = in.nextLine();
	String cari = in.nextLine();
	System.out.println(cari+" muncul sebanyak "+cekHuruf(kata,cari)+" kali");
	}
	
	private static int cekHuruf(String kata, String cari) {
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
	return jumlah;	
	}

}
