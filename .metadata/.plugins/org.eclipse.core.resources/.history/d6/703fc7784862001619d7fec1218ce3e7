import java.util.*;
public class Sorter {
	ArrayList<Integer> myList;
	public Sorter(ArrayList<Integer> data)
	{
		myList = data;
	}
	
	public void quickSort(ArrayList<Integer> data, int left, int right)
	{
		int pivot = partition(data, left, right);
		if(left < pivot-1)
			quickSort(data, left, pivot-1);
		if(right > pivot)	
			quickSort(data, pivot, right);
	}
	
	public int partition(ArrayList<Integer> data, int left, int right)
	{
		int i = left;
		int j = right;
		Integer p = data.get((i + j)/2);
		while(i <= j)
		{
			while(data.get(i) < p)
			{
					i++;
			}
			while(data.get(j) > p)
			{
					j--;
			}
			if( i <= j)
			{
				Integer tmp = data.get(i);
				data.set(i, data.get(j));
				data.set(j, tmp);
				i++;
				j--;
			}
			
			
		}
		return i;
	}
}
