package dev.lpa;

import java.util.Arrays;

public class Main {

//Behind the scenes, a Java array is just a specialized class, so the new keyword here creates a new array.

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        //Below is the 3rd element, but we use index 2.
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        //An array initializer makes the job of instantiating and initializing a small array much easier:

        //int[] firstFivePositives = new int[]{1,2,3,4,5};

        //In the above example, we can see we still use the new keyword, and have int, with the square brackets.
        //But here we specify the values we want the array to be initialized to, in a comma delimited list, in curly braces.

        //Because these values are specified, the length of the array can be determined, so we don't specify the size
        //in the square brackets.

        //Java actually provides an even simpler way to do this.

        //Java allows us to drop new int[] from th expression, as shown below:

        //int[] firstFivePositives = {1,2,3,4,5};
        //String[] names = {"Andy", "Bob", "Charlie", "David", "Eve"};

        //An anonymous initializer can only be used in a declaration statement (Above are anonymous initializers).

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        //Above, Java looks at this and initializes an array with 10 elements, then assigns the values specified to
        //an element when the array was created.
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        //int[] newArray;
        //newArray = {5,4,3,2,1};
        //In the above example, you can't use the anonymous version of the array initializer in a statement that is
        //outside a declaration statement. But we can do it using the longer form below:

        int[] newArray;
//        newArray = new int[]{5,4,3,2,1};
        newArray = new int[5];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length - i;
        }
        //When you don't use an array initializer statement, all array elements get initialized to the default value
        //for that type.
        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

        //The enhanced for loop:

        //This loop was designed ot walk through elements in an array, or some other type of collection.

        //It processes one element at a time, from the first element to the last.

        //Shown below is the syntax for the two types of for loop statements, side by side:

        //for (declaration : collection){}                         for(init; expression; increment){}

        //The enhanced for loop only has two components, vs 3, defined in the parentheses after the for keyword.

        //The first part of the enhanced for loop is a declaration expression, which includes the type and a variable
        //name. This is usually a local variable with the same type as an element in the array.

        //The second component is the array, or some other collection variable.

        System.out.println();
        //The first component just needs to be a declared variable. The variable is the actual element, and not the
        //array index that we're looping through.
        //The second part (newArray) is the thing we're looping over.
        for (int element : newArray){
            //Now, in the print statement we don't have to use an index to get the element from the array. The enhanced
            //for loop gets it for us, an stores it in the local variable "element".
            System.out.println(element + " ");
        }

        //Java's array type is very basic, it comes with very little built-in functionality.

        //It has a single property or field, named length.

        //And it inherits java.util.Object's functionality.

        //Java provides a helper class named java.util.Arrays, providing common functionality, you'd want for many
        //array operations.

        //These are static methods on Arrays, so are class methods, not instance methods.

        //The toString method on this helper class prints out all the array elements, comma delimited, and contained
        //in square brackets.

        //String arrayElementsInAString = Arrays.toString(newArray);

        //The output is shown below, conceptually:

        //[e[0], e[1], e[2], e[3], ...]

        //It prints the element at index 0 first, followed by a comma, then element at index 1 next, comma, and so on,
        //until all elements are printed.

        System.out.println(Arrays.toString(newArray));

        //You can also assign any array to an Object variable.

        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }

        //In the above code, we're assigning an integer array reference to an object reference.
        //We can still use the instanceof operator using an array type on the right side of the operand.

        //This operand will test if our Object variable is really an instance of an integer array.

        //An array is a special class, recognized by Java through the use of the square brackets.

        //It still inherits from the java.lang.Object class.

        //Why would you do something like this?

        //You could create an array of Objects that supports any kind of type in Java.

        Object[] objectArray = new Object [3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");

        //In the above code, we're creating an array of objects, and this array will hold 3 object references.

        //And now, we can assign any object reference, of any type, to the elements in this array.

        //First, we assign it a string literal, and then we assign it a StringBuilder instance.

        //You could assign an object, with any of your own classes, to this kind of array.

        //This is one way of having an array of many different types.

        //This is not necessarily good practice, but it can be done with arrays.

        //We'll learn more elegant ways to support different types in arrays later.

        //Because we know an array is an object, you can assign an array to be an element of this type of Object array:

        objectArray[2] = newArray;

        //Above, we've got an array of Objects, and one of the elements is an array of integers.

        //This is a nested array.

        //Importantly, an array can be treated like any other object instance in Java.
    }

    //The size of an array, once created, is fixed.
    //In the case above, integerArray will have 10 elements.
    //You can't change the size of an array, after the array is instantiated.
    //You can't add or delete elements, we can only assign values to one of the ten elements in this array.
}

//The most common way to store and manipulate multiple values of the same type is with an Array.

//An array is a data structure that allows you to store a sequence of values, all the same type.

//You can have arrays for any primitive type, like ints, doubles, booleans, or any of the 8 primitive types.

//You can also have arrays for any class.

//Elements in an array are indexed, starting at 0.

//If we have an array, storing five names, conceptually looks as follows:

//      0       1       2       3       4
//    "Andy"  "Bob" "Charlie" "David" "Eve"

//The first element is at index 0, and is Andy.

//The last element in this array is at index 4, and has the String value Eve.

//When you declare an array, you first specify the type of the elements you want in the array.

//Then you include square brackets in the declaration, which is the key for Java, to identify the variable as an array.

//The square brackets can follow the type, as shown below:

//int[] integerArry;        String[] nameList;

//This is much more common.

//The brackets can also be after the variable name, as shown in the following example:

//String courseList[];

//You don't specify a size in the array declaration itself.

//Instantiating an Array:

//One way to instantiate the array is with the keyword, "new", like how we've used it when instantiating classes.

//int[] integerArray = new int[10];

//Above we see an array declaration on the left of the equals sign, then an array creation expression on the right side.

//Consider the two examples below (Instantiating an array vs. instantiating an object):

//int[] integerArray = new int[10];      &             StringBuilder sb = new StringBuilder();

//These look similar, but there are two major differences.

//Square brackets are required when using the new keyword, and a size is specified between them. So in this example,
//there will be 10 elements in the array.

//An array instantiation doesn't have a set of parentheses, meaning we can't pass data to a constructor for an array.

//In fact, using parentheses with an array instantiation gives you a compiler error.

//What is an array, really?

//An array is a special class in Java.

//The array, like all other classes, ultimately inherits from java.lang.Object.

//Why use arrays?

//We use arrays to manage many items of the same type.

//Some common behavior for arrays would be sorting, initializing values, copying the array, and finding an element.

//For an array, this behavior isn't on the array instance itself, but it's provided on a helper class, java.util.Arrays.


