import java.util.Random;

public class Sort1 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
        }


        int minIndex, cup;

        for (int i = 0; i < mas.length-1; i++){

            minIndex = i;//предполагаем,что первый элемент минимальный
            for (int j = i+1; j < mas.length; j++) {
                if (mas[j] < mas[minIndex]){
                    minIndex = j;//запоминаем идекс минимального элемента
                }
            }
            //меняем местами первый и найденный минимальный по его индексу
            cup = mas[minIndex];
            mas[minIndex] = mas[i];
            mas[i] = cup;
        }

        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
        }
    }


}
