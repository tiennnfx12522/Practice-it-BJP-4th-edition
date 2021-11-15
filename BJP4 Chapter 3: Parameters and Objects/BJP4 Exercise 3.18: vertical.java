/*
Write a method called vertical that accepts a String as its parameter and prints each letter of the string 
on separate lines. For example, a call of vertical("hey now") should produce the following output:

h
e
y

n
o
w
*/

public static void vertical (String input) {
    for (int i = 0; i < input.length(); i++) {
        System.out.println(input.charAt(i));
    }
}
