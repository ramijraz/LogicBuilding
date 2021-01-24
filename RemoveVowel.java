package DemoPack;
import java.util.*;

public class Remove_vowel {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s1=sc.nextLine();
		char s1_arr[]=s1.toCharArray();
		
		int len_s1=s1.length();
		
		
		if(len_s1%2==0) {
			for (int i=0;i<len_s1;i=i+2) {	
				if(s1_arr[i]=='a'||s1_arr[i]=='A'||s1_arr[i]=='e'||s1_arr[i]=='E'||s1_arr[i]=='i'||s1_arr[i]=='I'||s1_arr[i]=='o'||s1_arr[i]=='O'||s1_arr[i]=='u'||s1_arr[i]=='U') {
				 s1_arr[i]='1';
					//System.out.println(s1_arr[i]);
				
				}
			}
		}
		
		
		else {
			for (int i=1;i<len_s1;i=i+2) {
				if(s1_arr[i]=='a'||s1_arr[i]=='A'||s1_arr[i]=='e'||s1_arr[i]=='E'||s1_arr[i]=='i'||s1_arr[i]=='I'||s1_arr[i]=='o'||s1_arr[i]=='O'||s1_arr[i]=='u'||s1_arr[i]=='U') {
					s1_arr[i]='1';
					//System.out.println(s1_arr[i]);
				}
			}
		}
		String new_str ="";
		for (int i=0;i<len_s1;i++) {
		new_str=new_str+s1_arr[i];
		
		}
		//String withoutspace="";
		//for(int i=0;i<new_str.length();i++) {
		//if(new_str.charAt(i)!='p') {
		//withoutspace +=new_str.charAt(i);
			//}
		//}
		new_str=new_str.replaceAll("1","");
		//String new_str1=new_str.replaceAll("\\s",",");
		System.out.println("New String is: "+new_str);
		//System.out.print(withoutspace);
		
	}
}
