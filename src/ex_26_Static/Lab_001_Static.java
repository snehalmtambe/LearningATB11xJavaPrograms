package ex_26_Static;

public class Lab_001_Static {
    public static void main(String[] args) {
        P p = new P();


    }
}

class P{
    static{
        System.out.println("SIB");
    }
    {
        System.out.println("IIB");
    }
    P()
    {
        System.out.println("Constructor block");
    }


}
