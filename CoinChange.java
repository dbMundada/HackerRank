import java.io.*;
class CoinChange {
	 public static void main(String[] args) {
	 	int []coins={20,10,5,2,1};
		int []counts=new int[coins.length];
		System.out.print("All possible combinations of 233 are:\n");
		try{
		PriceCombination(coins,counts,4,33);
	}
	catch(Exception e){
		System.out.print(""+e);
	}
	}
	public static void PriceCombination(int[] coins,int[] counts,int startindex,int totalAmount)throws Exception
	{
		if(startindex>=coins.length)//we have proceeded all coins
		{
			for (int i=0;i<=coins.length;i++) {
				System.out.print(""+coins[i]+"*"+counts[i]+"+");
			}
			System.out.print("ln");
			return;
		}
		if(startindex==coins.length-1){
			if (totalAmount%coins[startindex]==0) {
				counts[startindex]=totalAmount/coins[startindex];
				PriceCombination(coins,counts,startindex+1,0);
			}
		}
		else
		 {
			for (int i=0;i<=totalAmount/coins[startindex];i++ ) 
			{
				counts[startindex]=i;
	PriceCombination(coins,counts,startindex+1,totalAmount-coins[startindex]*i);
			}
		}

	}
}