package Interview_Questions;

public class String_1 {

	public static void main(String[] args) {

		String a="javatraining";
		
		System.out.println(a.charAt(1));
		System.out.println(a.indexOf("a"));
		System.out.println(a.substring(3,7));
		System.out.println(a.concat(" Roshan teaching "));
		
		System.out.println(a.trim());
	//	a.toLowerCase();
		
		System.out.println(a.toUpperCase());
		
		String arr[] = a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	}

}
