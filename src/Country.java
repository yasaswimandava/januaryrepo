
public class Country {
	int id;
	String name;
	State[] states;

	Country() {

	}

	Country(int id, String name, State[] states) {
		this.id = id;
		this.name = name;
		this.states=states;
	}

	public State[] getStates() {
		return states;
	}

	public void setStates(State[] states) {
		this.states = states;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	



}
