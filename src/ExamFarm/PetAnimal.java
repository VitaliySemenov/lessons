package ExamFarm;

public class PetAnimal implements CanBeEaten, CanGiveResurs{
    protected String name;
    protected int weight;
    protected  int speed;
    protected int health;
    protected int giveRes;

    protected boolean isOnFarm = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGiveRes() {
        return giveRes;
    }

    public void setGiveRes(int giveRes) {
        this.giveRes = giveRes;
    }


    @Override
    public void eaten(CanGiveResurs res) {
    }

    @Override
    public void giveRasurs() {
    }
}
