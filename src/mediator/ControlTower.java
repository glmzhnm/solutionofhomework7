package mediator;

import java.util.LinkedList;
import java.util.Queue;

public class ControlTower implements TowerMediator {
    private Queue<Aircraft> landing=new LinkedList<Aircraft>();
    private Queue<Aircraft> takeoff=new LinkedList<Aircraft>();
    public void broadcast(String msg, Aircraft sender) {
    System.out.println("Control Tower broadcasting:" +msg);
}
public boolean Runway(Aircraft a) {
        if(a instanceof PassengerPlane){
            landing.add(a);
            System.out.println(a.getClass().getSimpleName()+" "+a.id+"for landing");}
        return true;
            }
}

