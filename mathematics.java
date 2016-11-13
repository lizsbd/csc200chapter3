import javax.swing.JOptionPane;

public class mathematics {
public static void main(String[] args) {
	int xvalue = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter positve value of x"));
	int yvalue = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter value of y"));
	int zvalue = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter value of z"));
	JOptionPane.showMessageDialog(null, "f(x) = x^10 = " +functionf(xvalue),"Function f(x)", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, "h(x,y) = x + y = " +functionh(xvalue,yvalue),"Function h(x)", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null,"g(x,y,z) = " +(functionq(xvalue) + functiong(yvalue) + functionl(yvalue, zvalue)), "Function g(x)", JOptionPane.INFORMATION_MESSAGE);

}


public static int functionf(int x) {
	return x*x*x*x*x*x*x*x*x*x;
}
public static int functionh(int x, int y) {
	return x+y;
}
public static double functionq(int x) {
	double sqrRoot = x/2;
	double t = sqrRoot;
	do {
	
	sqrRoot = (t + (x/t))/2;
	}while((t-sqrRoot) != 0);
	return sqrRoot;
}
public static int functiong(int y) {
	if(y>=0) {
	return y;
	} else {
	return -y;
	}
	}  

public static int functionl(int y, int z){
	int i =1;
	if(y==0) {
	return 1;
	}
	else{
	while((y-i)!=0){
	z *= z;
	i++;}
	return z;
	}



	}

}