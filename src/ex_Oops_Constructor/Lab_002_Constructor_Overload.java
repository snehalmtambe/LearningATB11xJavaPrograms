package ex_Oops_Constructor;

public class Lab_002_Constructor_Overload {
    public static void main(String[] args) {

        man m = new man();
        man m1 = new man("Pankaj", 38, 987456321, "Thane");

        System.out.println(m1.name);
        System.out.println(m1.age);
        System.out.println(m1.mobile);
        System.out.println(m1.address);
    }
}

 class man{
    String name;
    int age;
    long mobile;
    String address;


    man()
    {
        System.out.println("This is default constructor");
    }

    man(String name, int age, long mobile, String address){
      this.name = name;
      this.age = age;
      this.mobile = mobile;
      this.address = address;

    }
}
