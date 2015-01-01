import java.io.*;
import java.util.*;
import java.util.regex.*;
class Regex4{
	public static void main(String []args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String []arr=new String[t];
		for(int i=0;i<t;i++)
			arr[i]=br.readLine();
		int n=Integer.parseInt(br.readLine());
		for (int j=0;j<n ;j++ ) {
			String input =br.readLine();
			int cnt=0;
			String input1=input.substring(0,input.length()-2);
			System.out.println(input1);
			String em="("+input1+"ze|"+input1+"se)";
			for(int i=0;i<t;i++){
				Pattern p = Pattern.compile(em);
				Matcher m = p.matcher(arr[i]);
				while (m.find()) {
					cnt++;
				}
	   		}
	   		System.out.println(cnt);
		}
	}
}