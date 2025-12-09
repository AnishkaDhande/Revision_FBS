
class Printer
{
	void print()
	{
		System.out.println("Hello");
	}
	void print(int a)
	{
		System.out.println(a);
	}
	void print(String b)
	{
		System.out.println(b);
	}
	void print(char c)
	{
		System.out.println(c);
	}
}
public class PrintMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p1=new Printer();
		p1.print();
		p1.print("anishka");
		p1.print("34");
		p1.print('D');

	}

}
