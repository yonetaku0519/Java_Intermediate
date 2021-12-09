package work02;

public class SampleController {

	public static void main(String[] args) {
		Robot robo = RobotFactory.CreateRobot("にゃんじろう");
		System.out.println("猫型ロボット「" + robo.getName() + "」の製造を完了した");
	}
}
