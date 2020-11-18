import java.util.Scanner;
public class mainrumah {
	public static void main(String[] args){
		String nama, alamat;
		int bayar;	
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama: ");
		nama=input.nextLine();
		System.out.print("Masukkan alamat: ");
		alamat=input.nextLine();
		
		tipe37 B = new tipe37();
		
		System.out.print("Masukkan tipe rumah anda: ");
		System.out.print("Tipe 36 (36) ");
		System.out.print("Tipe 37 (37) ");
		byte tipe = input.nextByte();
		
		switch(tipe) {
		case 36:
			tipe36 A = new tipe36();
			A.setTipe(tipe);
			System.out.println("Masukkan blok rumah: (A/B)" );
			char blok = input.next().charAt(0);
			A.setBlok(blok);
			A.setHarga();
			System.out.println("Harga Bayar: "+A.getHarga());
			
			System.out.print("Masukkan pembayaran: ");
			bayar = input.nextInt();
			A.setKembalian(bayar);
			System.out.println("Kembalian: "+A.getKembalian());
			break;
		case 37:
			System.out.println("Masukkan blok rumah: (A/B)");
			blok = input.next().charAt(0);
			B.setBlok(blok);
			B.setHarga();
			System.out.println("Harga Bayar: "+B.getHarga());
			
			System.out.print("Masukkan pembayaran: ");
			bayar = input.nextInt();
			B.setKembalian(bayar);
			System.out.println("Kembalian: "+B.getKembalian());
		 	break;
		 default: System.out.println("Blok rumah salah!");
		 }
	}	
}