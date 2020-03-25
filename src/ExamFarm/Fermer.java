package ExamFarm;

public class Fermer {
    private String name = "Человек";
    private int res = 5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public void takeRes(PetAnimal[] petAnimals) {
        for (int i = 0; i < petAnimals.length; i++) {
            if (petAnimals[i] != null){
                if (petAnimals[i] instanceof CanGiveResurs) {
                    res += petAnimals[i].giveRes;
                }
            }
        }
    }
}
