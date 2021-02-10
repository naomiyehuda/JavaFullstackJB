import java.awt.*;

public class WhiteTiger extends Tiger {
	boolean hasInfected = false;

	public Action getMove(CritterInfo info) {
		var action = super.getMove(info);
		if (action == Action.INFECT) {
			hasInfected = true;
		}
		return action;
	}

	public Color getColor() {
		return Color.WHITE;
	}

	public String toString() {
		return hasInfected ? "TGR" : "tgr";
	}
}
