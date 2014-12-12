import java.io.*;
class IntCombination{
	public static void combinations(int []no,int t){
		String
	}
	public static void main(String []args){
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int t=0;
		String s="";
		try{
			t=Integer.parseInt(br.readLine());
			s=br.readLine();
		}
		catch(Exception e){}
		String []arr=s.split(" ");
		int []no=new int[t];
		for (int i=0;i<t;i++) {
			try{
			no[i]=Integer.parseInt(arr[i]);
			}
			catch(Exception e){}
		}
		combinations(no,t);
	}