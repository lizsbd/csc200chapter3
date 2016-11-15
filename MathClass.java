import java.util.Scanner;

public class MathClass {
public static void main(String[] args) {
	System.out.println("Enter value for x");
	Scanner sc = new Scanner(System.in);
	double x = Double.parseDouble( sc.nextLine());
	System.out.println("Enter value of y");
	double y =Double.parseDouble( sc.nextLine());
	System.out.println("Enter value of z");
	double z = Double.parseDouble(sc.nextLine());

	System.out.println("F(x) = x^10 = " + Math.pow(x,10));
	System.out.println("H(x,y) = x + y = " + (x+y));
	if(x>=0) {
	double functiong = Math.sqrt(x) + Math.abs(y) + Math.pow(z,y);
	System.out.println("G(x,y,z) = x^1/2 + |y| + z^y = " + functiong);
	}
	else {
	System.out.println("x value is not positive");
	}

}
}
