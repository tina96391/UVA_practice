import java.util.*;

public class UVA1585{
    public static void main(String[] args) {  
	
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
		
		while(n-->0){
			String str = sc.next();
			
			int score=0;
			int temp=0;
			
			for(int i=0;i<str.length();i++){
				if(str.charAt(i) == 'O'){
					temp++;
					score+=temp;
				}
				else 
					temp=0;
			}
			System.out.println(score);

		}
        sc.close();      
    }
}
