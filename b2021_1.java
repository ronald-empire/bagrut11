public class Main {
	public static void main(String[] args) {
		int[] arr = new int[]{ -2,3,5,5,6,2,8,6,4,-6, }; 
		int num = 6;
		int i;
		filter(arr, num);
	}
	public static int[] filter(int[] arr1, int num) {
	    int count = 0;
	    int j = 0;
	    for (int l = 0; l < arr1.length; l++) {
	        if (arr1[l] == num) {
	            count++;  
	        }
	    }
	    int[] arr2 = new int[arr1.length-count];
	    for (int i = 0; i < arr1.length; i++) {
	        if (arr1[i] != num) {
	            arr2[j] = arr1[i];
	            j++;
	        }
	    }
	    for (int k = 0; k < arr2.length; k++) {
	        System.out.print(arr2[k] + ", ");
	    }
	    return arr2;
	}
}
