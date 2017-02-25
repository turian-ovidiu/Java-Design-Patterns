package builderDesignPattern;


public interface RobotBuilder {

    void buildRobotHead();

    void buildRobotBody();

    void buildRobotArms();

    void buildRobotLegs();

    Robot getRobot();
}
