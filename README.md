# Find Max Sum - Coding Challenge Test

## Task

Given an array of strings, each made up of a combination of letters and digits, write the functionality to find and return the largest sum of digits within a string.

Considering a variety of different input arrays, state any assumptions or design choices you had to make.

### Notes:

Each digit should be considered its own 1-digit number i.e. in the third string below 36 is evaluated as 3 and 6 separately.
The input arrays can vary in length; however, they will not be larger than 10 strings.
Strings can vary in length; however, they will not be larger than 12 characters.

## Example

**Input:**

["dh7js4jf", "or2rjvn2w", "h1n36mfl", "a7e6fw"]

**Output:**  
13

## Assumptions

- Only digits (0–9) are used for sum calculation.
- Each string is at most 12 characters long.
- Input array contains at most 10 strings.
- Strings with no digits return a sum of 0.

## How to Run

1. Java and Maven installed.
2. Clone the project and navigate to the directory.
3. Run solution options:
   ```bash
   mvn compile
   mvn exec:java -Dexec.mainClass="org.twoi.FindMaxSum"
   mvn test - to run the tests
   mvn verify - to generate test reports
   
   
