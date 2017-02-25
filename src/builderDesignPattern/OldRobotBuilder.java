package builderDesignPattern;


public class OldRobotBuilder implements RobotBuilder {

    Robot robot;

    public OldRobotBuilder() {
        robot = new Robot();
    }


    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Big head");
    }

    @Override
    public void buildRobotBody() {
        robot.setRobotBody("Thin body");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Long arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Roller legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
