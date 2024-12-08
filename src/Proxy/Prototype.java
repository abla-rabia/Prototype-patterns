package Proxy;

import others.Flow;
import Bridge.Interaction;

public class Prototype implements PrototypeInterface {
    private Flow flow;
    private Interaction[] interactions;
    private boolean onTab ;


    public Prototype(Flow flow) {
        this.flow = flow;
    }



    public void addInteraction(Interaction interaction) {
        if (interactions==null){
            interactions = new Interaction[1];
            interactions[0] = interaction;
        } else {
            Interaction[] newInteractions = new Interaction[interactions.length + 1];
            interactions[interactions.length] = interaction;
        }
    }
    public void run() {
        onTab=false;
        System.out.println("The prototype is running");
    }
    public void release() {
        System.out.println("Liberation du prototype.");
    }
    public boolean changeTab(){
        onTab=true;
        System.out.println("L'utilisateur a change le tab.");
        return (onTab);
    }
}
