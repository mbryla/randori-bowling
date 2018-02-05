# randori-bowling
This project is a template for a Coding Randori exercise. It already comes with a set of test and mocking libraries along with a short usage example, but feel free to choose any toolkit you prefer.

## rules
1. Find a group of few (3-6) people and set-up your coding Dōjō (one keyboard which can be easy moved, one computer, one big screen). 
2. Clone this repository and read the exercise rules out loud.
3. Choose the first person and start coding the exercise. You should write the code in a tests-first approach and switch keyboard to the next person exactly every 5 minutes (even when the work is in progress).
4. Follow tests-firs rules - add logic only when all tests are green and the code is refactored. Start with a failing test.
5. Share your experience! The whole point of this exercise is to share your knowledge, good habits and experience among others.

## exercise
Write a small library to calculate the score of a bowling game.

### requirements - what should the library do (in a suggested coding order)
1. create a structure for keeping game data (pins knocked down in each round)
2. score the first round (no bonuses)
3. score the last round (no bonuses)
4. score the whole game (no bonuses)
5. score the n-th game (with bonuses)
6. score the last round (with bonuses)
7. score the whole game (with bonuses)
8. create a random game (sequence of throws) and score it
9. create a random game with a parameter determining player skills (the probability of better throws ranging from 0 (always misses) to 1 (always strikes)) and score it 

### bowling rules
1. one game consists of 10 rounds
2. in one round you can knock down max. 10 pins
3. one round consists of 2 throws (1 throw if all 10 pins have been knocked down in the first throw)
4. last round (10th) consists of three throws if during the first one all 10 pins have been knocked down
5. the score is calculated as follows:
    - knocking down all 10 pins in the first throw is called `strike` and is scored as follows: 10 points + sum of pins knocked down in two following throws (max. 30 - strike followed by two strikes)
    - knocking down all 10 pins in two throws is called `spare` and is scored as follows: 10 points + sum of pins knocked down in the next throw (max. 20 - spare followed by a strike)
    - knocking down less then 10 pins in two throws is scored as follows: sum of knocked down pins
    - if a strike has been thrown in the first throw of the last round an additional throw is awarded (to be able to receive the bonus of two additional throws for the strike). Second and third throws receive no bonus points (so the maximum for the last round is also 30 points - three strikes)
    - the perfect score for a game of bowling is 300 points (10 rounds 30 points each)