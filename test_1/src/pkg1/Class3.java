package pkg1;

public class Class3 {
	
	public int sum (int a, int b)
	{
    int c;
	c= a+b;
	System.out.println("sum result is"+c);
	return c;
	}
	public int subtract (int c, int d)
	{
		int e ;
		e=c-d;
		System.out.println("subract result is"+e);
		return e;
	}
		public int multi(int x1 ,int x2) 
		{
		int x;
		x=x1*x2;
		System.out.println("final result is "+x);
		return x;
		}
		public void divide(int z1, int z2)
		{
			int z;
			z=z1/z2;
			System.out.println("final result is"+z);
		}
			public static void main(String[] args) 
			{
			Class3 ref=new Class3 ();
			int sumresult=ref.sum(10,2);
			int sumresult1=ref.sum(sumresult,2);
			int subtractresult=ref.subtract(10,2);
			int multiresult=ref.sum(sumresult,subtractresult,2)
			ref.divide(sumresult,sumresult1,subtractresult);
			
		
			}
			
		
			
		
		
					
		

		
	}
	


