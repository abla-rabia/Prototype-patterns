package Bridge;

public class Animation {
    private Animation animationName;
    private int duration;

    public Animation getAnimationName() {
        return animationName;
    }

    public void setAnimationName(Animation animationName) {
        this.animationName = animationName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Curves getCurve() {
        return curve;
    }

    public void setCurve(Curves curve) {
        this.curve = curve;
    }

    public Directions getDirection() {
        return direction;
    }

    public void setDirection(Directions direction) {
        this.direction = direction;
    }

    private Curves curve;
    private Directions direction;
}
