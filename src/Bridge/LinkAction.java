package Bridge;

public class LinkAction implements Action{
    private String destination;
    @Override
    public void goToDestination() {
        System.out.println("aller vers le lien: "+destination);
    }

    @Override
    public String getActionName() {
        return "Link action";
    }
}
