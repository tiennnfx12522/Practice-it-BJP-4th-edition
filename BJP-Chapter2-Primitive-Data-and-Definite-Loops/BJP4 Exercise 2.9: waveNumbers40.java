/*
Write for loops to produce the following output, with each line 40 characters wide:

----------------------------------------
_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
1122334455667788990011223344556677889900
----------------------------------------
*/

for (int i = 1; i <= 40; i++) {
    System.out.print("-");
}

System.out.println();

for (int j = 1; j <= 10; j++) {
    System.out.print("_-^-");
}

System.out.println();

for (int k = 1; k <=2; k++) {
    System.out.print("11223344556677889900");
}

System.out.println();

for (int i = 1; i <= 40; i++) {
    System.out.print("-");
}
