/*import java.io.*;
import java.util.*;
import java.util.regex.*;
class Regex2{
	public static void main(String []args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String em="";

	}
}



\b(?:25[0-5]|[1][0-9][0-9]|[2][0-4][0-9]|[1-9][0-9]|[0-9])
\b(?:255[0-2]|25[0-4][0-9]|2[0-4][0-9]{2}|1[0-9]{3}|[1-9][0-9]{2}|[5-9][0-9]|4[2-9])\b
*/
import java.io.*;
import java.util.*;
import java.util.regex.*;
class Regex2{
    public static void main(String []args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        String ipv4="^(?:25[0-5]|[1][0-9][0-9]|[2][0-4][0-9]|[1-9][0-9]|[0-9]).(?:25[0-5]|[1][0-9][0-9]|[2][0-4][0-9]|[1-9][0-9]|[0-9]).(?:25[0-5]|[1][0-9][0-9]|[2][0-4][0-9]|[1-9][0-9]|[0-9]).(?:25[0-5]|[1][0-9][0-9]|[2][0-4][0-9]|[1-9][0-9]|[0-9])$";
         String ipv6="^[a-f|A-F|0-9]{1,4}.[a-f|A-F|0-9]{1,4}.[a-f|A-F|0-9]{1,4}.[a-f|A-F|0-9]{1,4}.[a-f|A-F|0-9]{1,4}.[a-f|A-F|0-9]{1,4}.[a-f|A-F|0-9]{1,4}.[a-f|A-F|0-9]{1,4}$";
        int cnt=0;
        for(int i=0;i<t;i++){
            String s=br.readLine();
            if(s.matches(ipv4))
                System.out.println("IPv4");
            else{
                 if(s.matches(ipv6))
                    System.out.println("IPv6");                
                else
                    System.out.println("Neither");
            }
        }

    }
}