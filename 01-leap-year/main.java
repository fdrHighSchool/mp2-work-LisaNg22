class Main {
  public static void main(String[] args) {
    //Test cases:
    System.out.println(isLeapYear(2022));
    System.out.println(isLeapYear(2024));
    System.out.println(isLeapYear(1900));
    System.out.println(isLeapYear(2000));
    
  } //end main method
  
// N: isLeapYear
// P: Check if a year is a Leap year
// I: year (int)
// R: Whether or not year is a Leap year -> True or False (boolean)
  
  public static boolean isLeapYear(int year){
    boolean status = false;
   
      if ((year % 4 == 0) && (year % 100 != 0)){ //check true outcome 1
        return status = true;
      }
      if (year % 400 == 0){ //check true outcome 2
        return status = true;
      }
      else{ //Everything else would be false
        return status;
      }
  } // end isLeapYear() method
}// end of main class 
