package Homeworks.Lesson14.Anonymous;

public class AnonymousMain {
    public static void main(String[] args) {
        Outerclass outer = new Outerclass();
        outer.anonymousDemo(new Anonymous() {
                                public String sayHere() {
                                    return "Here!";
                                }
                            }
        );
    }
}
