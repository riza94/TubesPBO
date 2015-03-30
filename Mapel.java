public class Mapel implements Nilai{
	private String namaMapel;
	private int uas,uts,kuis,tugas;

	public void setNilai(int tugas,int uas,int uts,int kuis){
		this.uas= uas;
		this.uts= uts;
		this.kuis= kuis;
		this.tugas= tugas;
	}

	public int getNilai(){
		return (tugas+uas+uts+kuis)/4;
	}

	public void setNilai(String namaMapel){
		this.namaMapel= namaMapel;
	}

	public String getNMapel{
		return namaMapel;
	}

	public String toString{
		return "Mapel : "+getNMapel()+" Nilai : "+getNilai();
	}

}