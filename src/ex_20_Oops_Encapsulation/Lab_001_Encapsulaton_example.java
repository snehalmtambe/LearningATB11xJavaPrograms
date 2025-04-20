package ex_20_Oops_Encapsulation;

public class Lab_001_Encapsulaton_example {
    public static void main(String[] args) {
        demo d = new demo();
        d.setUsername("Snehal");
        d.setPassword("Pass@1223");

        System.out.println("Username is:");
        System.out.println(d.getUsername());
        System.out.println("Password is:");
        System.out.println(d.getPassword());
    }
}

class demo{
    private String username;
    private String password;


    demo()
    {
        System.out.println("this is constructor block");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static {
        System.out.println("This is static block");
    }

}