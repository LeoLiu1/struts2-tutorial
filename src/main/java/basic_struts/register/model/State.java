package basic_struts.register.model;

public class State {
	private String stateAbbr;
	private String stateName;

	public State() {
	}

	public State(String abbr, String name) {
		stateAbbr = abbr;
		stateName = name;
	}

	public String getStateAbbr() {
		return stateAbbr;
	}

	public void setStateAbbr(String stateAbbr) {
		this.stateAbbr = stateAbbr;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String toString() {
		return this.stateName;
	}
}
