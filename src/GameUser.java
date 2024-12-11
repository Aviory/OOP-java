public class GameUser extends User{

    private int score;
    private int level;
    public GameUser(String name,int age, int score, int level) {
        super(name,age);
        this.score = score;
        this.level = level;
    }
    public void info(){
        super.info();
        System.out.println("Score: "+score);
        System.out.println("Level: "+level);
    }


}
