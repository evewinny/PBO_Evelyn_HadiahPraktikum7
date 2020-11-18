class tipe36 extends inputan {
	private int harga;
	private int kembalian;
	
	public void setHarga() {
		switch(blok) {
			case 'A': harga=500000;
			break;
			case 'B': harga=300000;
			break;
				default:System.out.println("Blok rumah salah");
		}
	}
	
	public int getHarga(){
		return harga;
	}
	
	public void setKembalian(int bayar) {
		kembalian=bayar-harga;
	}
	
	public int getKembalian() {
		return kembalian;
	}
}