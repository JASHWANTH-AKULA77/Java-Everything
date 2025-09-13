import java.util.*;
public class CharacterValidation {
	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    char ch=sc.next().charAt(0);
    if(ch>='A'&& ch<='Z') {
	System.out.println(ch+" is Upper Case");
    }
    else if(ch>='a' && ch<='z') {
	System.out.println(ch+" is Lower Case");
	
    }
    else {
	System.out.println(ch+ " Not a charcter");
    }
    sc.close();
	}

}
//charcter validaton prograM
