package Bridge;

public class MouseInteraction extends Interaction {


    public MouseInteraction(Action action) {
        super(action);
    }
    @Override
    public String getTrigger() {
        return interactionName.toString();
    }

    public void setInteractionName(MouseTriggers interactionName) {
        this.interactionName = interactionName;
    }

    private MouseTriggers interactionName;
    @Override
    public void runInteraction(Interaction interaction,Action action){
        super.runInteraction(this,this.action);
    }
}
