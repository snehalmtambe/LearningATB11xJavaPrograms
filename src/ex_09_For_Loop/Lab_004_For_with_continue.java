package ex_09_For_Loop;

public class Lab_004_For_with_continue {
    public static void main(String[] args) {

        for (int i=0; i<5; i++)
        {

            if(i==2)
                System.out.println("Value of  i is:" +i);
            continue;
        }
        System.out.println("Out of the loop");
    }
}
