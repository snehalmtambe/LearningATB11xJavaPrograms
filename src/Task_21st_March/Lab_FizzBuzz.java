package Task_21st_March;

public class Lab_FizzBuzz {
    public static void main(String[] args) {

        for(int i=0; i<100; i++)
        {
            if(i%3==0)
            {
                System.out.println("Value of i is:"+i+" so it is Fizz");
            }

            if(i%5==0)
            {
                System.out.println("value of i is:"+i+" so it is Buzz");
            }
            if(i%3==0 && i%5==0)
            {
                System.out.println("Value of i is:"+i+" so it is Fizzbuzz");
            }
        }
    }
}
