package klassen;


public class Mitglied extends Person{

	public int gruppenId;
	
	public Mitglied(String name, String vorname, int gruppenId) {
		super(name, vorname);
		this.gruppenId = gruppenId;
	}

	public int getGruppenId() {
		return gruppenId;
	}

	public void setGruppenId(int gruppenId) {
		this.gruppenId = gruppenId;
	}
	
	

}
