class Main {
  public static void main(String[] args) {
    System.out.println(FizzBuzz(9));
    System.out.println(FizzBuzz(100));
    System.out.println(FizzBuzz(22));
    System.out.println(FizzBuzz(15));
    
  }//End of main method
  
  public static String FizzBuzz(int num){
    String result = " ";

    // Number divisible by 3
    if (num % 3 == 0){
       result = ("Fizz");
    }
   //Number divisible by 5
    if (num % 5 == 0){
      result = ("Buzz");
    }
    // Number not divisible by 3 nor 5
    if(num % 3 != 0 && num % 5 != 0){
     result = Integer.toString(num) ;
    }
    // Number divisible by 3  and 5
    if (num % 3 == 0 && num % 5 == 0){
     result = ("FizzBuzz");
    }

    return result;
  } // end of FizzBuzz method
} // end of main class
