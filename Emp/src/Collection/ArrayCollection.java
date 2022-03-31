package Collection;

import java.util.ArrayList;

public class ArrayCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		arrlist.add(100);
		arrlist.add(300);
		arrlist.add(799);
		
		System.out.println("array after insertion");
		for(Integer i: arrlist) {
			System.out.println(i);
		}
		arrlist.remove(2);
		
		System.out.println("array after deletion");
		for(Integer i: arrlist) {
			System.out.println(i);
		}

	}

}
