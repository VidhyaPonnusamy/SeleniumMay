package week1.day2;

public class ArrayFindingTheLargest2 {

	public static void main(String[] args) {
		int a[] = {115, 20, 330, 455, 500};
		int temp = 0;
		
		for(int i=0; i<a.length;i++) 
		{
			for (int j=i+1; j<a.length;j++) 
			{
				if(a[i]>a[j] && temp<a[i])
					temp = a[i];
				
				else if(temp<a[j])
					temp = a[j];
			}
		}
		
		System.out.println(temp);
	}
}
