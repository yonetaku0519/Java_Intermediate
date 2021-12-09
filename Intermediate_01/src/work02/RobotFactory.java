package work02;

public class RobotFactory {
	public static Robot CreateRobot(String name) {
		Robot robo = new Robot();
		robo.setName(name);
		
		robo.introduction();
		return robo;
		
	}

}
