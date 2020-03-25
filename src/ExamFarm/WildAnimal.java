package ExamFarm;

public class WildAnimal implements CanEat {
    protected String name;
    protected int weight;
    protected  int speed;
    protected int power;

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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void eat(PetAnimal petAnimal) {
        if (speed < petAnimal.speed){
            return;
        }
        petAnimal.health -= power;
        if (petAnimal.health < 0) {
            petAnimal.isOnFarm = false;
        }
    }
}
