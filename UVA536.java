import java.util.*;

public class UVA536{
	static char pre[] = new char[26];
	static char ino[] = new char[26];
	static char tree[] = new char[26];
	static int pos[] = new int[26];
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		while(input.hasNext()){
			String str1 = input.nextLine();
			int n=str1.length();
			int s=n/2;
			String[] token = str1.split(" ");
			int t1=token[0].length();
			int t2=token[1].length();
          	for(int i =0; i<t1; i++)
          		pre[i]=token[0].charAt(i);
			
          	for(int i =0; i<t2; i++)
          		ino[i]=token[1].charAt(i);
			
			for(int i=0; i<t1; i++){
				System.out.println(i+" "+pre[i]+" "+ino[i]);
			}
			for(int i=0; i<t1; i++){
				for(int j=0; j<t1 ;j++){
					if(pre[i]==ino[j]){
						pos[i]=j;
						break;
					}
				}
			}
			int u=0;
			for(int i=0;i<t1;i++){
				if(pre[0]==ino[i]){
					u=i;
					break;
				}
			}
          	f(0,u-1,u,u+1,t1-1);	//0 2 3 4 6
		}
		
	}
	
	public static void f(int l1,int r1,int u,int l2,int r2){
		if(l1<r1){
			System.out.println("Start 1 if");
			int minn=100;
			int nu=0;
			for(int i=l1;i<=r1;i++){
				if(minn>pos[i]){
					minn=pos[i];
					nu=i;
					System.out.println(nu);
				}
			}
			System.out.println("go 1 if F("+l1+" "+nu+" "+r1+")");
			f(l1,nu-1,nu,nu+1,r1);
		}
		if(l1==r1){
			System.out.println("l1=r1");
			System.out.print(ino[l1]);
		}
		if(l2<r2){
			System.out.println("Start 2 if");
			int minn=100;
			int nu=0;
			for(int i=l2;i<=r2;i++){
				if(minn>pos[i]){
					minn=pos[i];
					nu=i;
					System.out.println(nu);
				}
			}
			System.out.println("go 2 if F("+l2+" "+nu+" "+r2+")");
			f(l2,nu-1,nu,nu+1,r2);
		}
		if(l2==r2){
			System.out.println("l2=r2");
			System.out.print(ino[l2]);
		}
		System.out.print(ino[u]);
	}
}