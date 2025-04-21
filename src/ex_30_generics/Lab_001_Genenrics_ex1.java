package ex_30_generics;

public class Lab_001_Genenrics_ex1 {
    public static void main(String[] args) {
        Generic_Class<Integer> gc = new Generic_Class(5);
        Generic_Class<String> gc1 = new  Generic_Class("Class_ex");

        System.out.println(gc.getData());
        System.out.println(gc1.getData());

    }

}

class Generic_Class<T>{
    private T data;

    public Generic_Class(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }


}