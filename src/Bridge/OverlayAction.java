package Bridge;

import Adapter.Screen;

public class OverlayAction implements Action,Animate{
    private Screen destination;
    @Override
    public void goToDestination() {
        System.out.println("Overlay sur le screen : ");
    }

    @Override
    public String getActionName() {
        return "";
    }

    @Override
    public void animate(Animation animation) {

    }
}
