package Assignment_4;

public class Multiplication {
	public static int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public static int mul(int a,int b,int c)
	{
		int d=a*b*c;
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=mul(2,5);
		System.out.println(x);
		int h=mul(6,7,3);
				System.out.println(h);

	}

}
