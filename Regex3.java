import java.io.*;
import java.util.*;
import java.util.regex.*;
class Regex3{
    public static void main(String []args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        String em="^(_|.)\\d+[a-zA-Z]+_?$";
        for(int i=0;i<t;i++){
            String s=br.readLine();
            if(s.matches(em))
                System.out.println("VALID");
            else{
                    System.out.println("INVALID");               
            }
        }

    }
}