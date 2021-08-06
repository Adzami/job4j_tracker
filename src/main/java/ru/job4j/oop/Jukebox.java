package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        // Тут разумнее был бы switch, ну да ладно
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи, малыши");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox play = new Jukebox();
        play.music(1);
        play.music(2);
        play.music(3);
    }
}
