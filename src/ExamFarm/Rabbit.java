package ExamFarm;

public class Rabbit extends PetAnimal implements CanBeEaten {
    private int res = 1;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    @Override
    public void eaten(CanGiveResurs res) {

    }
}

