import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        OOP
        //наслідування  - це те що відбувається з класом-потомком
        //поліморфізм - це те що відбувається з класом-потомком
        //інкапсуляція - це те що відбувається з класом-потомком
        //абстра�ція - це те що відбувається з класом-потомком

        User  user = new User("Darth",20);
        Admin admin = new Admin("R2D2",3000,"qwer");
        GameUser gameUser  = new GameUser("Amidala", 20, 0,1);
        PremUser premUser  = new PremUser("Modalorec", 20, 0,2,200);
        System.out.println(premUser.getGold());
        starGame(user);
        starGame(admin);
        starGame(gameUser);
        starGame(premUser);

        User [] arr = {user,admin,gameUser,premUser};
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(admin);
        users.add(gameUser);
    }

    public static void starGame(User  user){
        System.out.println("=============================");
        System.out.println(user.getName() + " is started");
        user.info();
    }


}