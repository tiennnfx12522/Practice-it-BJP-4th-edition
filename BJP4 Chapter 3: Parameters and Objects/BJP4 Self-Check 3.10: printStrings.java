/*
Write a method called printStrings that accepts a String and a number of repetitions as parameters and prints that String the given number of times. For example, the call:

printStrings("abc", 5);
will print the following output:

abcabcabcabcabc
*/

public static void printStrings (String str, int a) {
    for (int i = 1; i <= a; i++) {
        System.out.print(str);
    }
}
