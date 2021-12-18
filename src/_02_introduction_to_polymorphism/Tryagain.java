package _02_introduction_to_polymorphism;

public class Tryagain {
	
	public static void main(String[] args) {
		int[][] mtx = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};

		for(int i = 0; i < mtx.length / 2; i++){

		         int[] t = mtx[i];
		         mtx[i] = mtx[mtx.length - i - 1];

		         mtx[mtx.length - i - 1] = t;

		}
	}
	
}

