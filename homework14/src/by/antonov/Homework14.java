package by.antonov;

public class Homework14 {

    public static void main(String[] args) {
        int marks[] = new int[5]; //массив, количество учеников
        for (int i = 0; i < 5; i++) {
            marks[i] = (int) (Math.random() * 90 + 1); //присваивание оценок
        }
        int maxMarkIndex = 0;
        int maxMark = marks[0]; // присваивание максимального значения оценки
        for (int i = 0; i < marks.length; i++) { //цикл поиска максимального значения
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                maxMarkIndex = i;
            }
        }
        System.out.println("Максимальная оценка - " + maxMark); //Вывод максимальной оценки
        System.out.println("Её номер - " + maxMarkIndex); //Вывод индекса максимальной оценки
    }
}



