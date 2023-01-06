package util;

import java.util.HashMap;
import java.util.Random;

import model.Task.SurvivorTask;

public class TaskGenerator {
	
	private static TaskGenerator instance;
	
	private HashMap<Integer, String>  template;
	private Random rand;
	
	
	public static TaskGenerator getInstance() {
		if(instance == null) instance = new TaskGenerator();
		return instance;
	}
	
	private TaskGenerator() {
		template = new HashMap<>();
		rand = new Random();
		template.put(1, "Swipe admin card");
		template.put(2, "Scan health condition");
		template.put(3, "Press combustion buttons");
	}
	
	public SurvivorTask generateSurvivorTask() {
		int count = rand.nextInt(3) + 1;
		return new SurvivorTask(template.get(count), count);
	}
	
}
