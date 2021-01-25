    Question 1: Remove Repetitive and find the weight
Take String s1, String s2. (Consider all letters in lowercase)
If all characters in S1 are present in S2, remove the repetitive characters & find the weight of the String s2 (ASCII values).
If all characters in S1 are not present in S2, find the weight of the String s2 (ASCII values) without removing the duplicates.
 Example 1: 
(s1: mam, s2: madam)
	All characters in s1 are present in s2. hence remove the repetitive characters (mam) from s2(madam) --> da would be remained. Now, find the weight of da.
Example 2: 
(s1: sir, s2: america)
	All characters in s1 aren't present in s1. hence weight will be calculated without removing duplicates --> weight of america needs to be calculated.	
	
	Question 2: Removing vowels basis length of String
Input: String s1.
If the length of s1 is even, check for vowels (a, e, i, o, u) @ even indices.
        If found, remove the vowels @ even indices & return the String
        If not found, return the String.
If the length of s1 is odd, check for vowels @ odd indices.
        If found, remove the vowels @odd indices & return the String
        If not found, return the String.
Example 1: 
Input : "Sahithi"
Output: “Shthi”
    Length = 7 which is odd
    Check for vowels @ odd indices.
    a, i are vowels @odd indices.
    remove a, i & return the String --> Shthi

Example 2:  
Input: "Priyas"
Output: “Prys”
    Length = 6 which is even
    Check for vowels @ even indices.
    i, a are at even indices.
    remove i, a & return the String --> Prys
Example 3: 
Input: "pjp"
Output: “pjp”
    Length = 3 which is odd
    Check for vowels @ odd indices.
    No vowels at odd indices.
    return the String as it is--> pjp
    
    
    
    
    	Question 3: Return a new String basis Armstrong Number
Input: input1: int, input2: String.
    Check if the given number is an armstrong number.
    Armstrong number: A number is called Armstrong number if it is equal to the sum of cubes of its digits. Consider 0, 1, 153, 370, 371, etc., as Armstrong numbers.
For Ex: 153 is called as Armstrong number because the cubes of digits 1, 5, 3 ((1*1*1) + (5*5*5) + (3*3*3)) gives us 153
    If it is an Armstrong number, 
        Remove the duplicates (characters occurring more than once) from input2,
        Find difference of the digits in the given number.
        Return the concatenated (String after removing duplicates + difference in digits) String.
    If it is not an Armstrong number,
        Remove the duplicates (characters occurring more than once) from input2,
        Find sum of the digits in the given number.
        Return the concatenated (String after removing duplicates + sum of digits) String.
		
		
		
		Example 1:
    input1: 153 input2: jaya
    Output: “jy1”
    153 is armstrong number
    remove duplicates occurring more than once (a will be removed)
    diff in digits: 5-3-1 = 1
    result: jy1
Example 2:
    input1: 111 input2: bhanuchandra
    Output: “bucdr3”
    111 is not an armstrong number
    remove duplicates occuring more than once (a, h, n will be removed)
    sum of digits: 1+1+1 = 3
    result: bucdr3


