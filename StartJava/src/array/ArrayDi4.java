package array;

public class ArrayDi4 {

	public static void main(String[] args) {
		//3x4 2차원 배열을 만든다.
		int[][] arr = new int [3][4];
		
		int i = 1; //배열안 숫자 생성 초기화
		for(int row = 0; row < arr.length; row++) { //배열 안 숫자 생성
			for( int col = 0; col < arr[row].length; col++) {
				arr[row][col] = i++;
			}
		}
		
		
		for( int row = 0; row < arr.length; row++) { //행 탐색
			for( int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " "); //  열 탐색 & 출력
			}
			System.out.println(); // 행 출력 후 줄바꿈
		}

	}
}
