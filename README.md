# assignment5
This is assignment 5 for practice.
Assignment 5 – Shuffle
Name
In this lab you will simulate the playing of a simple card game. You are given a Card and Deck class to use. The Card class should not be changed. You will add one method to the Deck class.
This assignment should be submitted in two classes, each with a separate code-runner box. The first class, Deck, will be a modification of the class we have provided. You will need to implement the shuffleDeck method in order for this class to be accepted.
The second class, Main, will use the Card class and your modified Deck class to create a shuffled Deck object and deal the two hands. The hands should be dealt in alternating order, starting with the first hand. Each hand should have 5 cards. As the cards are dealt into each hand they should be removed from the deck.
For example, each hand is shown for the following Deck. Seven of spades <- Index 0, top card
Queen of spades <- Index 1, etc. Ten of spades
Eight of spades
Three of spades
King of hearts Queen of hearts Jack of clubs Four of clubs Eight of clubs King of diamonds Seven of hearts
Hand 1:
Seven of spades
Ten of spades
Three of spades
Queen of hearts
Four of clubs
Also, all of these cards should be removed from the deck.
Hand 2:
Queen of spades Eight of spades King of hearts Jack of clubs Eight of clubs

After dealing the hand, Main should use the point value of each card to calculate the total point value of each hand. The hand with the highest point value wins. In the case of a draw, the second hand wins. In this game ace = 1, jack = 11, queen = 12, and king = 13. In the deck the card in the first position (index 0) is the top of the deck.
Lastly, Main will declare the winning hand. See the following sample run of Main for the exact format that will be expected by the code-runner.
Sample Run of Main:
      Hand 1 (total points 22)
      Three of clubs (point value = 3)
      Two of clubs (point value = 2)
      Six of hearts (point value = 6)
      Ten of hearts (point value = 10)
      Ace of spades (point value = 1)
      Hand 2 (total points 27)
      Four of spades (point value = 4)
      Ten of clubs (point value = 10)
      Three of diamonds (point value = 3)
      Eight of diamonds (point value = 8)
      Two of hearts (point value = 2)
      Hand 2 wins!
