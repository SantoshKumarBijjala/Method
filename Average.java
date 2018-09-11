package Assignment_4;
public class Average {
		public static int avg(int a,int b)
		{
			int avg=(a+b)/2;
			return avg; 
		}
		public static double avg(double a,double b)
		{

			double avg=(a+b)/2;
			return avg;
		}

		public static void main(String[] args) 
		{
			int ans=avg(6,7);
			double ans1=avg(7.865,7.424);
	System.out.println(ans);
	System.out.println(ans1);
		}

	}

