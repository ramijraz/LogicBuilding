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
	    	
	    	for(int j=0;j<len_s2;j++) {
	    		for(int i=0;i<len_s1;i++) {
	    			if(s1.charAt(i)==s2.charAt(j)) {
	    				s2=s2.replace(s2.charAt(j), '1');
	    			}
	    		}
	    	}
	    	String s3=s2.replaceAll("1", "");
	    	//System.out.println(s3);
	    	
	    	for(int i=0;i<s3.length();i++) {
	    		char letter=s3.charAt(i);
	    		if(letter>=65 && letter<=90) {
	    			weight+=letter-64; 
	    		}
	    		else if(letter<=122 && letter>=97) {
	    			weight+=letter-96;
	    		}
	    	}
	    }
	    
	    
	    else {
	    	for(int i=0;i<len_s2;i++) {
	    		char letter=s2.charAt(i);
	    		if(letter>=65 && letter<=90) {
	    			weight+=letter-64;
	    		}
	    		else if(letter<=122 && letter>=97) {
	    			weight+=letter-96;
	    		}
	    	}
	    }
	    System.out.println("After Removing the Repetitive String the weight is = "+weight);
	}

}
