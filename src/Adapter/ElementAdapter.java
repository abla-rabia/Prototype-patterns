package Adapter;

public class ElementAdapter extends Screen{
    Element element;

    public ElementAdapter(Element element) {
        super(element.getName());
        this.element=element;
    }
}
