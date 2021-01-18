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
	                case 2:
	                    UserRegistrationOptions.lastName();
	                    break;
 	                case 3:
	                    UserRegistrationOptions.email();
	                    break;
 	                case 4:
 	                	UserRegistrationOptions.mobile();
	            }
	            
	        }
	    }
	}

	class UserRegistrationOptions{
	    static Scanner input = new Scanner(System.in);
	    static String text;
	    static String firstName = "^[A-Z][a-zA-Z]{2,}$";
	    static String lastName = "^[A-Z][a-zA-Z]{2,}$";
	    static String email = "^[0-9a-zA-Z]+([.\\-_+][0-9a-zA-Z]+)*@[a-z0-9A-Z]+.[a-z]{2,4}([.][a-zA-Z]{2,})*$";
	    static String mobile = "^91[ ][6-9][0-9]{9}$";
	    public static void firstName() {
	        while (true) {
	            System.out.println("Enter FirstName : ");
	            text = input.nextLine();
	            Pattern pattern = Pattern.compile(firstName);
	            Matcher matcher = pattern.matcher(text);
	            if (matcher.matches()) {
	                System.out.println("Valid pattern");
	                break;
	            } else {
	                System.out.println("Invalid firstName Pattern,Try Again");
	                System.out.println(" ");
	            }            }
	        }

	    

	    public static void lastName() {
	        while (true) {
	            System.out.println("Enter lastName : ");
	            text = input.next();
	            Pattern pattern = Pattern.compile(lastName);
	            Matcher matcher = pattern.matcher(text);
	            if (matcher.matches()) {
	                System.out.println("Valid pattern");
	                break;
	            } else {
	                System.out.println("Invalid Pattern,Try Again");
	                System.out.println(" ");
	            }

	        }
	    }
	    

	    public static void email() {
	        while (true) {
	            System.out.println("Enter Email : ");
	            text = input.nextLine();
	            Pattern pattern = Pattern.compile(email);
	            Matcher matcher = pattern.matcher(text);
	            if (matcher.matches()) {
	                System.out.println("Valid pattern");
	                break;
	            } else
	                System.out.println("Invalid Pattern , Try Again");
	            System.out.println(" ");
	        }
	    }

	    
	    public static void mobile() {
	        while (true) {
	            System.out.println("Enter Mobile number : ");
	            text = input.next();
	            Pattern pattern = Pattern.compile(mobile);
	            Matcher matcher = pattern.matcher(text);
	            if (matcher.matches()) {
	                System.out.println("Valid pattern");
	                break;
	            } else {
	                System.out.println("Invalid Pattern,Try Again");
	                System.out.println(" ");
	            }

	        }
	    }
	 }	    
