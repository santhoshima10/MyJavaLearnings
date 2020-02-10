package HyperSkillDaily;

public abstract class BaseMessage implements  MyTestInterface{

    protected String sender;
    protected String dest;


    public BaseMessage(String sn, String dst) {
        sender = sn;
        dest = dst;
    }

    @Override
    public String getSender() {
        return sender;
    }


}
