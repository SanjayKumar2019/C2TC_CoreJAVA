package methodOverloading;

class over1
{  
static int add(int a,int b)
{
	return a+b;
}  
static int add(int a,int b,int c)
{
	return a+b+c;
	}  
}  
class TestOverloading1
{  
public static void main(String[] args)
{  
System.out.println(over1.add(11,11));  
System.out.println(over1.add(11,11,11));  
}
}  
