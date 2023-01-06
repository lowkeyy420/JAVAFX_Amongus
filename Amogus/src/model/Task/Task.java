package model.Task;

public class Task {
	protected String name;
	protected String status;
	protected Integer count;
	
	public Task(String name, Integer count) {
		super();
		this.name = name;
		this.status = "Not Completed";
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public String getStatus() {
		return status;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	
	

}
