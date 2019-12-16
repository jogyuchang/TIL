package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import util.Myutil;

public class Test05 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		//Set<String> set = new TreeSet<String>();
		
		set.add("lee");
		set.add("kim");
		set.add("park");
		set.add("ko");
		set.add("lee");

		Myutil.iteratorPrint(set);
		
		
		
	}
		

}


