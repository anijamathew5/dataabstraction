package dataabstract;
//multiple inheritence
public class InterfaceChild implements Interfaceparent1,Interfaceparent2{

	public void add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild obj=new InterfaceChild();
		obj.add();
	}

}
