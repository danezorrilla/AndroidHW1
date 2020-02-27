import java.util.*;

class H1W1D3{

// Coding #1
public void findDuplicates(List<String>strings){
	int count = 0;
	List<String> duplicateList = new ArrayList<String>();
	for(int currentIndex = 0; currentIndex < strings.size(); currentIndex++){
		int nextIndex = currentIndex + 1;
		while(nextIndex < strings.size()){
			if(strings.get(currentIndex) == strings.get(nextIndex)){count++;}
			nextIndex++;
		}
		if(count > 0){
		duplicateList.add(strings.get(currentIndex));
		count = 0;
		}
	}
	System.out.println(duplicateList);
}

// Coding #2

public boolean checkPalindrome(String word){
	System.out.println(word);
	String reverseWord = "";
	char [] word1 = word.toCharArray();
	for(int i = word1.length-1; i >= 0; i--){reverseWord += word1[i];}
	System.out.println(reverseWord);
	if(word.equals(reverseWord)) return true;
	else return false;
}

// Coding #3
public void fizzBuzz(int number){
	if(number % 3 == 0 && number % 5 == 0){
	 System.out.println("fizzbuzz");
	}else if(number % 3 == 0){System.out.println("fizz");}
	else if(number % 5 == 0){System.out.println("buzz");}
	else{System.out.println("Not divisible of 3, 5, or both");}
}

// Coding #4
public boolean checkAnagrams(String word1, String word2){
	String reverseWord = "";
	char [] word = word1.toCharArray();
	for(int i = word.length-1; i>=0; i--){reverseWord += word[i];}
	System.out.println(reverseWord);
	if(word2.equals(reverseWord)) return true;
	else return false;
} 

// Coding #5
public void printTables(){
	int[] row = {1,2,3,4,5,6,7,8,9,10};
	int[] column = row;
	int[][] multipleTable = new int[10][10];
	for(int rowIndex = 0; rowIndex < row.length; rowIndex++){
		for(int columnIndex = 0; columnIndex < column.length; columnIndex++){
			multipleTable[rowIndex][columnIndex] = row[rowIndex] * column[columnIndex];
			System.out.print(multipleTable[rowIndex][columnIndex] + ",");
			if(columnIndex == column.length-1){System.out.println('\n');}
		}
	}
	
}


public static void main(String args[]){

	ArrayList<String> names = new ArrayList<String>();
	names.add("Al");
	names.add("Bob");
	names.add("Al");
	names.add("Bob");
	System.out.println(names);	

	H1W1D3 h1w1d3 = new H1W1D3();

	// Coding #1
	h1w1d3.findDuplicates(names);
	System.out.println();

	// Coding #2
	System.out.println(h1w1d3.checkPalindrome("racecar"));
	System.out.println();

	// Coding #3
	h1w1d3.fizzBuzz(22);
	System.out.println();

	// Coding #4
	System.out.println(h1w1d3.checkAnagrams("dog","god"));
	System.out.println();

	// Coding #5
	h1w1d3.printTables();

	}
}