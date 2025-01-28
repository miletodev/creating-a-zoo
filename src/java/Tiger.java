package java;

public class Tiger extends Animal implements Walk, Eat {
    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoar;

    public Tiger() {
        super ("java.Tiger");
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("java.Tiger: I have eaten meat");
    }

    @Override
    public void walking() {
        System.out.println("java.Tiger: I am walking at the speed " + getSpeed() + " mph");
    }
}
