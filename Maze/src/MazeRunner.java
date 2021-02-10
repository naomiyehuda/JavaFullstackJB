import java.util.Scanner;

public class MazeRunner {

	static final String NOT_VALID = "not valid";
	static final int MAX_MOVES = 100;

	Maze myMap = new Maze();
	Scanner scanner = new Scanner(System.in);

	public void Run() {
		String direction;
		int numOfTries = 0;

		intro();

		do {
			System.out.println("Where would you like to move?  (R, L, U, D)");
			direction = userMove();
			if (direction.equals(NOT_VALID)) {
				System.out.println("Please enter a valid direction");
			}

			movesMessage(numOfTries);

		} while (numOfTries++ < MAX_MOVES && !myMap.didIWin());

		if (myMap.didIWin()) {
			System.out.format("Congratulations, you made it out alive and you did it in %d moves!", numOfTries);
		} else {
			System.out.println("Sorry, but you didn't escape in time - you lose!");
		}

		scanner.close();
	}

	private void movesMessage(int numOfTries) {
		switch (numOfTries) {
		case 50:
			System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
			break;
		case 75:
			System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
			break;
		case 90:
			System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
			break;
		case 100:
			System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
			break;
		}
	}

	private void intro() {
		System.out.println("Welcome to Maze Runner!");
		System.out.println("Here is your current position");
		System.out.println();
		myMap.printMap();
	}

	private String userMove() {
		String direction;
		boolean canMove = true;

		direction = scanner.nextLine().toUpperCase();

		if (myMap.isThereAPit(direction)) {
			navigatePit(direction);
		}

		switch (direction) {
		case "R":
			canMove = myMap.canIMoveRight();
			if (canMove) {
				myMap.moveRight();
				System.out.println("Moved Right");
			}
			break;
		case "L":
			canMove = myMap.canIMoveLeft();
			if (canMove) {
				myMap.moveLeft();
				System.out.println("Moved Left");
			}
			break;
		case "U":
			canMove = myMap.canIMoveUp();
			if (canMove) {
				myMap.moveUp();
				System.out.println("Moved Up");
			}
			break;
		case "D":
			canMove = myMap.canIMoveDown();
			if (canMove) {
				myMap.moveDown();
				System.out.println("Moved Down");
			}
			break;
		default:
			direction = NOT_VALID;
		}

		if (!canMove) {
			System.out.println("Sorry you've hit a wall");
			myMap.printMap();
		}

		return direction;
	}

	private void navigatePit(String direction) {
		System.out.println("Watch out! There's a pit ahead, jump it?");

		String answerString = scanner.nextLine().toLowerCase();
		if (answerString.startsWith("y")) {
			myMap.jumpOverPit(direction);
		} else {
			System.out.println("Where would you like to move?  (R, L, U, D)");
			userMove();
		}
	}

}
