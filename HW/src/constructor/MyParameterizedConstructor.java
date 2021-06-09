package constructor;

public class MyParameterizedConstructor 
{
     private String name;
     
     
     public MyParameterizedConstructor (String str)
     {
    	 this.name = str;
    	 System.out.println("I am inside parameterized constructor.");
    	 System.out.println("The parameterized value is:" +str);
     }
     
	public static void main(String[] args) 
	{
		MyParameterizedConstructor mpc = new MyParameterizedConstructor(" Karthik ");
		MyParameterizedConstructor mpc1 = new MyParameterizedConstructor(" Siv Nag ");
	}

}
