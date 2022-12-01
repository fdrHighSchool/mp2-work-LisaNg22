class Main {
  public static void main(String[] args) {
    square(6);
    rectangle(4,5);
    rightTriangle(8);
  } // end of main method

// Square
  public static void square(int size){
    for(int row = 0; row < size; row++){
      for (int column = 0;column < size; column++){
        System.out.print("* ");
      } //end of column for loop (square)
      System.out.println(" ");
    }  //end of row for loop (square)
  } // end of square method

// Rectangle
  public static void rectangle(int length, int width){
   System.out.println(" ");
    for(int row = 0; row < length; row++){
      for (int column = 0;column < width; column++){
        System.out.print("* ");
      } //end of column for loop (rectangle)
      System.out.println(" ");
    }  //end of row for loop (rectangle)
  } // end of rectangle method
  
// Right triangle
  public static void rightTriangle(int size){
    System.out.println(" ");
    for(int row = 0; row < size; row++){
      for (int column = 0;column <= row; column++){ 
        System.out.print("* ");
      } //end of column for loop (square)
      System.out.println(" ");
    }  //end of row for loop (square)
  } // end of rightTriangle method
  
} // end of main class
