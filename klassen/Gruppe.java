package klassen;

import java.sql.Date;

public class Gruppe {
	
	public int gruppenId;
	public String name;
	public Date abholtag;
	
	public Gruppe(String name, Date abholtag) {
		this.name = name;
		this.abholtag = abholtag;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getAbholtag() {
		return abholtag;
	}
	
	public void setAbholtag(Date abholtag) {
		this.abholtag = abholtag;
	}
	
	public int getGruppenId() {
		return gruppenId;
	}
	
	

}
