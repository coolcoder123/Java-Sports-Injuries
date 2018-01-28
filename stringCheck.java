
public class stringCheck {
	public int checkString(String input) {
		char[] arr = {'A', 'B', 'C', 'D', 'E' ,'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z','!','@','#','$','%','^','&','*','(',')','.','?',';',':','/','[',']','{','}','-','_','+','=','|','\"','\'','`','~'};
		for (int i=0; i< input.length(); i++) {
			for (int z=0;z<arr.length;z++) {
				if ((input.charAt(i)) == (arr[z])) {
					return 0;
				}
			}
		}
		return 1;
	}
}
