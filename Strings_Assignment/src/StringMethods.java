
public class StringMethods {
	
public static void main(String[] args) {
		
		String str = "Java String pool refers to collection of String which are stored in heap memory";
		
	// Ques a :-
		
		String str1 = str.toLowerCase();
		System.out.println("String in lowercase : "+str1);
		
	//Ques b :-
		
		String str2 = str.toUpperCase();
		System.out.println("String in uppercase : "+str2);
		
	//Ques c :-
		
		String str3 = str.replace("a","$");
		System.out.println("String replaced (a with $) : "+str3);
		
	//Ques d :-
		
	     System.out.println(str.contains("collection"));
	     
	//Ques e :-
	     
	     String str4 = "java string pool refers to collection of string which are stored in heap memory";
	     System.out.println(str.equals(str4));
	     
	//Ques f :-
	     
	     String str5 = "java string pool refers to collection of string which are stored in heap memory";
	     System.out.println(str.equalsIgnoreCase(str5));
		

	}

}
