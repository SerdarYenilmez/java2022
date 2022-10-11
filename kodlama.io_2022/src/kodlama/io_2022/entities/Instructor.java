package kodlama.io_2022.entities;

public class Instructor {

	private int id;
	private String name;
	private double rate;

	public Instructor(int id, String name, double rate) {

		this.id = id;
		this.name = name;
		this.rate = rate;

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

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}
