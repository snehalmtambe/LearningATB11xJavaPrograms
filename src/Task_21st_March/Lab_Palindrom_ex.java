package Task_21st_March;

public class Lab_Palindrom_ex {
    public static void main(String[] args) {
        String name = "Naman";
        name = name.toLowerCase();
        int count = name.length();
        System.out.println(count);
        String rev="";
        char ch;
        for(int i=count-1; i>=0; i--)
        {
            rev =  rev + name.charAt(i);

        }
        System.out.println("Original string is:"+name);
        System.out.println("Reverse string is:"+rev);

        if(name.equals(rev))
        {
            System.out.println("String is palindrom");

        }
        else {
            System.out.println("String is not palindrom");

        }







    }
}
