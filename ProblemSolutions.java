/******************************************************************
 *
 *   Gianna Dubinski / COMP 272-001
 *
 *   This java file contains the problem solutions of isSubSet, findKthLargest,
 *   and sort2Arrays methods. You should utilize the Java Collection Framework for
 *   these methods.
 *
 ********************************************************************/

import java.util.*;

class ProblemSolutions {

    /**
     * Method: isSubset()
     *
     * Given two arrays of integers, A and B, return whether
     * array B is a subset if array A. Example:
     *      Input: [1,50,55,80,90], [55,90]
     *      Output: true
     *      Input: [1,50,55,80,90], [55,90, 99]
     *      Output: false
     *
     * The solution time complexity must NOT be worse than O(n).
     * For the solution, use a Hash Table.
     *
     * @param list1 - Input array A
     * @param list2 - input array B
     * @return      - returns boolean value B is a subset of A.
     */

    public boolean isSubset(int list1[], int list2[]) {
        
        //Set of Integers and implements set of HashSet
        Set<Integer> set = new HashSet<>();

        //For loop iterates num in list1 to be added to the set
        for (int num : list1) {
            set.add(num);
        }

        /*
        For loop iterates num in list2.
        If statement checks if the set does not contain num,
        if so return false.
         */
        for (int num : list2) {
            if (!set.contains(num)) {
                return false;
            }
        }
        return true;
    }


    /**
     * Method: findKthLargest
     *
     * Given an Array A and integer K, return the k-th maximum element in the array.
     * Example:
     *      Input: [1,7,3,10,34,5,8], 4
     *      Output: 7
     *
     * @param array - Array of integers
     * @param k     - the kth maximum element
     * @return      - the value in the array which is the kth maximum value
     */

    public int findKthLargest(int[] array, int k) {

        //Priority Queue has Integers and pq is created an empty Priority Queue.
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        /*
        For loop iterates num in array.
        Each num is added to pq.
        An if statement checks the pq size is greater than k.
        Removes from pq if not greater than k.
        Returns small num to the front of the pq
         */
        for (int num : array) {
            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }


    /**
     * Method: sort2Arrays
     *
     * Given two arrays A and B with n and m integers respectively, return
     * a single array of all the elements in A and B in sorted order. Example:
     *      Input: [4,1,5], [3,2]
     *      Output: 1 2 3 4 5
     *
     * @param array1    - Input array 1
     * @param array2    - Input array 2
     * @return          - Sorted array with all elements in A and B.
     */

    public int[] sort2Arrays(int[] array1, int[] array2) {

        //List holds Integers in a combinedList in a new ArrayList
        List<Integer> combinedList = new ArrayList<>();

        //For loop iterates num in array1. Each num is added to the combinedList.
        for (int num : array1) {
            combinedList.add(num);
        }

        //For loop iterates num in array2. Each num is added to the combinedList.
        for (int num : array2) {
            combinedList.add(num);
        }

        //Sorts the list in the combinedList in ascending order.
        Collections.sort(combinedList);

        //Initializes result array to the size of the combinedList.
        int[] result = new int[combinedList.size()];

        /*
        For loop, checks each element in combinedList using i.
        Getting the element from i in the combinedList to assign it to the same index as the result.
        Result is then returned.
         */
        for (int i = 0; i < combinedList.size(); i++) {
            result[i] = combinedList.get(i);
        }
        return result;
    }

}
