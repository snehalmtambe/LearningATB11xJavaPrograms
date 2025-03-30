package Task_14th_march;

public class Lab_007_triangle_Classifier {
    public static void main(String[] args) {
        int l1 = Integer.parseInt(args[0]);
        int l2 = Integer.parseInt(args[1]);
        int l3 = Integer.parseInt(args[2]);

        if(l1==l2 && l2==l3)
        {
            System.out.println("This is equilateral triangle");
        }
        else if(l1==l2 || l2==l3 || l1==l3)
        {
            System.out.println("This is isosceles triangle");
        }
        else
        {
            System.out.println("This is is scalene triangle");
        }
    }


}
