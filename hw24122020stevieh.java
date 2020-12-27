/* HW from 24.12.2020
-- 1. create an array of double numbers with these numbers: 0.9, -6.5555, 3.24, 10.11, 20.35
-- 1.1. print the first element
-- 1.2. print the last element
-- 1.3. print the middle element
-- 1.4. write a for loop which prints all the element in the array
-- 1.5. write a for loop which prints all the element in the array in reverse
-- 1.6. use scanner to read a double number from the user. print all the elements in the array which are bigger than the user-number
-- 2. create an array A of integer numbers with these numbers: 4, 10, 20, 40, 1000
-- 2.1. create a second array B with these numbers: 0, 0, 0, 0, 0
-- 2.2. copy all elements from A to B
-- ***crazy etgar: 
-- create an array of numbers: 1, 3, 5, 8, 8, 5, 3, 1
-- check if the array is a polindrom (which in this case it is)
-- polindrom = all elements are repeated in a reverse order:
-- here it is polidrom since --> 1 3 5 8 are reverse equal to 8 5 3 1
-- another polindrom: 3 4 6 9 9 6 4 3
-- not polindrom: 1 3 5 6 5 3 1 --> since 6 is not repeated                                         [it is actually a palindrome :)]

*/

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner prn = new Scanner(System.in);
        Random r = new Random();

        //ex1
        double [] numbers1 = {0.9, -6.5555, 3.24, 10.11, 20.35};
        int length_n1 = numbers1.length;
        System.out.println("The first number is: " + numbers1[0]);
        System.out.println("The middle number is: " + numbers1[length_n1/2]);
        System.out.println("The last number is: " + numbers1[length_n1-1]);
        System.out.print("All the numbers are: ");
        for (int index = 0; index < length_n1; index++)
        {
            System.out.print(numbers1[index] + "  ");
        }
        System.out.println();
        System.out.print("All the numbers in reverse are: ");
        for (int index = length_n1; index > 0; index--)
        {
            System.out.print(numbers1[index - 1] + "  ");
        }
        System.out.println();
        System.out.println("Please enter a number: ");
        double user_num1 = prn.nextDouble();
        System.out.println("The numbers from the list larger than the number you entered are: ");
        for (int index = 0; index < length_n1; index++)
        {
            if (numbers1[index] > user_num1)
            {
                System.out.print(numbers1[index] + "  ");
            }
        }
        System.out.println();

        //ex2
        int[] A = {4, 10, 20, 40, 1000};
        int[] B = {0, 0, 0, 0, 0};
        for (int i = 0; i < A.length; i++)
        {
            B[i] = A[i];
        }

        //etgar palindrome
        int[] numbers3 = {r.nextInt(10), r.nextInt(10), r.nextInt(10), r.nextInt(10),
                r.nextInt(10), r.nextInt(10), r.nextInt(10), r.nextInt(10)};
        // originally:
        // int[] numbers3 = {1, 3, 5, 8, 8, 5, 3, 1};
        int length_n3 = numbers3.length;
        int index;
        System.out.println("The numbers are: ");
        for (index = 0; index < length_n3; index++)
        {
            System.out.print(numbers3[index] + "  ");
        }
        System.out.println();
        for (index = 0; index < length_n3/2; index++)
        {
            if (numbers3[index] != numbers3[length_n3 - index - 1])
            {
                break;
            }
        }

        if (index == length_n3/2)
        {
            System.out.println("Palindrome!");
        }
        else
        {
            System.out.println("Not a palindrome!");
        }

 
    }
}
