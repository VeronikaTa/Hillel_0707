package Homeworks.lesson6;

public class HomeworkTask {

    public static void statement() {
        String lessonAnnounce = "This is lesson number  1.";
        String homeworkDone = "I've done my homework for lesson number 1.";
        int lessonCount = 1;

        for (int i = 0; i < 3; i++) {
            System.out.println(lessonAnnounce.replace("1", String.valueOf(lessonCount)));
            if (i != 2) {
                System.out.println(homeworkDone.replace("1", String.valueOf(lessonCount)));
            } else {
                System.out.println("I haven't" + homeworkDone.substring(4).replace("1", String.valueOf(lessonCount)));
            }
            lessonCount++;
        }

    }

    public static void main(String[] args) {
        statement();
    }

}
