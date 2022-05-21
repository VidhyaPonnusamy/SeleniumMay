package week1.day2;

public class ArrayFindingTheDuplicates {

	public static void main(String[] args) {
		int a[] = {10, 15, 14, 10, 67, 10, 15, 15};
		int count =0;
		
		for(int i=0; i<a.length;i++) {
			count = 0;
			for (int j=i+1; j<a.length;j++) {
				if(a[i] == a[j])
				 count++;
			}
			if(count==1)
				System.out.println(a[i]);
		}
		

	}

}
