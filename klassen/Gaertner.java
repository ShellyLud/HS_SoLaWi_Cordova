package klassen;

public class Gaertner extends Person{
	
	public String ort;

	public Gaertner(String name, String vorname, String ort) {
		super(name, vorname);
		this.ort = ort;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	

}
