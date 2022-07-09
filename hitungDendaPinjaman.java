package projekAlpro;

public class hitungDendaPinjaman {
	public static void main(String[] args) {
		
	hitungDenda(14);	
		
		
	}private static void hitungDenda(int lamaPinjaman) {
		int telat=0;
		int dendaBuku=0;
		int dendaNovel=0;
		int dendaCerpen=0;
		
		System.out.printf("Meminjam selama : %d hari\n",lamaPinjaman);
		
		if(lamaPinjaman>10) {
			telat=lamaPinjaman-10;
			dendaBuku=telat*1000;
			dendaNovel=telat*2000;
			dendaCerpen=telat*1500;
		}
		int total=dendaBuku+dendaNovel+dendaCerpen;
		
		System.out.printf("Telat Mengembalikan : %d hari\n",telat);
		System.out.println("Denda buku mata pelajaran : "+dendaBuku);
		System.out.println("Denda Novel : "+dendaNovel);
		System.out.println("Denda Cerpen : "+dendaCerpen);
		System.out.println("Total : "+total);
		
	}

}
