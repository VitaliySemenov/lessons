package nasledovanie;

abstract public class Unit implements CanRest{
    protected String name = "Unit"; //protected означает что доступ либо к методу доступен всем дочерним классам+ внутри пакета
    protected int healthScore;
    protected int speed;

    public void setHealthScore(int healthScore) {
        this.healthScore = healthScore;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Unit(int healthScore, int speed){

    }

    public int getHealthScore() {
        return healthScore;
    }

    public int getSpeed() {
        return speed;
    }
    public boolean isAlive(){
        return healthScore > 0;
    }
    public void run(){
        System.out.println(name + "двигается со скоростью " +speed);
    }
}
