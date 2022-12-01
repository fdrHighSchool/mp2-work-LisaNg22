class Main {
  public static void main(String[] args) {
    // Test cases:
    System.out.println(countQuarters(1278));
    System.out.println(countQuarters(50));
    System.out.println(countQuarters(5000));
    System.out.println(countQuarters(125));
    System.out.println(countQuarters(2279));
    System.out.println(countQuarters(34));
    System.out.println(countQuarters(0));
  } // end main method
  
  public static int countQuarters(int cents){
    // convert int to string
    String cent = Integer.toString(cents);
    // get remaining cents

    if (cent.length() < 2) {
      return 0;
    }
    
    String remain = cent.substring(cent.length() - 2);
    // convert back to int
    int remaining = Integer.valueOf(remain);
    // Find number of Quarters
    int numberOfQuarters = remaining/25;
    return numberOfQuarters;
  }// end countQuarters method
} // end of main class
