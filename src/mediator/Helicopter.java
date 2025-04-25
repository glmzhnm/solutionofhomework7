package mediator;

public class Helicopter extends Aircraft{
    public Helicopter(String id) {
        super(id);
    }
    @Override
    public void receive(String msg) {
        System.out.println("Helicopter received: " +id + " received:"+ msg);
    }
}
