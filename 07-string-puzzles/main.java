class Main {
  public static void main(String[] args) {
    // Test cases:
    System.out.println(conCat("abc", "cat"));
    System.out.println(conCat("dog", "cat"));
    System.out.println(conCat("abc", "   "));

    System.out.println(countHi("abc hi ho"));
    System.out.println(countHi("ABChi hi"));
    System.out.println(countHi("hihihi"));
    System.out.println(countHi("abc hello"));

    System.out.println(firstHalf("WooHoo"));
    System.out.println(firstHalf("HelloThere"));
    System.out.println(firstHalf("abcdef"));

    System.out.println(repeatEnd("Hello",3));
    System.out.println(repeatEnd("Hello",2));
    System.out.println(repeatEnd("Hello",1));

    System.out.println(makeSarcastic("For me it was never about money, but solving problems for the future of humanity."));
    
  } // end of main method

  // conCat method
  public static String conCat(String first, String second){
    String word = " ";
    String lastLetter = first.substring(first. length()-1);
    String firstLetter = second.substring(0,1);
    if (lastLetter.equals(firstLetter)){
      word = first + second.substring(1); 
    } // ends if statement
    else{
      word = first + second;
    }// ends else statement
    return word;
  }// end of conCat method

  // countHi method
  public static int countHi(String str){
    int count = 0;
    for (int i = 0; i <= str.length()-2; i++){
      if (str.substring(i,i+2). equals("hi")){
        count ++;
      } //end of if statement
    } // ends for loop
    return count;
  }// end of countHi method

  // firstHalf method
  public static String firstHalf(String phrase){
    String word  = phrase.substring (0,phrase.length()/2);
    return word;
  }// end of firstHalf method

  //repeatEnd method
  public static String repeatEnd(String word, int repeat) {
    int length = word.length();  
    String result = "";
    for(int loop = 0; loop < repeat;loop++){
      result += word.substring(length - repeat,length);
    } // end of for loop
    return result;
  } //end of repeatEnd method

  // makeSarcastic method
  public static String makeSarcastic(String phrase){
    String newPhrase = "";
    for (int i = 0; i < phrase.length(); i++){
      String character = phrase.substring(i,i+1);
      
      if(phrase.indexOf(character) % 2 == 0 ){
        newPhrase += character.toLowerCase();
        
      }// end of if statement

      else{
        newPhrase += character.toUpperCase();
        
      }// end of else statement
      
    } // end of for loop
    return newPhrase;
  } // end of makeSarcastic method
  
} // end of main class
