package ex_Oops_Constructor;

public class Lab_001_Java_Constructor {
    public static void main(String[] args) {
        Baby b = new Baby();
        b.cry();

    }
}

class Baby{

    public void cry()
    {
        System.out.println("Baby is crying");
    }

    Baby()
    {
        System.out.println("This is default constructor");
    }
}

