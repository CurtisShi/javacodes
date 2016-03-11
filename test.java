import java.util.Arrays;
import java.util.Collections;

public class test
{
	ArraysT arrayst = new ArraysT();
	public static void main(String[] args) {
		int a = 3;
		System.out.println(3 + 4 + "");	
		System.out.println("" + 3 + 4);
		ArraysT.array1();	
	}
}

class ArraysT
{
	public static void array1(){
		int[][] a1 = new int[][] {new int[1], new int[3]};
		int[][] a2 = new int[3][];

		System.out.println(a1.equals(a2));
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a1[0]));

		int[] a3 = new int[] {3,3,6,8,11,33,22,55};
		for(int n : a3){
			System.out.println(n);
		}
		Arrays.sort(a3);
		Integer[] a4 = new Integer[]{
			new Integer(1),
			new Integer(2),
			new Integer(3333),
			new Integer(111),
			new Integer(22),
			new Integer(33)
		};
		Arrays.sort(a4, Collections.reverseOrder());	
		for(int n : a4){
			System.out.println(n);
		}
	}

	public void  binarySearch(){
		;
	}
}