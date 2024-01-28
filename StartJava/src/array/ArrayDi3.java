package array;

public class ArrayDi3 {

	public static void main(String[] args) {
		//2x3 2차원 배열을 만든다.
		int[][] arr = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		}; //행2, 열3
		
		
		for( int row = 0; row < arr.length; row++) { //외부 for문 행 탐색
			for( int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " "); // 내부 for문 열 탐색
			}
			System.out.println();
		}

	}
}
