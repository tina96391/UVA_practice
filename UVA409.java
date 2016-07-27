import java.util.*;
public class UVA409{
    public static void main(String[] args) {     
            Scanner sc=new Scanner(System.in);
            char str[][]=new char[100][100];
            int i=0, maxlen=0;
            while(sc.hasNext())
            {
          		String str1=sc.nextLine();
          		int n=str1.length();       
          		if(n>maxlen)
          			maxlen=n;		
          		for(int j =0;j<n;j++)
          			str[i][j]=str1.charAt(j);
          		i++;
            }
            for(int k=0;k<100;k++)
            	for(int j=0;j<100;j++)
            		if(str[k][j]==0)
            			str[k][j]=' ';
            for(int k=0;k<maxlen;k++){
            	for(int j=i-1;j>=0;j--)
            		System.out.print(str[j][k]);
            	System.out.println();
            }
            sc.close();      
    }
}