# Shapes
#### Respond to the following:

1. Write a plan for the following output:
```
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
```
  * for(int row = 0; row < 3; row++){
        for(int num = 0; num < 10; num++){
            for(int time = 0; time < 3; time++){
                System.out.print(num);
            } // end of last for loop
        } //end of inner for loop
        System.out.println("");
   } // end of outer for loop
        

2. Write a plan for the following output:
```
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
```
  * for(int row = 0; row < 5; row++){
        for(int num = 9; num > 0; num--){
            for(int time = 0; time < 5; time++){
                System.out.print(num);
            } // end of last for loop
        } //end of inner for loop
        System.out.println("");
   } // end of outer for loop
