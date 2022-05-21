package week1.day2;

public class ArrayFindingTheLargest {

	public static void main(String[] args) {
		int a[] = {115, 20, 330, 45, 500};
		int temp = 0;
		for(int i=0; i<a.length;i++) {
			for (int j=i+1; j<a.length;j++) {
				if(a[i] > a[j] && temp < a[i]) 
					temp = a[i];	
			}
			
			if(temp<a[a.length-1])
				temp = a[a.length-1];
		}
		System.out.println(temp);
	}

}
