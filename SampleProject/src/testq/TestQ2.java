package testq;

public class TestQ2 {

	public static void main(String[] args) {
		int [] data = {64, 34, 25, 12, 22, 11, 90};
		
		System.out.println("정렬 전 배열 : ");
		for (int num : data) {
			System.out.print(num + " ");
		
		}
		System.out.println();
		
		bubbleSort(data);
		System.out.println("정렬 후 배열: ");
		for (int num : data) {
			System.out.print(num + " ");
		}
	}
	public static void bubbleSort(int[] arr) {
		
	}
}
