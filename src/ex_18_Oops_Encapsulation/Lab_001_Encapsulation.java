package ex_18_Oops_Encapsulation;

public class Lab_001_Encapsulation {
    public static void main(String[] args) {

        VMOlogin l1 = new VMOlogin();
        l1.setPassword("Pass1234");
        l1.setUsername("snehal");

        System.out.println("Username set for VMOLogin is:");
        System.out.println(l1.getUsername());

        System.out.println("-----------------");

        System.out.println("Password set for VMOLogin is");
        System.out.println(l1.getPassword());

        System.out.println("-----------------");

        System.out.println("Password set for VMOLogin is");
        l1.login(l1.getUsername(), l1.getPassword());

    }
}

class VMOlogin
{
    private String username;
    private String password;

    public void setUsername(String username)
    {
        this.username = username;

    }
    public String getUsername()
    {
        return username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }

    public void login(String username, String password)
    {
        this.username = username;
        this.password = password;

        System.out.println(username);
        System.out.println(password);
    }

}
