package Task_21st_March;

public class Lab_Count_Vowels {
    public static void main(String[] args) {
        String name = "Pramod";
        int vowels = 0;
        int consonent = 0;
        name = name.toLowerCase();
        int count = name.length();
        char ch;
        for(int i=0; i<count; i++)
        {
            ch = name.charAt(i);

            if(Character.isLetter(ch))
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u') {
                    vowels++;
                }
                else {
                    consonent++;
                }
            }
        }
        System.out.println("Wovel present in string are:"+vowels);
        System.out.println("Consonent present in string are:"+consonent);
    }
}
