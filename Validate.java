import java.io.*;
class Validate{
	public static void main(String []args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String em= "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(s.matches(em)){
			System.out.println("Valid");
		}
		else
			System.out.println("InValid");
	}
	

}