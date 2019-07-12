package _02_fibonacci;

public class Fibonacci {
public static void main(String[] args) {
	int x=0;
	int y=1;
	int temp=x;
	x=y;
	y=temp;
	
	for(int i=0;i<12;i++) {

int z=x+y;
System.out.println(z);
x=z+y;
System.out.println(x);
y=x+z;
System.out.println(y);
	
	}
	
}
}

