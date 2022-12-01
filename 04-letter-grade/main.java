class Main {
  public static void main(String[] args) {
    System.out.println(letterGrade(100));
    System.out.println(letterGrade(85));
    System.out.println(letterGrade(75));
    System.out.println(letterGrade(65));
    System.out.println(letterGrade(55));
    System.out.println(letterGrade(0));
    
  }// end of main method
  
  public static String letterGrade(int grade){
    String letter = " ";
    
    if (grade >= 90){
      letter = "A";
    } // end if statement for A
      
    else if (grade >= 80 && grade < 90){
      letter  = "B";
    }// end else if statement for B
      
    else if (grade >= 70 && grade < 80){
      letter  = "C";
    }// end else if statement for C
      
    else if (grade >= 60 && grade < 70){
      letter  = "D";
    }// end else if statement for D
      
    else {
      letter  = "F";
    } // end else statement for F
    
   return letter;
  }// end letterGrade method
}
