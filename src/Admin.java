public class Admin extends User{

   private String pass;

    public Admin(String name,int age, String pass) {
        super(name,age);
        this.pass = pass;

    }

    @Override
    public void info() {
        System.out.println(getName());
        System.out.println("--------------------");

        System.out.println("Admin");
        super.info();
        System.out.println("pass: "+pass);
    }
}
