package Workshops.lesson3;

//1 Создать базовый класс Animal, который описывает животное.
//        2 У животного есть имя и оно издает какой-то звук
//        3 Создать общедоступный конструктор
//        4 Создать общедоступный метод speak(), в котором на консоли выводится значение поля voice.
//        5 Создать класс Cat, который будет представлять кота и унаследует от класса Animal его свойства и поведение.
//        6 В классе Main cоздать экземпляр класса Cat и воспользоваться методом speak(), унаследованным от суперкласса,
//        чтобы «услышать», как мяукает кот.
public class Animal {

    private String name;
    private String voice;

    public Animal(String animalName, String animalVoice) {
        this.name = animalName;
        this.voice = animalVoice;
    }

    public void speak() {
        System.out.println(this.name + " says " + this.voice);
    }
}
