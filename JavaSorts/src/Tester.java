import java.util.*;

public class Tester {

	public static void main(String[] args) {
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		data.add(90);
		data.add(15);
		data.add(4);
		data.add(27);
		data.add(52);
		data.add(87);
		data.add(2);
		data.add(14);
		data.add(100);
		Sorter mySorter = new Sorter(data);
		
		
		
		for(int i = 0; i < data.size(); i++)
		{
			System.out.print(data.get(i) + " ");
		}
		
		//mySorter.quickSort(data, 0, data.size()-1);
		data = mySorter.mergeSort(data);
		System.out.println();
		
		for(int i = 0; i < data.size(); i++)
		{
			System.out.print(data.get(i) + " ");
		}

	}

}
