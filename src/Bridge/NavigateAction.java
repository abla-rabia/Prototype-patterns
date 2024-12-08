package Bridge;

import Adapter.Screen;

public class NavigateAction implements Action,Animate{
    protected Screen destination=new Screen("Contact page");

    @Override
    public void goToDestination() {
        System.out.println("Navigation vers le screen : "+destination.getValue());
    }

    @Override
    public String getActionName() {
        return "Navigation action";
    }

    @Override
    public void animate(Animation animation) {

    }
}
