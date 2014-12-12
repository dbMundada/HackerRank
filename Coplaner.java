import java.io.*;
class Coplaner{
	public static void main(String []args){
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int t=0;
		try{
			t=Integer.parseInt(br.readLine());
		}catch(Exception e){}
		for(int j=0;j<t;j++){
			String q="",p="",r="",s="";
			try{
				p=br.readLine();q=br.readLine();r=br.readLine();s=br.readLine();
			}catch(Exception e){}
			String []arr1=p.split(" ");
			String []arr2=q.split(" ");
			String []arr3=r.split(" ");
			String []arr4=s.split(" ");
			int []np=new int[3];
			int []nq=new int[3];
			int []nr=new int[3];
			int []ns=new int[3];
			for(int i=0;i<3;i++){
				try{
					np[i]=Integer.parseInt(arr1[i]);
					nq[i]=Integer.parseInt(arr2[i]);
					nr[i]=Integer.parseInt(arr3[i]);
					ns[i]=Integer.parseInt(arr4[i]);
				}catch(Exception e){}
			}
			int []a=new int[3];
			int []b=new int[3];
			int []c=new int[3];
			for(int i=0;i<3;i++){
				a[i]=nq[i]-np[i];
				b[i]=nr[i]-np[i];
				c[i]=ns[i]-np[i];
			}
			int ans=(a[0]*((b[1]*c[2])-(b[2]*c[1])))-(a[1]*((b[0]*c[2])-(b[2]*c[0])))+(a[2]*((b[0]*c[1])-(b[1]*c[0])));
			if(ans==0)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}
}