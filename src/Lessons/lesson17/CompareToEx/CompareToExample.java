package Lessons.lesson17.CompareToEx;

public class CompareToExample {

    public static void main(String[] args) {

        String str_sample = "b";
        String str_sample2 = "c";
        String str_sample3 = "a";
        System.out.println("Compare to 'b' 'c' " + str_sample.compareTo(str_sample2));
        System.out.println("Compare to 'b' 'b' " + str_sample.compareTo(str_sample));
        System.out.println("Compare to 'b' 'a' " + str_sample.compareTo(str_sample3));

    }
}
