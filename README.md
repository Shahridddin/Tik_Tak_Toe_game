# Tic-Tac-Toe Game Documentation

This project is a simple implementation of the classic Tic-Tac-Toe game in Java.

## Features
- Allows two players to play Tic-Tac-Toe on a console-based grid.
- Implements basic game logic to determine wins, losses, or draws.
- Displays the current state of the game after each move.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed.
- IDE (like IntelliJ IDEA, Eclipse) for Java development.

### Installation and Setup

1. **Clone the repository:**
   ```shell
   git clone <repository_url>
   cd tic-tac-toe-java
---

2. **Compile and run the game:**
   ```shell
   javac TicTacToe.java
   java TicTacToe
---
## Example Gameplay
  ```text
    Welcome to Tic-Tac-Toe!

1 | 2 | 3
---------
4 | 5 | 6
---------
7 | 8 | 9

Player X's turn:
Enter your move (1 - 9): 

1 | 2 | 3
---------
4 | X | 6
---------
7 | 8 | 9

Player O's turn:
Enter your move (1 - 9): 

O | 2 | 3
---------
4 | X | 6
---------
7 | 8 | 9

...

Player X wins! Congratulations!


```
---
## Gameplay Rules

- The game is played on a 3x3 grid.
- Players take turns marking a square with their symbol ('X' or 'O').
- The first player to place three of their marks in a horizontal, vertical, or diagonal row wins the game.
- If all squares are filled without either player achieving a winning condition, the game is a draw.
---
