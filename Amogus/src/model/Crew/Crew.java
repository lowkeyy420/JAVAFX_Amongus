package model.Crew;

import java.util.Vector;

import model.Task.Task;

public class Crew {
	protected String name;
	protected Integer visionRadius;
	protected Integer speed;
	protected Vector<Task> tasks;
	
	public Crew(String name, Integer visionRadius, Integer speed) {
		super();
		this.name = name;
		this.visionRadius = visionRadius;
		this.speed = speed;
		this.tasks = new Vector<>();
	}

	public String getName() {
		return name;
	}

	public Integer getVisionRadius() {
		return visionRadius;
	}

	public Integer getSpeed() {
		return speed;
	}

	public Vector<Task> getTasks() {
		return tasks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVisionRadius(Integer visionRadius) {
		this.visionRadius = visionRadius;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public void setTasks(Vector<Task> tasks) {
		this.tasks = tasks;
	}
	
}
