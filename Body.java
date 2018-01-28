import java.util.Scanner;



public class Body {
	public static void main(String[] args) {
		String name="", gender="", ailment = "",painS = "0",ageS = "0";
		int age = 0, pain = 0;
		
		Scanner scan = new Scanner(System.in);
		stringCheck check = new stringCheck();
		System.out.println("|||Welcome to the Sports Injury Diagnoser||| \nPlease enter your name:");
		name = scan.nextLine();
		System.out.println("Hello there " + name +", please enter your age:");
		
		ageS = scan.next();
		while (check.checkString(ageS)==0) {
			System.out.println("\'"+ageS+"\' is a string, please use an integer for your age");
			ageS = scan.next();
		}
		age = Integer.parseInt(ageS);
		while (gender.equalsIgnoreCase("m")==false && gender.equalsIgnoreCase("f")==false && gender.equalsIgnoreCase("o")==false) {
			System.out.println("Please enter your gender: (m/f/o)");
			gender = scan.next();
			if (gender.equalsIgnoreCase("m")==false && gender.equalsIgnoreCase("f")==false && gender.equalsIgnoreCase("o")==false)
				System.out.println("The letter \'"+gender+"\' is not accounted for, use 'm', 'f', or 'o'");
		}
		
		System.out.println("Creating your profile...");
		Profile person = new Profile(name, age, gender);
		System.out.println(person.toString());
		System.out.println();
		
		while(ailment.equalsIgnoreCase("arm")==false && ailment.equalsIgnoreCase("shoulder")==false && ailment.equalsIgnoreCase("head")==false && ailment.equalsIgnoreCase("leg")==false && ailment.equalsIgnoreCase("torso")==false) {
			System.out.println("Where are you feeling pain or discomfort?(arm, shoulder, head, leg, torso)");
			ailment = scan.next();
			if (ailment.equalsIgnoreCase("arm")==false && ailment.equalsIgnoreCase("shoulder")==false && ailment.equalsIgnoreCase("head")==false && ailment.equalsIgnoreCase("leg")==false && ailment.equalsIgnoreCase("torso")==false) {
				System.out.println("\'"+ailment+"\' is not accounted for, instead choose from: arm, shoulder, head, leg, torso");
			}
		}
		System.out.println("On a scale from 1-3, how is your pain?(ache,painful,sharp)");
		painS=scan.next();
		boolean checkTripped=false;
		while (check.checkString(painS)==0) {
			if(check.checkString(painS)==0) {
				System.out.println("The input \'"+painS+"\' is a string, when it should be an integer");
				System.out.println("On a scale from 1-3, how is your pain?(ache,painful,sharp)");
				painS=scan.next();
				checkTripped=true;
			}
			if (checkTripped){
				continue;
			}
			if (Integer.parseInt(painS) <1 || Integer.parseInt(painS) >3) {
					System.out.println("The input \'"+painS+"\' is not within the scale.");
					System.out.println("On a scale from 1-3, how is your pain?(ache,painful,sharp)");
					painS=scan.next();
			}		
		}
				
		pain = Integer.parseInt(painS);
		System.out.println("Collecting diagnosis...");
		System.out.println();
		
		person.updateCondition(ailment, pain);
		System.out.println(person.givePainData());
		
		
		
	
	}
}
