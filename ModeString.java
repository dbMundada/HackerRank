import java.io.*;
public class ModeString{
	public static int mode(String arr,int t){
		int []count=new int[255];
		int superfre=0;
		for (int i=0;i<t;i++) {
			count[arr.charAt(i)]++;
			if(count[arr.charAt(i)]>superfre)
				superfre=count[arr.charAt(i)];
		}
		return superfre;
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String arr=br.readLine();
		int t=arr.length();
		arr.toLowerCase();
		System.out.println(mode(arr,t));
	}
}