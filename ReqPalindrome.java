import java.io.*;
public class ReqPalindrome{
	public static int checkPalindome(String arr,int t){
		int mean=t/2;
		int cnt=0;
		for(int i=0;i<mean;i++){
				if(arr.charAt(i)!=arr.charAt(t-i-1))cnt++;
		}	
		return cnt;
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String arr=br.readLine();
		int t=arr.length();
		arr.toLowerCase();
		System.out.println(checkPalindome(arr,t));
	}
}