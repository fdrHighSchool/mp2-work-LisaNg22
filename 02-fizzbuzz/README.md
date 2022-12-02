# FizzBuzz
#### Respond to the following:

1. Fill out the following truth table:

| P  | Q  | P && Q | P \|\| Q |
|:--:|:--:|:------:|:--------:|
| T  | T  |   T    |     T    |
| T  | F  |   F    |     T    |
| F  | T  |   F    |     T    |
| F  | F  |   F    |     F    |


2. Prove a version of DeMorgan's Law:

| P  | Q  | P \|\| Q | ! (P \|\| Q) | !P | !Q | !P && !Q |
|:--:|:--:|:--------:|:------------:|:--:|:--:|:--------:|
| T  | T  |     T    |       F      |  F | F  |    F     |
| T  | F  |     T    |       F      |  F | T  |    F     |
| F  | T  |     T    |       F      |  T | F  |    F     |
| F  | F  |     F    |       T      |  T | T  |    T     |

3. What does DeMorgan's state and how did you prove it for the case above?
  * DeMorgan's law states that a mathematical equation is somehow related to it's opposite. This was proved in the chart above by !(P||Q) having the same outcome as !P && !Q which is False, False, False, True. 
