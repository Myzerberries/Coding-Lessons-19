package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class UsingArrays {

    public static void main(String[] args) {
        //We call the method we made to get a random array then print it out:

        //Here, we create a variable of type int array, and assign it the result of our getRandomArray method.
        int [] firstArray = getRandomArray(10);
        //Here, we call Arrays.toString, because it's a static method on Arrays, and we pass our array into it.
        System.out.println(Arrays.toString(firstArray));
        //Here, we sort our result by using the Arrays.sort method (It's a void method so needs to be printed).
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        //This first statement creates a zero filled array, because zero is Java's default for elements in an integer array.
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        //On this line, where we call the fill method, it sets every element to five.
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int [] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        //Here, we call Arrays.copyOf, which takes the array , and a size as the second argument. Since we want an exact
        //copy, we just pass the current size of the array we want copied (thirdArray.length).
        int [] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        //An array copy creates a new array, a new instance of an array, and copies the array elements over to the new
        //array. For primitives, the values get copied. For objects, the object references get copied. Performing
        //operations on the copied array, like sort and fill, don't impact the original array.
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        //Running the code below gives us only the first 5 elements in the copied array.
        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));


        int [] largeArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largeArray));

        //In this code, we initialize our array with 5 names.
        //We sort the array, since binarySearch only works on sorted arrays.
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Mark") >= 0){
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5, 0};

        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }


    }

    private static int[] getRandomArray(int len){

        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }

    //Above, since we're assigning values to the array elements, we use a traditional for loop.

    //Each element gets assigned the result of the random.nextInt method, which returns a random integer value.

}

//Finding a match:

//There are different algorithms for searching and matching elements in lists.

//Searching sequentially:

//You could imagine if you were going to start writing code to do this, you might start looping from start to finish,
//and check each element, to see if it equals what you're looking for.

//If you find a match, you'd stop looping, and return that a match was found. Either with the position you found the
//element at, or just a boolean value, true if found, and false if not.

//This is called a linear search, or sequential, because you're stepping through the elements, one after another.

//If your elements are sorted though, using this type of linear search is unnecessarily inefficient.

//Interval searching:

//If you were looking for a word in a dictionary, you would split each section up, testing the values at the boundaries
//, and based on that, split again into smaller sections, narrowing the number of elements to test each time.

//This type of searching in software is called interval searching.

//Within these two categories, sequential and interval, there are numerous existing algorithms in each.

//One of the most common interval searches is the binary search, which is why Java provides this search on so many
//of its collection classes.

//In this search, intervals are continually split into two, hence the word binary.

//The static method, binarySearch, is on the Arrays class.

//We can use this method to test if a value is already in our array, but there are some important things to remember.

//First, the array has to be sorted.

//Second, if there are duplicate values in the array, there's no guarantee which one it'll match on.

//Finally, elements must be comparable. Trying to compare instances of different types may lead to errors and invalid results.

//This method returns:

//The position of a match, if found.

//Returns a -1 when no match is found.

//It's important to remember that a positive number may not be the position of the first match.

//If your array has duplicate values, and you need to find the first element, other methods should be used.
