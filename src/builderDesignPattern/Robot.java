package builderDesignPattern;


public class Robot implements RobotPlan {

    private String head;
    private String body;
    private String arms;
    private String legs;

    @Override
    public void setRobotHead(String head) {
        this.head = head;
    }

    public String getRobotHead() {
        return head;
    }

    @Override
    public void setRobotBody(String body) {
        this.body = body;
    }

    public String getRobotBody() {
        return body;
    }

    @Override
    public void setRobotArms(String arms) {
        this.arms = arms;
    }

    public String getRobotArms() {
        return arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.legs = legs;
    }

    public String getRobotLegs() {
        return legs;
    }
}
