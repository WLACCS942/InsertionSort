import java.util.ArrayList;

public class InsertSort {
	//prepare an ArrayList
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	//private ArrayList<Character> alphabet = new ArrayList<Character>();
	
	//constructor. Put all numbers into the prepared ArrayList
	public InsertSort(int[] array){
		for(int arr: array){
			numbers.add(arr);
		}
	}
	//Sort
	public void InsertionSort(){
		int valToSort;  //value to sort
		
		// sort from left to right
		for(int i=1;i<numbers.size();i++){
			valToSort = numbers.get(i);
			int j=i; //j is tracking the location of value to be sorted
			while(j>0 && numbers.get(j-1) > valToSort ){
				numbers.add(j-1,valToSort);   //move to left
				numbers.remove(j+1); //remove the original one which moved 1 position to the right			    
			    j--;
			}			
		}
	}
	
	public String toString(){
		String str="";
		for(Integer num: numbers){
			str += num + " ";
		}
		return str;
	}
}
