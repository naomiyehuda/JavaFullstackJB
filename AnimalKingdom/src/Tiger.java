import java.awt.*;

public class Tiger extends Critter {

	private int movesCounter;
	Color color;

	public Tiger() {
		color = getRandomColor();
	}

	public Action getMove(CritterInfo info) {
		movesCounter++;
		if (info.frontThreat()) {
			return Action.INFECT;
		} else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
			return Action.LEFT;
		} else if (info.getFront() == Neighbor.SAME) {
			return Action.RIGHT;
		}

		return Action.HOP;
	}

	public Color getColor() {
		if (movesCounter == 3) {
			movesCounter = 0;
			color = getRandomColor();
		}
		return color;
	}

	private Color getRandomColor() {
		int choose = (int) Math.random() * 3;
		switch (choose) {
		case 0:
			color = Color.RED;
			break;
		case 1:
			color = Color.GREEN;
			break;
		case 2:
			color = Color.BLUE;
			break;
		}
		return color;
	}

	public String toString() {
		return "TGR";
	}
}
