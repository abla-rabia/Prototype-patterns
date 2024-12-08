package Bridge;

public class Interaction {
    protected Action action;
    public Interaction(Action action){
        this.action=action;
    }
    public void runInteraction(Interaction trigger,Action act){
        System.out.println("C'est une interaction de declencheur "+trigger.getTrigger()+" et d'action : "+ act.getActionName());
    }

    public String getTrigger() {
        return "";
    }


}
