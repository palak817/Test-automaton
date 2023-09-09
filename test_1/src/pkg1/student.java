package pkg1;

public class student {
	int a;
	public void palak()
	{
		System.out.println("welcome to java");
	}
	public static void main(String[] args)//pillar no2
	{
		student xyz=new student(); //pillar no3
		xyz.palak();
		xyz.a=122;
		System.out.println(xyz.a);
		xyz.a=111;
		System.out.println(xyz.a);
		
		
	}
}
