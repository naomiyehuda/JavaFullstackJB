import java.awt.*;

public class Bear extends Critter {
	boolean isPolar;
	boolean toggle = false;

	public Bear(boolean isPolar) {
		this.isPolar = isPolar;
	}

	public Action getMove(CritterInfo info) {
		if(info.frontThreat()) {
			return Action.INFECT;
		}else if(info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		}
		
		return Action.LEFT;
	}

	public Color getColor() {
		return isPolar ? Color.WHITE : Color.BLACK;
	}

	public String toString() {
		toggle = !toggle;
		if (toggle) {
			return "/";
		}

		return "\\";
	}
}
