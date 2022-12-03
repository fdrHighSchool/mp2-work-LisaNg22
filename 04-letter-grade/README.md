# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

  * I will first create a variable that is called num and is an int. This variable will hold the value of the grade we are checking. To only focus on the last digit of the grade we could do num % 10. This will help us isolate the ones digit. After we could use three if statements to determine whether we should add a +, a -, or just leave it as a letter grade.

2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * I would make sure 100 is not misrepresented as a A- by including a if statement that say if num == 100 is true then the program will return A+ as the outcome. This if statement should be placed before the other if statements (the ones that determine what letter grade plus +, -, or nothing) to prevent any bugs in the code. 


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * To solve this exception, I would use another if statement that would be placed before the if statement that checks whether to add +, -, or nothing for letter F. The purpose of this if statement is to first check the first digit of the number (tens digit), to check if it will be a + grade even if it ends in 0, 1, or 2. It would also check if it is a - grade even if it ends in 7,8,or 9. While a else statement would just return F.
