package constructor;

public class MyOverloading 
{
	
	public MyOverloading() 
	{
		System.out.println("Inside default constructor");
	}

	public MyOverloading(int i)
	{
	System.out.println("Inside single parameter constructor with int value");
	}
	
	public MyOverloading(String str)
	{
	System.out.println("Inside single parameter constructor with String object");
	}
	
	public MyOverloading(int i, int j)
	{
		System.out.println("Inside double parameter constructor");
	}
	
	public static void main(String[] args) 
	{
		MyOverloading mco= new MyOverloading();
		
	MyOverloading spmco= new MyOverloading(10);
	MyOverloading dpmco= new MyOverloading("Siv Nag Karthik");
	
	MyOverloading dpmco1= new MyOverloading(10,20);
		
	}

}
