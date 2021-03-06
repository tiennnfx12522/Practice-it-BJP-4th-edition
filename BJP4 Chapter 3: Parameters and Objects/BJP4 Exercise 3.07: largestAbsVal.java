/*
Write a method largestAbsVal that accepts three integers as parameters 
and returns the largest of their three absolute values. 
For example, a call of largestAbsVal(7, -2, -11) would return 11, 
and a call of largestAbsVal(-4, 5, 2) would return 5.
*/

public static int largestAbsVal (int a, int b, int c) {
    a = Math.abs(a);
    b = Math.abs(b);
    c = Math.abs(c);
    if (a > b & a > c) {
        return a;
    } else if (b > c) {
        return b;
    } else {
        return c;
    }
}
