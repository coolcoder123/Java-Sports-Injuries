
public class Profile {
	String[][] arr = new String[0][0];
	private String name, gender, ailment;
	private int age, pain;
	Database data = new Database();
	public Profile(String nm, int Age, String gndr) {
		name = nm;
		age = Age;
		gender = gndr;
		ailment = "None";
		
	}
	private String ageS = Integer.toString(age);
	public void updateCondition(String ailm, int painInd) {
		ailment = ailm;
		pain = painInd;
		
	}
	public int getAge() {
		return age;
	}
	public int getPain() {
		return pain;
	}
	public String givePainData() {
		bodyParts part = new bodyParts(this, ailment);
		return part.runDiagnostic();
	}
	public void giveAthleteData() {
		data.addArr(name, ageS, gender, ailment, pain);
	}
	public String[][] attainDataBase() {
		 String[][] athletes = data.getDataBase();
		return athletes;
	}
	public String toString() {
		if (gender.equalsIgnoreCase("m"))
			return "Name: " + name +"\nAge: " + age + "\nGender: Male" + "\nAilment: " + ailment;
		else if (gender.equalsIgnoreCase("f"))
			return "Name: " + name +"\nAge: " + age + "\nGender: Female" + "\nAilment: " + ailment;
		else
			return "Name: " + name +"\nAge: " + age + "\nGender: Other" + "\nAilment: " + ailment;
	}
}
