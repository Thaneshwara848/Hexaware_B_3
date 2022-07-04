import java.util.*;
public class Demo1 {
	public static void main(String[] args) {
		
		//List l=new List();
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Thanesh");
		al.add(true);
		al.add('A');
		al.add(10.6);
		al.add(new Date());
		al.add(new Thread());
		System.out.println(al);
		System.out.println("==============");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("====== Iterator  ========");
		Iterator	i= al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}