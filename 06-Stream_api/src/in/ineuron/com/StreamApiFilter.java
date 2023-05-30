package in.ineuron.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiFilter {

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(22);
		al.add(15);
		al.add(32);
		al.add(17);
		System.out.println("Before Filter ::"  +al);
		
		//using stream api
		//filter even number
		List<Integer> resultList=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("After Filter even Number :: "+resultList);	
		
	}
}
