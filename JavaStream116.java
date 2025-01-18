import java.util.ArrayList;
import java.util.stream.Stream;

public class JavaStream116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 Stream is collection of strings.
		 */
		ArrayList<String> li=new ArrayList<String>();
		li.add("mahesh");
		li.add("Sarang");
		li.add("Rohit");
		li.add("Shruti");
		li.add("manasi");
		
		int count=0;
		for(int i=0;i<li.size();i++)
		{
			String name=li.get(i);
		    if(name.startsWith("R"))
		    {
		    	count++;
		    }
		}
		System.out.println("Count of the name starts with R is="+count+"\n");
		
		//Using stream i.e converting Arraylist to stream
		
		long count2=li.stream().filter(s->s.startsWith("m")).count();
		System.out.println("Count of the names starts with M using stream class is = "+count2+"\n");
		
		// Creating stream i.e. collection of string (Here we skipped to convert the ArrayList to stream rather created direct stream )
		long count3=Stream.of("Dinesh","Pratap","Dinkar","Pralhad").filter(s->s.startsWith("P")).count();
		System.out.println("Count of the names starts with P using stream class is = "+count3+"\n");
		
		
		//To print the ArrayList elements in normal way
		System.out.println("Below are the elements present in the ArrayList printed using normal way \n");
		for(int j=0;j<li.size();j++)
		{
			System.out.println(li.get(j));
		}
		
		//To print ArrayList i.e. li using stream
		System.out.println("Below are the elements present in the ArrayList printed using STREAM \n");
		li.stream().forEach(s->System.out.println(s));
		
		
	   
	}

}
