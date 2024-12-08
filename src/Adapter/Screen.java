package Adapter;

import Bridge.Interaction;

public class Screen {
    private String name;

    private Element[] elements;
    private Interaction[] interactions;
    public Screen(String nm){
        this.name=nm;
    }
    public String getValue(){
        return this.name;
    }
    public void Create(){}
    public void Delete(){}
    public String getName(){
        return this.name;
    }
    public void addElement(Element element){}
    public void deleteElement(Element element){}
    public void deleteInteraction(Interaction interaction){}
    public void addInteraction(Interaction interaction){}
}
