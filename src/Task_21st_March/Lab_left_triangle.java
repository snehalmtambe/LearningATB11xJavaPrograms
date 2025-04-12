package Task_21st_March;

public class Lab_left_triangle {
    public static void main(String[] args) {
        // left triangle pattern
        // *****
        // ****
        // ***
        // **
        // *

        for(int i=0; i<5; i++){
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println("*");
        }



    }
}
