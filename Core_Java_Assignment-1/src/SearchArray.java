
public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int value=19;
		
		int index=-1;
		int len=array.length;
		
		for(int i=0 ; i<len ; i++)
		{
			if(value==array[i])
			{
				index=i;
				System.out.println("Value found at index : "+index);
				break;
				
			}
		}
		
	}

}
