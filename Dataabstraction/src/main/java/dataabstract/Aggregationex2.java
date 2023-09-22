package dataabstract;

public class Aggregationex2 {
	String course;
	int rank;
	Aggregationex1 p;
	Aggregationex2(String course,int rank,Aggregationex1 p)
	{
		this.course=course;
		this.rank=rank;
		this.p=p;
	}
	public void show()
	{
		
		System.out.println(p.name+ "  " +p.age);
		System.out.println(course+ "  " +rank);
		
	}
	public static void main(String args[])
	{
		Aggregationex1 obj=new Aggregationex1("anu",20);
		Aggregationex2 obj1=new Aggregationex2("MBA",6,obj);
		obj1.show();
	}

}
