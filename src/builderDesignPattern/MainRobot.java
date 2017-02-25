package builderDesignPattern;


public class MainRobot {

    public static void main(String[] args) {

        OldRobotBuilder oldRobotBuilder = new OldRobotBuilder();
        RobotEngineer engineer = new RobotEngineer(oldRobotBuilder);

        Robot robot = engineer.getRobot();

        System.out.println(robot.getRobotHead() + "\n" + robot.getRobotBody() + "\n" + robot.getRobotArms() + "\n" + robot.getRobotLegs());
    }
}
