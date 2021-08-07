
public class BubbleSort {
	
	static void bubbleSort(int[] arr) {
		int num = arr.length , temp=0;
		
		for(int i=0 ; i<num ; i++)
		{
			for(int j=1 ; j<num-i ; j++)
			{
				if(arr[j-1] > arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Array before applying Bubble Sort : ");
		
		for(int i=0; i<arr.length ; i++)
		{
		System.out.print(arr[i]+" ");
		}
		
		bubbleSort(arr);
	
		System.out.println();
		
		
        System.out.println("Array after applying Bubble Sort : ");
		
		for(int i=0; i<arr.length ; i++)
		{
		System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
