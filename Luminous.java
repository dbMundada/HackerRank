/*Luminous Jewels - The Polishing Game

Byteland county is very famous for luminous jewels. Luminous jewels are used in making beautiful necklaces. A necklace consists of various luminous jewels of particular colour. Necklaces require polishing the jewels. Operationally, all jewels of the same colour can be polished in one sitting.

Damjibhai and Shamjibhai are two jeweler friends. They decide to play a simple game. The game comprises of removing the jewels for polishing, turn by turn. Once a jewel is removed from the necklace, all other jewels of the same colour are assumed to be removed for polishing from the necklace. The player who polished the most jewels, wins. Damjibhai being more senior, always gets a chance to play first (remove jewel from necklace first). If both players play optimally, find out if Damjibhai can win. The following are the rules of their game

 Jewels can only be removed for polishing from either end of the necklace (i.e. head or tail)
 Once a jewel type is removed from the necklace, all other instances of the same jewel type is treated as polished by the person who removed the jewel
 For purpose of this problem, we have represented the necklace as a string and each character of the string is a Luminous Jewel

Input Format:
First line starts with T, number of test cases. Each test case T contains a necklace (N).

Output Format:
Print "Yes" if Damjibhai can win, else print "No".


    /**
     * The current status of the relationship between the account and the administrator account.
     */
    relationshipStatus?: RelationshipStatus;
    /**
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the member account in Amazon Macie.
     */

Constraints:
1<=T<=100
1<=|N|<=500, N will only contain lower case alphabets ('a'-'z').

Sample Input and Output
SNo.	Input	Output
1		aba		Yes
2		abbcgdffe No
*/
import java.io.*;
public class Luminous{
	public static String mode(String arr,int t){
		int []count=new int[255];
		int d=0,s=0;
		String superfre="";
		for (int i=0;i<t;i++) {
			count[arr.charAt(i)]++;
			if(count[arr.charAt(i)]==1)
				superfre+=arr.charAt(i);
		}
		for (int i=0;i<superfre.length() ;i++ ) {
			if (i%2==0) {
				d=d+count[superfre.charAt(i)];
			}
			else{
				s=s+count[superfre.charAt(i)];
			}
		}
		if(d>=s)return "YES"; else return "No";
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String arr=br.readLine();
		int t=arr.length();
		arr.toLowerCase();
		System.out.println(mode(arr,t));
	}
}



