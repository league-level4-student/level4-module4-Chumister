package _04_hospital;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Array2DTests {

	@Test
	void test() {
		Integer[][] nums = {
				{0, 1, 2},
				{3, 4, 5},
				{6, 7, 8}
			};
		Integer[] t1 = {2, 1, 0};
		Integer[] t2 = {5, 4, 3};
		Integer[] t3 = {8, 7, 6};	
		reverseColumns(nums);
		
		assertArrayEquals(t1, nums[0]);
		assertArrayEquals(t2, nums[1]);
		assertArrayEquals(t3, nums[2]);
		
		String[][] words = {
				{"A", "B", "C", "D"}, 
				{"E", "F", "G", "H"}, 
				{"I", "J", "K", "L"}, 
				{"M", "N", "O", "P"}
			};
		
		String[] s1 = {"D", "C", "B", "A"};
		String[] s2 = {"H", "G", "F", "E"};
		String[] s3 = {"L", "K", "J", "I"};
		String[] s4 = {"P", "O", "N", "M"};
		
		reverseColumns(words);
		
		assertArrayEquals(s1, words[0]);
		assertArrayEquals(s2, words[1]);
		assertArrayEquals(s3, words[2]);
		assertArrayEquals(s4, words[3]);
	}
	
	/*
	 * Complete the reverseColumns method so that the 2D array arr gets
	 * only its columns reversed. Remember that a 2D array is an 
	 * array of arrays. You can make helper methods if needed.
	 */
	public <T> void reverseColumns(T[][] arr) {
		
	        for(int x = 0;x < arr.length; x++){
	            for(int y = 0; y < arr[x].length/2; y++) {
	                T temp = arr[x][y];
	                arr[x][y] = arr[x][arr[y].length-1-y];
	                arr[x][arr[y].length-1-y] = temp;
	            }
	           
	        }
	        System.out.println(arr);
	}
}

