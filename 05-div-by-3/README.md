# Div By 3
#### Respond to the following:

1. A number is considered *prime* if its only factors are 1 and itself. For example, 7 is prime (1 and 7 are the only factors) and 9 is not (1, 3 and 9 are factors).  
Outline an algorithm to determine whether or not a number is prime.  
Think of the following method header:
`public static boolean isPrime(int num)`

  * 1) Take value of number and store it in variable call num that is an int.
    2) Use if statements to represent certain outcomes of the code:
      `If int num is less than or equal to 1 then the number is not prime. (False)`
    3) Use a for loop to check if int num have a factor that is greater than or equal to 2. Loop continues until the number of times the loop occurs is less than the number stored in int num.
    4) Inside the for loop, there is an if statement that checks if the number is divisible by the the number of the loop which also acts as the factor that we are trying to see if it contain a multiple of int num.
    5) Use mod to check if there is a remainder by doing something like (num % numOfLoop == 0) as the condition for the if statement.
        `If there is no remainder, the number is not prime. (False)`
    6) Otherwise just return True because if both of the highlighted outcome did not prove true, then the number is prime. (True)
