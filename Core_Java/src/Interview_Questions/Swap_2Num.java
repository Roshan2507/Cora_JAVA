package Interview_Questions;

public class Swap_2Num {

	public static void main(String[] args) {
//swap with temp variable
		int a =4;
		int b =5;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		
		//swap without temp variable
		
		a=a+b;//9
		b=a-b;//4
		a=a-b;//5
		System.out.println(a+" "+b);
		
		
		
	}

}
