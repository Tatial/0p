public class task2 {

    // Handle single-digit cases directly
    public int palindroma(int n) {
        if (n < 10) {
            return n;         }


        // Convert the integer n to a string for easier manipulation of its digits
        String nStr = String.valueOf(n);

        // odd number of digits
        if (nStr.length() % 2 == 1) {
            // Extract the first half of the number (excluding the middle digit)
            String firstHalf = nStr.substring(0, nStr.length() / 2);
            // Include the middle digit in the first half
            String firstHalfWithMiddle = nStr.substring(0, (nStr.length() / 2) + 1);

            // Initialize a StringBuilder to reverse the first half
            StringBuilder reversedFirstHalf = new StringBuilder();
            for (int i = firstHalf.length() - 1; i >= 0; i--) {
                reversedFirstHalf.append(firstHalf.charAt(i));
            }

            // Extract the middle digit to handle increment/decrement scenarios
            int middleDigit = Integer.parseInt(String.valueOf(firstHalfWithMiddle.charAt(firstHalfWithMiddle.length() - 1)));

            // Construct palindromic options by adjusting the middle digit
            int basePalindrome = Integer.parseInt(firstHalfWithMiddle + reversedFirstHalf);
            int incrementedPalindrome = Integer.parseInt(firstHalf + (middleDigit + 1) + reversedFirstHalf);
            int decrementedPalindrome = Integer.parseInt(firstHalf + (middleDigit - 1) + reversedFirstHalf);

            // Calculate the absolute differences from the original number n for each palindrome option
            int diffBase = Math.abs(n - basePalindrome);
            int diffIncremented = Math.abs(n - incrementedPalindrome);
            int diffDecremented = Math.abs(n - decrementedPalindrome);

            // Find the minimum difference between the original number and the palindromic options
            int minDiff1 = Math.min(diffBase, diffIncremented);
            int minDiff2 = Math.min(minDiff1, diffDecremented);

            if (minDiff2 == diffBase) {
                return basePalindrome;
            }
            if (minDiff2 == diffIncremented) {
                return incrementedPalindrome;
            }
            return decrementedPalindrome;
        }

        else {
            // Step 3: Handle numbers with an even number of digits

            // Extract the first half of the number
            String firstHalf = nStr.substring(0, nStr.length() / 2);
            // Convert the first half string to an integer for arithmetic operations
            int firstHalfNum = Integer.parseInt(firstHalf);

            // Create palindromic options by modifying the first half
            StringBuilder optionOneHalf = new StringBuilder(String.valueOf(firstHalfNum + 1));
            StringBuilder optionTwoHalf = new StringBuilder(String.valueOf(firstHalfNum - 1));
            StringBuilder optionThreeHalf = new StringBuilder(String.valueOf(firstHalfNum));

            // Construct the full palindromes using the modified halves
            int optionOne = Integer.parseInt(optionOneHalf + optionOneHalf.reverse().toString()); // Form palindrome from incremented half
            int optionTwo = Integer.parseInt(optionTwoHalf + optionTwoHalf.reverse().toString()); // Form palindrome from decremented half
            int optionThree = Integer.parseInt(optionThreeHalf + optionThreeHalf.reverse().toString()); // Form palindrome from unchanged half

            // Calculate absolute differences from the original number n for each palindrome option
            int optionOneDiff = Math.abs(optionOne - n);
            int optionTwoDiff = Math.abs(optionTwo - n);
            int optionThreeDiff = Math.abs(optionThree - n);

            // Find the minimum difference among the three palindrome options
            int minDiff1 = Math.min(optionOneDiff, optionTwoDiff);
            int minDiff2 = Math.min(minDiff1, optionThreeDiff);

            if (minDiff2 == optionOneDiff) {
                return optionOne;
            }
            if (minDiff2 == optionTwoDiff) {
                return optionTwo;
            }
            return optionThree;
        }
    }

}
