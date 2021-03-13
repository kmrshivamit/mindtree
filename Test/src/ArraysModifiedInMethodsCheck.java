
public class ArraysModifiedInMethodsCheck {
	
	public static void main(String[] args) {
		int arr[]=new int[4];
		modify(arr);
		
		for(int i:arr)
			System.out.println(i);
	}

	static void modify(int arr[])	{  			
		int arr1[]= {1,2,3,4,5,6,7};
		arr[1]=55;
		arr=arr1;		
		for(int i:arr)
			System.out.println(i);
		
	}
}
