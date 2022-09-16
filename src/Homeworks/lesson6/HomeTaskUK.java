package Homeworks.lesson6;

public class HomeTaskUK {
    public static void statement() {
        String lessonAnnounce = "Це урок 1!";
        String homeworkDone = "Я виконав усі домашні завдання 1-го уроку.";
        int lessonCount = 1;

        for (int i = 0; i < 3; i++) {
            System.out.println(lessonAnnounce.replace("1", String.valueOf(lessonCount)));
            if (i != 2) {
                System.out.println(homeworkDone.replace("1", String.valueOf(lessonCount)));
            } else {
                System.out.println(homeworkDone.substring(0, 1).concat(" не ").concat(homeworkDone.substring(2, 9)).concat(homeworkDone.substring(13)).replace("1", String.valueOf(lessonCount)));
            }
            lessonCount++;
        }

    }

    public static void main(String[] args) {
        statement();
    }
}
