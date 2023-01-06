package model.Crew;

import model.Task.Task;
import util.TaskGenerator;

public class Survivor extends Crew {

	private TaskGenerator tg;
	
	public Survivor(String name, Integer visionRadius, Integer speed) {
		super(name, visionRadius, speed);

		tg = TaskGenerator.getInstance();
		
		// generate 3 unique tasks
		for(int i = 0; i < 3; i++) {
			Task task = tg.generateSurvivorTask();
			if(tasks.indexOf(task) != -1) {
				do {
					task = tg.generateSurvivorTask();
				} while (!(tasks.indexOf(task) != -1));
			}
			tasks.add(task);
		}
	}


}
