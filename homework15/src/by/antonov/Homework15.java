package by.antonov;

public class Homework15 {

    public static void main(String[] args) {

        int marks[] = new int[5]; //массив, количество учеников
        for (int i = 0; i < 5; i++) {
            marks[i] = (int) (Math.random() * 90 + 1); //присваивание оценок
        }
        int maxMark = marks[0]; // присваивание максимального значения оценки
        for (int i = 0; i < marks.length; i++) { //цикл поиска максимального значения
            if (maxMark < marks[i]) {
                maxMark = marks[i];
            }
        }
        int minMark = marks[0]; // присваивание минимального значения оценки
        for (int i = 0; i < marks.length; i++) { //цикл поиска минимального значения
            if (minMark > marks[i]) {
                minMark = marks[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < marks.length; i++) { //определение суммы значений
            sum = sum + marks[i];
        }
        System.out.println("Сумма значений между максимальной оценкой и минимальной:");
        System.out.println(sum - maxMark - minMark);
    }
}

