import java.io.*;
class Permute{
	public void permuteit(String str){
		int length=str.length();
		boolean []used=new boolean[length];
		StringBuffer output=new StringBuffer(length);
		permutation(str,length,output,used,0);
	}
	public void permutation(String str,int length,StringBuffer output,boolean []used,int position){
		if(position==length){
			System.out.println(output.toString());
			return;
		}
		else{
			for (int i=0;i<length;i++) {
				if (used[i]) continue;
				output.append(str.charAt(i));
				used[i]=true;
				permutation(str,length,output,used,position+1);
				output.deleteCharAt(output.length()-1);
				used[i]=false;
			}
		}
	}
	public static void main(String []arg){
		Permute  x=new Permute();
		String s="";
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		try{
			s=br.readLine();
		}
		catch(IOException e){}
		x.permuteit(s);


	}

}