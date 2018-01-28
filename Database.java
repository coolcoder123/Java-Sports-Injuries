import java.util.ArrayList;
public class Database {
	private ArrayList<String[]> athletes = new ArrayList<String[]>();
	
	public String[] createArr(String name, String age, String gender, String ailment, int painVal) {
		String painn;
		switch (painVal){
			case 1: painn="ache";
					break;
			case 2: painn="painful";
					break;
			case 3: painn="sharp";
					break;
			default: painn="invalid";
				     break;
		}
		String[] person = {name, age, gender, ailment, painn};
		return person;
		}
	
	public void addArr(String name, String age, String gender, String ailment, int painVal){
		String[] x = this.createArr(name, age, gender, ailment, painVal);
		athletes.add(x);
		
	}
	public ArrayList<String[]> getDataBase(){
		return athletes;
		
	}
	
}
