package Oct18;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i];
			if(i%2 == 0)
			{
				int max = i;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[max] < arr[j])
						max = j;
				}
				
				arr[i] = arr[max];
				arr[max] = temp;
			}
			
			else
			{
				int min = i;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[min] > arr[j])
						min = j;
				}
				
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		
		for(int i : arr)
			System.out.print(i+" ");

		System.out.println("Sorted in alternate order");

	}

}
