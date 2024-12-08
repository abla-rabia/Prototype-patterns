package Proxy;

public class PrototypeProxy implements PrototypeInterface{
    Prototype prototype;


    public  PrototypeProxy(Prototype prototype){
        this.prototype=prototype;

    }

    @Override
    public void run() {
        if (this.prototype!=null)
            this.prototype.run();
    }
//pour surveiller le prototype
    @Override
    public void release() {
        if (this.prototype.changeTab()){
            this.prototype.release();
        }
    }

}
