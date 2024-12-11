public class PremUser extends GameUser{
    private int gold;
    public PremUser(String name, int age, int score, int level,int gold) {
        super(name, age, score, level);
        this.gold = gold;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Gold: "+gold);
    }
    public void buy(int price){
        if(gold < price){
            System.out.println("Not enough gold");
            return;
        }
        gold -= price;
    }
    public int getGold() {
        return gold;
    }

}
