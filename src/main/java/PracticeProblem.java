import java.util.Scanner;

public class PracticeProblem {
	static Scanner sc;
	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1(){
		sc = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(sc.nextLine().charAt(0));
	}

	public static void q2(){
		sc = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(!sc.nextBoolean());
	}

	public static void q3(){
		sc = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(sc.nextInt() > 5);
	}

	public static void q4(){
		sc = new Scanner(System.in);
		System.out.print("In: ");
		double num = sc.nextDouble();
		System.out.println(-2 <= num && num <= 2);
	}

	public static void q5(){
		sc = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(sc.nextLine().equals("Hello World"));
	}

	public static void q6(){
		sc = new Scanner(System.in);
		System.out.print("In: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("In: ");
		int num2 = sc.nextInt();
		System.out.println(num1 <= num2);
	}

	public static void q7(){
		sc = new Scanner(System.in);
		System.out.print("In: ");
		double num1 = sc.nextDouble();
		System.out.print("In: ");
		double num2 = sc.nextDouble();
		System.out.println(num1 > num2);
	}

}
