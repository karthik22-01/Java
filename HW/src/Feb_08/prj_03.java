package Feb_08;

public class prj_03 
{
int a=10,b=20,result; //properties

public void add()
{
	result = a+b;
	System.out.println("Add of A & B is :" + result);
}

public void sub()
{
	result = a-b;
	System.out.println("Sub of A & B is :" + result);
	
}

public static void main(String[] args)
{
	prj_03 obj = new prj_03();
	obj.add();
	obj.sub();
	
	prj_03 obj1 = new prj_03();
	obj1.add();
	obj1.sub();
}
}

