package Objects;

public class Room {

	private String name, description;
	private int index, n = -1, s = -1, e = -1, w = -1;
	
	public Room(int index, String name, String desc, int n, int s, int e, int w) {
		this.name = name;
		this.description = desc;
		this.index = index;
		this.n = n;
		this.s = s;
		this.e = e;
		this.w = w;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
