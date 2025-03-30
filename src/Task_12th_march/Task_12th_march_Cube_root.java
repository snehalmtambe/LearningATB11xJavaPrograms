package Task_12th_march;

//import static jdk.internal.foreign.abi.riscv64.RISCV64Architecture.Regs.x2;

public class Task_12th_march_Cube_root {
    public static void main(String[] args) {
        System.out.println("This is the task assigned on March 12th");

        int x = 10;
        int y = 10;
        int z = 10;


        double x_sq = Math.pow(x,2);
        double y_sq = Math.pow(y,2);

        double z_abs = Math.abs(z);

        double result = x_sq+y_sq-z_abs;

        double result_cr = Math.cbrt(result);

        System.out.println("Value of X square is :" +x_sq);
        System.out.println("Value of Y square is :" +y_sq);
        System.out.println("Value of z absolute is:" +z);

        System.out.println("Value of the result is: " +result);

        System.out.println("Value of cube root of complete result is: " +result_cr);


        //result = (x2 + y2 - |z|);


    }
}
