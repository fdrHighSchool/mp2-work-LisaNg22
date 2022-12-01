class Main {
  public static void main(String[] args) {
    // Test cases:
    System.out.println(divBy3(12312));
    System.out.println(divBy3(10));
    System.out.println(divBy3(13579));
    System.out.println(divBy3(12121212));
  }// end main method

  public static boolean divBy3(int num){
    int sum = 0;
    
    // use a while loop to repeat it until the condition is false
    while (num != 0){
      int digit = num % 10; // get digit in a certain place value
      sum += digit; // add digit to sum
      num = num / 10; // get rid of digit added to sum from number
    } // end of while loop
    
   return sum % 3 == 0;
  } // end of divBy3 method
} // end of main class
