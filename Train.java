package hashmap_example;

public class Train {
	private int train_id;
	private String train_name;
	private String Start;
	private String end;
	
	public Train(int train_id, String train_name, String start, String end) {
		super();
		this.train_id = train_id;
		this.train_name = train_name;
		Start = start;
		this.end = end;
	}

	public int getTrain_id() {
		return train_id;
	}

	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}

	public String getTrain_name() {
		return train_name;
	}

	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}

	public String getStart() {
		return Start;
	}

	public void setStart(String start) {
		Start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Train [train_id=" + train_id + ", train_name=" + train_name + ", Start=" + Start + ", end=" + end + "]";
	}
	

}
