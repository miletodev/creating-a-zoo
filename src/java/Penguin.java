package java;

public class Penguin extends Animal implements Swim, Walk, Eat {
    private String color;
    private int swimmingSpeed;
    private int walkingSpeed;

    public Penguin() {
        super ("java.Penguin");
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public int getWalkingSpeed() {
        return walkingSpeed;
    }

    public void setWalkingSpeed(int walkingSpeed) {
        this.walkingSpeed = walkingSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("java.Penguin: I am eating fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish.");
    }

    @Override
    public void swimming() {
        System.out.println("java.Penguin: I am swimming at the speed " + getSwimmingSpeed() + " mph");
    }

    @Override
    public void walking() {
        System.out.println("java.Penguin: I am walking at the speed " + getWalkingSpeed() + " mph");
    }
}
