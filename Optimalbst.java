import java.io.*;
class Optimalbst{
	static int j=0;
	static StringBuffer []output;
	public static int cost(int []w,int []p,int n,int d){
		int weigth[]=new int[n];
		int profit[]=new int[n];
		int m,t1,t2,min=9999;
		//sp-shortest path d-depth n-number of nodes
		if(n==1){
			output.append(w[0]+" ");
			return ((1+d)*p[0]);
		}
		else{
			for(int sp=0,int i=0;i<n;i++){
				sp+=p[i];
				if(i!=0)
					t1=cost(w,p,i-1,d+1);
				else t1=0;
				if ((n-i-1)!=0) {
					for (int k=0;k<n-i-1;k++) {
						weigth[k]=w[k+i+1];
						profit[k]=p[k+i+1];
					}
					t2=cost(w,p,n-i-1,d+1);
				}	else t2=0;
				if(t1+t2<min){
					min=t1+t2;
					if (d==0) {
						j=i;
					}
				}
			}
			return (sp+min);
			}
		}
	}
	public static void main(String []args){
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int t=0;
		output[]=new StringBuffer[t];
		try{
			t=Integer.parseInt(br.readLine());
		}
		catch(Exception e){}
		int []w=new int[t];
		int []p=new int[t];
		System.out.println("Enter Weigth then probability of nodes:")
		for (int i=0;i<t;i++) {
				try{
				w[i]=Integer.parseInt(br.readLine());
				p[i]=Integer.parseInt(br.readLine());
			}
			catch(Exception e){}
		}
		System.out.println("Solution:"+cost(w,p,t,0));
		System.out.println("Binary search tree:"+output.toString());
	}
}