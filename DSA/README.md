Laboratory Activity: Recursion

Programming Language: Java

Brief Description:  

    This laboratory activity demonstrates recursion using the Binary Search algorithm. 
    The program accepts the number of elements, the elements of an array, and a target value from the user. 
    The array is sorted in ascending order before performing the recursive binary search.

    The program displays the index of the target when it is found. If the target is not found, the program returns and displays -1.

    The program also includes a search trace that displays the values of low, high, and mid during each recursive call.

How to Compile and Run:

    1. Open a terminal in the folder containing Binary_Search.java.
    2. Compile the program using:
    javac Binary_Search.java
    3. Run the program using:
    java Binary_Search
    4. Enter the number of elements, array elements, and target value when prompted.

Test 1: 

    Sample Input

        Enter the number of elements: 7
        Enter 7 elements:
        Element 1: 70
        Element 2: 20
        Element 3: 50     
        Element 4: 10
        Element 5: 40
        Element 6: 60
        Element 7: 30
        Enter the target to search: 50

    Sample Output

        Sorted array: [10, 20, 30, 40, 50, 60, 70]

        bSearch(0, 6, 50)
        low = 0, high = 6, mid = 3

        bSearch(4, 6, 50)
        low = 4, high = 6, mid = 5

        bSearch(4, 4, 50)
        low = 4, high = 4, mid = 4

        Element found at index: 4

Test 2: 

    Sample Input

        Enter the number of elements: 7
        Enter 7 elements:
        Element 1: 70
        Element 2: 20
        Element 3: 50     
        Element 4: 10
        Element 5: 40
        Element 6: 60
        Element 7: 30
        Enter the target to search: 90

    Sample Output

        Sorted array: [10, 20, 30, 40, 50, 60, 70]

        bSearch(0, 6, 90)
        low = 0, high = 6, mid = 3

        bSearch(4, 6, 90)
        low = 4, high = 6, mid = 5

        bSearch(6, 6, 90)
        low = 6, high = 6, mid = 6

        Element not found.
        -1
    
AI Disclosure

    Generative AI was used as a learning tool to help clarify concepts about recursion and binary search and to improve the explanations. It helped in understanding how the recursive calls work and how the program returns the search result. The code was reviewed, tested, and understood before being included in the submission.