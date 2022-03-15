package composition;
class Engine
{
	void start()
	{
		System.out.println("Engine start");
	}
}
class Motor
{
	Engine e=new Engine();
	void start()
	{
		e.start();
	}
	
}
public class ex1 {

	public static void main(String[] args) {
		Motor M=new Motor();
		M.start();
		System.out.println("Engine end");
	}
}
