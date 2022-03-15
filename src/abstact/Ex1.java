package abstact;
abstract class Animal
{
	abstract String getname();
}
class Dog extends Animal
{
	String getname()
	{
		return "Dog";
	}
}
class Cat extends Animal
{
	String getname()
	{
		return "Cat";
	}
}
public class Ex1 {

	public static void main(String[] args) {
		//Dog d=new Dog();
		//System.out.println(d.getname());
		//Cat c=new Cat();
		//System.out.println(c.getname());
		Animal a;
		a=new Dog();
		System.out.println(a.getname());
		a=new Cat();
		System.out.println(a.getname());

	}

}
