package UserRegistration.com;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration1 {

	 public static void main(String[] args) {
	        System.out.println("Welcome to UserRegistration");
	        int choose = 1;
	        for(choose=1;choose<4;choose++) {

	            switch (choose) {
	                case 1:
	                    UserRegistrationOptions.firstName();
	                    break;
	              }
	            
	        }
	    }
	}

  class UserRegistrationOptions{
  static Scanner input = new Scanner(System.in);
  static String text;
  static String firstName = "^[A-Z][a-zA-Z]{2,}$";

  //UC-1  
  public static void firstName() {
       while (true) {
        System.out.println("Enter FirstName : ");	
        text = input.nextLine();
        Pattern pattern = Pattern.compile(firstName);
        Matcher matcher = pattern.matcher(text);
	      if (matcher.matches()) {
	          System.out.println("Valid pattern");
	            break;
	       }
              else {
	       System.out.println("Invalid firstName Pattern,Try Again");
	       System.out.println(" ");       }
	       }
     }
}
