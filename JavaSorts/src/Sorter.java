import java.util.*;
public class Sorter {
	ArrayList<Integer> myList;
	public Sorter(ArrayList<Integer> data)
	{
		myList = data;
	}
	
	//Quicksort has an average case of O(n log n).  In the worst case, it will be O(n^2), but this is very rare.
	//In most cases, it is a quick and efficient sorting algorithm.
	//This specific implementation sorts the ArrayList in place instead of creating sub-arrays.
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
	
	public ArrayList<Integer> mergeSort(ArrayList<Integer> data){
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		int mid;
		if(data.size() <= 1){
			return data;
		}
		else
			mid = data.size()/2;
		
		for(int i = 0; i <= mid-1; i++){
			left.add(data.get(i));
		}
		for(int j = mid; j < data.size();j++){
			right.add(data.get(j));
		}
		
		left = mergeSort(left);
		right = mergeSort(right);
		if(left.get(left.size()-1) <= right.get(0)){
			left.addAll(right);
			return left;
		}
		return merge(left, right);
		
	}
	
	public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right){
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		while(left.size() > 0 && right.size() > 0){
			if(left.get(0) <= right.get(0)){
				sorted.add(left.get(0));
				left.remove(0);
			}
			else{
				sorted.add(right.get(0));
				right.remove(0);
			}
		}
		if(left.size() > 0)
			sorted.addAll(left);
		if(right.size() > 0)
			sorted.addAll(right);
		return sorted;
	}
}
