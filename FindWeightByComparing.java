package DemoPack;
import java.util.*;
import java.lang.*;

public class FindWeightByComparing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First String :");
		String s1=sc.nextLine();
		System.out.print("Enter Second String :");
		String s2=sc.nextLine();
		int weight=0,m=0,res = 0;
		if(s1.length()==s2.length()) {
			
			for(int i=0;i<s1.length();i++) {
				m++; 
				for(int j=s2.length()-1-i;j>=s2.length()-1-i;j--) {
					if(s1.charAt(i)==s2.charAt(j)) {
						weight+=m;
						break;
					}
				}
			}
			System.out.println("Weight : "+weight);
		}else {
			System.out.println("Invalide Input");
		}
		
		
		if(weight<9) {
			res=weight;
		}else {
		while(res>9 || weight>0) {
			if(weight==0) {
				weight=res;
				res=0;
			}
			res+=weight%10;
			weight/=10;
		}
	   }
			System.out.println("Result : "+res);
	}

}
