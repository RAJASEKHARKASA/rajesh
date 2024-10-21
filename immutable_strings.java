package com.Sample;

public class immutable_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initializing two String variables with the same content
        String a = "hello"; //String is literal here
        String b = "hello";
        
        //By using string literal if we declare same string for two objects it will not create new object everytime in memory
        //here b is referencing to the object of a i.e., a.object refernce
        
        // Concatenating " world" to String b and storing it in String c
        String c = b.concat(" world");
        
        // Printing the concatenated result
        System.out.println(c);
        
        // Creating two new String objects using the 'new' keyword
        String s = new String("hello"); //String class creates new object every time in memory
        String s1 = new String("hello");
        
        // Comparing the contents of String a and b using equals()
        System.out.println(a.equals(b)); // true: content is the same
        System.out.println(a == b); // true: both refer to the same object in the string pool
        
        // Comparing a with s (created using new) using equalsIgnoreCase()
        System.out.println(a.equalsIgnoreCase(s)); // true: ignores case, content is the same
        System.out.println(a == s); // false: different objects in memory as it refers to the references
        
        // Comparing two new String objects using ==
        System.out.println(s == s1); // false: different objects in memory i.e, references are different becasue they defined with string class

	}

}
