/*
Write a method minToFront that takes an ArrayList of integers as a parameter and that moves the minimum value in the list to the front, 
otherwise preserving the order of the elements. For example, if a variable called list stores the following values: {3, 8, 92, 4, 2, 17, 9} 
and you make this call: minToFront(list); it should store the following values after the call: {2, 3, 8, 92, 4, 17, 9} 
You may assume that the list stores at least one value.
*/

public static void minToFront (ArrayList <Integer> array) {
    int min = array.get(0);
    for (int i = 0; i < array.size(); i++) {
        if (array.get(i) < min) {
            min = array.get(i);
        }
    }
    array.remove(array.indexOf(min));
    array.add(0, min);
}
