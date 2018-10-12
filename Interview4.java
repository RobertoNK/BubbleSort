import java.util.Arrays;

public class Interview4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list  = {3,20,1,4,10,7};
		int temp;
		for(int i = 0; i< list.length;i++) {
			for(int j = 0; j < list.length; j++) {
				
				if(list[i]<list[j]) {
					temp = list[i];
					list[i]=list[j];
					list[j]=temp;
							
				}
				
			}
			
		}
		System.out.println(Arrays.toString(list));
	}

}
