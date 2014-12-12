import java.io.*;

class Anagram {

    public static void main(String[] args) {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t=0;
        try{
            t=Integer.parseInt(br.readLine());
        }
        catch(Exception e){}
        String []arr=new String[t];
        for (int i=0;i<t;i++) {
            try{
                arr[i]=br.readLine();
                }
                catch(Exception e){}
        }
        for(int i=0;i<t;i++){
            if(arr[i].length()%2==1){
                System.out.println("-1");
            }else{
            int x=(arr[i].length()/2)-1;
            int k=x+1;
            int count=0,cnt=0;
            for(int j=0;j<x+1;j++,k++){
                if(arr[i].charAt(j)==arr[i].charAt(k))
                    count++;
                else 
                    cnt++;
            }
            System.out.println(cnt);
            }
        }
        
    }
}