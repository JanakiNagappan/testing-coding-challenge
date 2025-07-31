package org.twoi;

public class FindMaxSum
{
    /**
     * This method takes an array of strings, extracts the digits from each string,
     * calculates the sum of digits for each string, and returns the highest digit sum.
     *
     * @param strings An array of strings containing both letters and digits.
     * @return The highest sum of digits found in any string.
     */
    public static int maxDigitSum(String[] strings) {
        int maxSum = 0;
        for (String str : strings) {
            int sum = 0;
            for (char ch : str.toCharArray()) {
                if (Character.isDigit(ch)) {
                    sum += Character.getNumericValue(ch);
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        String[] arr = { "sdcdf834sd9js4jf", "oksjd4r2rj0934vn2w", "h1n36mfl", "a7e6fw" };
        System.out.println("Max digit sum: " + maxDigitSum(arr));
    }}
