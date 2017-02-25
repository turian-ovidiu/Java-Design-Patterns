package builderDesignPattern;


public class RobotEngineer {

    RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robBilder) {
        robotBuilder = robBilder;

        makeRobot();
    }

    private void makeRobot() {
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotBody();
        robotBuilder.buildRobotArms();
        robotBuilder.buildRobotLegs();
    }

    public Robot getRobot() {
        return robotBuilder.getRobot();
    }

}
