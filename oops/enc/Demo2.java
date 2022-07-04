class Emp
{
	private  int id ;
	private String name ;
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setId(int id)
	{
		this.id=id;
	}
	int  getId()
	{
		return id;
	}
}
class Demo2
{
	public static void main(String args[])
	{
		Emp e=new Emp();
		e.setId(100);
		e.setName("Pravin");
		System.out.print("ID : "+e.getId()+ " Name : " +e.getName());		
	}
}