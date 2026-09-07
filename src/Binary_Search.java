/*
Description: This program accepts the number of elements, array elements, and target value from the user. It sorts the array and performs a recursive binary search while displaying the search trace.
Programmed by: Emmanuel H. Cutamora, BSIT, 48079, DSA
Last Modified: September 7, 2026
Version: 1.0
[Acknowledgements: Class-provided Binary Search program and generative AI assistance for code modification and explanation.]
*/

import java.util.Scanner;
import java.util.Arrays;

public class Binary_Search {

    public static int bSearch(int[] arr, int target, int low, int high) {

        // Base case: target is not found
        if (low > high) {
            return -1;
        }

        // Find the middle index
        int mid = low + (high - low) / 2;

        // Display the values used in each recursive call.
        // This shows how the search range becomes smaller.
        System.out.println("bSearch(" + low + ", " + high + ", " + target + ")");
        System.out.println("low = " + low + ", high = " + high + ", mid = " + mid);
        System.out.println();

        // If target is found at the middle
        if (arr[mid] == target) {
            return mid;
        }

        // If target is smaller, search the left half
        if (target < arr[mid]) {
            return bSearch(arr, target, low, mid - 1);
        }

        // Otherwise, search the right half
        return bSearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {

        // Create a Scanner to accept user input.
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements.
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Create the array using the size entered by the user.
        int[] numbers = new int[size];

        // Ask the user to enter each element.
        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Binary search requires the array to be sorted.
        // The entered elements are sorted in ascending order.
        Arrays.sort(numbers);

        // Ask the user for the target value.
        System.out.print("Enter the target to search: ");
        int target = scanner.nextInt();

        System.out.println();

        // Display the sorted array before performing the search.
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println();

        int result = bSearch(
            numbers,
            target,
            0,
            numbers.length - 1
        );

        // The result is either the index of the target or -1 if not found.
        if (result == -1) {
            System.out.println("Element not found.");
            System.out.println("-1");
        } else {
            System.out.println("Element found at index: " + result);
        }

        // Closes the Scanner after receiving all input.
        scanner.close();
    }
}