package Bridge;

import others.Element;

public class ScrollAction implements Action,Animate{
    private float offsetX;
    private float offsetY;
    private Element destination;
    @Override
    public void goToDestination() {
        System.out.println("Scroll vers l'element");
    }

    @Override
    public String getActionName() {
        System.out.println("hellooooo");
        return "Scroll Action";
    }

    @Override
    public void animate(Animation animation) {

    }
}
