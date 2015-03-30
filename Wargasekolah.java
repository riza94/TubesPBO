public class Wargasekolah{
	private String nama;

	public Wargasekolah(String nama){
		this.nama= nama;
	}
	public String getNama(){
		return nama;
	}
	public String toString(){
		return "Nama : "+getNama();
	}
}