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
