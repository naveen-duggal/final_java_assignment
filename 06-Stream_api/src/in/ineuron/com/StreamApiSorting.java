package in.ineuron.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiSorting {

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println("Before sorting ::"  +al);
		
		//using stream api
		//Ascending order
		List<Integer> resultList=al.stream().sorted().collect(Collectors.toList());
		System.out.println("After sorting :: "+resultList);	
		
		//Descending order
		List<Integer> customizedResult = al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("After sorting :: "+customizedResult);
	}
}
