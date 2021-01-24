package DemoPack;
import java.util.*;
import java.lang.*;

public class FindWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First String : ");
		String s1=sc.nextLine();
	
		System.out.print("Enter Second String : ");
		String s2=sc.nextLine();
		char s1_arr[]=s1.toCharArray();
		char s2_arr[]=s2.toCharArray();
		int len_s1=s1.length();
		int len_s2=s2.length();
	    int count_match=0;
	    int weight=0;
	    
	    for(int i=0;i<len_s1;i++) {
	    	for(int j=0;j<len_s2;j++) {
		    	if(s1_arr[i]==s2_arr[j]) {
		    		count_match++;
		    		break;
		    	}
		    }
	    }
	    
	    if(count_match==len_s1) {
	    	weight=len_s2-len_s1;
	    }else {
	    	weight=len_s2;
	    }
	    System.out.println("After Removing Repetitive String the weight is= "+weight);
	}

}
