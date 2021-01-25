package DemoPack;
import java.util.*;
import java.lang.*;

public class Remove_Duplicate_Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String st=sc.nextLine();
		System.out.print("Enter a number :");
		int n =sc.nextInt();
		int c=0,a,temp;  
	    temp=n;  
	    int sum=0;
	    int differ=0;
	    int index=0;
	    
	    char str_arr[]=st.toCharArray();
	    char temp_arr[]=st.toCharArray();
	    int count;
	    String newStr="";
	    for(int i=0;i<str_arr.length;i++) {
	    	count=0;
	    	for(int j=0;j<str_arr.length;j++) {
	    		if(str_arr[i]==temp_arr[j]) {
	    			count++;
	    		}
	    	}
	    	if(count==1) {
	    		newStr+=str_arr[i];
	    	}
	    }
	    
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    sum=sum+a;
	    differ=Math.abs(differ-a);
	    c=c+(a*a*a);  
	    }  
	    
	   
	    
	    if(temp==c)  {
	    	System.out.println(newStr+differ);
	   // System.out.println("armstrong number");  
	    }
	    else  
	    	System.out.println(newStr+sum);
	    //System.out.println("Not armstrong number");   
	   }  
	}  
