

public class SecondSmallNumber {
	public static void main(String[] args) {
		int j = 0 ,i;
	int	arr1 []= {2,3,4,1,65,6};
		
		for ( i = 0;i<6;i++) {
			for( j = i+1;j<6;j++) {
			if(	arr1[i]<arr1[j]) {
				int tem = arr1[i];
				arr1[i] = arr1[j];
				arr1[j]=tem;
			}else {
					System.out.println(arr1[i]);
			}            }
}	
				
//System.out.println(arr1[j]);
	}
	
	
	}
		
	   
