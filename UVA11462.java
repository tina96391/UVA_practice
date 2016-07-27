import java.util.Scanner;
import java.util.Arrays;

public class UVA11462{
	public static void main(String[] argv){
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		while(n>0){
			int[] num=new int[n];
			for(int i=0 ; i<n ; i++){
				num[i] = input.nextInt();
			}
			Arrays.sort(num);
			for(int i=0 ; i<n-1 ; i++){
				System.out.print(num[i]+" ");
			}
			for(int i=n-1 ; i<n ; i++){
				System.out.print(num[i]);
			}
			System.out.println();
			n = input.nextInt();
		}
		
	}
}