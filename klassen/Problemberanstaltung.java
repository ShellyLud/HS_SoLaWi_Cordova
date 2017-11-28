package klassen;

public class Problemberanstaltung {
	
	public int eventId;
	public String text;
	public int minAnzahlHelfer;
	public int zaehlwerk;
	public boolean koordination;
	public String termin1;
	public String termin2;
	public String termin3;
	
	public Problemberanstaltung(String text, int minAnzahlHelfer, int zaehlwerk, boolean koordination, String termin1,
			String termin2, String termin3) {
		super();
		this.text = text;
		this.minAnzahlHelfer = minAnzahlHelfer;
		this.zaehlwerk = zaehlwerk;
		this.koordination = koordination;
		this.termin1 = termin1;
		this.termin2 = termin2;
		this.termin3 = termin3;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getMinAnzahlHelfer() {
		return minAnzahlHelfer;
	}

	public void setMinAnzahlHelfer(int minAnzahlHelfer) {
		this.minAnzahlHelfer = minAnzahlHelfer;
	}

	public int getZaehlwerk() {
		return zaehlwerk;
	}

	public void setZaehlwerk(int zaehlwerk) {
		this.zaehlwerk = zaehlwerk;
	}

	public boolean isKoordination() {
		return koordination;
	}

	public void setKoordination(boolean koordination) {
		this.koordination = koordination;
	}

	public String getTermin1() {
		return termin1;
	}

	public void setTermin1(String termin1) {
		this.termin1 = termin1;
	}

	public String getTermin2() {
		return termin2;
	}

	public void setTermin2(String termin2) {
		this.termin2 = termin2;
	}

	public String getTermin3() {
		return termin3;
	}

	public void setTermin3(String termin3) {
		this.termin3 = termin3;
	}

	public int getEventId() {
		return eventId;
	}

}
