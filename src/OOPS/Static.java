package OOPS;
//class A
//{
//int x=10;
//static int y=20;
//}
//public class Static {

	//public static void main(String[] args) {
		//System.out.println(x);
	//System.out.println(A.y);
	//}

//}

class Power
{
	static int pow(int num,int p)
	{
		int res=1;
		for(int i=1;i<=p;i++)
		res=res*num;
		return res;	
	}
}
	public class Static
	{
		public static void main(String[] args) {
			int res=Power.pow(5,2);
			System.out.println(res);
		}
	}