package com.hackerrank.carlos.day7

/**
 * Objective
 * Today, we're learning about the Array data structure. Check out the Tutorial tab for learning materials and an
 * instructional video!
 *
 * Task
 * Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
 *
 * Input Format
 * The first line contains an integer, N (the size of our array).
 * The second line contains N space-separated integers describing array A's elements.
 *
 * Constraints
 *  1 <= N <= 1000
 *  1 <= A <= 10000, where Ai is the ith integer in the array.
 *
 * Output Format
 * Print the elements of array A in reverse order as a single line of space-separated numbers.
 *
 * Sample Input
 * 4
 * 1 4 3 2
 *
 * Sample Output
 * 2 3 4 1
 */
fun main(args: Array<String>) {
    val n = "${readLine()}".toInt()
    val arr = mutableListOf<Int>()

    (0..n -1).forEach{
        arr.add("${readLine()}".toInt())
    }

    arr.reversed().forEach{text ->
        print("$text ")
    }
}