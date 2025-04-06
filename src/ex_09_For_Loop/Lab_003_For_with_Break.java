package ex_09_For_Loop;

public class Lab_003_For_with_Break {
    public static void main(String[] args) {
        for(int i=0; i<5; i++)
        {
            if(i==2)
                System.out.println("Value of i is: " +i);
            break;
        }
        System.out.println("you are out of loop");
    }
}
