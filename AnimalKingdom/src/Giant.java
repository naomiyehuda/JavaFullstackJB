import java.awt.*;

public class Giant extends Critter {

	private int movesCounter;
	int index = 0;
	String[] alerts = new String[] { "fee", "fie", "foe", "fum" };

	public Action getMove(CritterInfo info) {
		movesCounter++;
		if (info.frontThreat()) {
			return Action.INFECT;
		} else if (info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		}

		return Action.RIGHT;
	}

	public Color getColor() {
		return Color.WHITE;
	}

	public String toString() {
		if (movesCounter == 6) {
			movesCounter = 0;
			index++;
			if (index == 4)
				index = 0;
		}
		return alerts[index];
	}
}
