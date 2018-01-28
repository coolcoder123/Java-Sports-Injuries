
public class Database {
	private int y=0;
	private int z=0;
	private String[][] athletes = new String[10][5];
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
	
		String[]x = this.createArr(name, age, gender, ailment, painVal);
		athletes[y]= x;
		y++;
	}
	public String[][] getDataBase(){
		return athletes;
		
	}
	
}
