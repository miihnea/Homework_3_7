import java.util.ArrayList;
import java.util.List;

public class CoffeLover {
    private List<CoffeMachine> coffeMachines;

    public CoffeLover(){
        coffeMachines = new ArrayList<CoffeMachine>();
    }

    public void addMachine(CoffeMachine coffeMachine){
        coffeMachines.add(coffeMachine);
    }

    public void removeMachine(CoffeMachine coffeMachine){
        coffeMachines.remove(coffeMachine);
    }

    public void makeCoffe(){
        for(CoffeMachine i : coffeMachines){
            i.start();
        }
    }
}
