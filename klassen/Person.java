package klassen;

public abstract class Person {
	
	public int personenId;
	public String name;
	public String vorname;
	
	public Person(String name, String vorname) {
		//Autoincrement
		this.name = name;
		this.vorname = vorname;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public int getPersonenId() {
		return personenId;
	}
	
	

}
