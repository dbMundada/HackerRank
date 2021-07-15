import java.io.*;
import java.util.*;
import java.util.regex.*;

const phoneNumber = "rgekjrng kjrgnjke";
const salary ="serger";
const stripeAcct = 12123;
const username = "asfweferg.com";

class Regex1{
	public static void main(String []args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	/*	String in=br.readLine();
		String s1="Hii\\s+Datta \\d+\\D+";
		String s2="\\SDBM\\d{3,5}\\W";
		String ssn="192-83-7465";
		String s3="[0|1|2|3]\\d-[0]\\d-\\d{1,4}";
		String s4="[0|1|2|3]\\d-[1][1|2|0]-\\d{1,4}";
		if (ssn.matches("^(\\d{3}-?\\d{2}-?\\d{4})$")) {
				System.out.println("Found good SSN: " + ssn);
		}

		if(in.matches(s3)){
			System.out.println("YES");	
		}
		else{
			if(in.matches(s4))
				System.out.println("YES");	
			else
				System.out.println("NO");
		}
			*/
		String input = "91-011-23413627";

		Pattern p = Pattern.compile("(\\d+)( |-)");
		Matcher m = p.matcher(input);
		int cnt=0;
		StringBuffer result = new StringBuffer();
		List<String> animals = new ArrayList<String>();
		while (m.find()) {
			animals.add(m.group());
			if(cnt==0){
			m.appendReplacement(result, "CountryCode="+m.group(1)+",");
			}
			else{
				m.appendReplacement(result, "LocalAreaCode="+m.group(1)+",");
			}
			cnt++;
		}
	//	LocalAreaCode
		result.append("Number=");
		m.appendTail(result);
		System.out.println(result);
		String em="([^a-z|^A-Z|^_|^0-9]+)("+input+")([^a-z|^A-Z|^_|^0-9]+)";

	}
}
