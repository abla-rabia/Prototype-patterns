package Bridge;

public class MouseInputInteraction extends Interaction{
    private MouseInputTriggers interactionName;
    public MouseInputTriggers getInteractionName() {
        return interactionName;
    }

    public void setInteractionName(MouseInputTriggers interactionName) {
        this.interactionName = interactionName;
    }

    private int delay;

    public MouseInputInteraction(Action action) {
        super(action);
    }

    @Override
    public String getTrigger() {
        return interactionName.toString();
    }
    @Override
    public void runInteraction(Interaction interaction,Action action){
        super.runInteraction(this,this.action);
    }
}
