
public class SumOfArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		
		System.out.println(sum(arr,0));
	}

	static int sum(int arr[],int index)
	{
		if(index==arr.length)
			return 0;
			return arr[index]+sum(arr,index+1);
		
	}
}
