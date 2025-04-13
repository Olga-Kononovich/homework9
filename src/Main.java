public class Main {
    public static void main(String[] args) {




        int[] expenses = new int[]{1000, 1500, 2000, 2500, 3000};
        int total = 0;
        for (int expense : expenses) {
            total += expense;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");




        int[] monthExpenses = {1000, 1500, 2000, 2500, 3000};
        int totalExpenses = 0;
        for (int expense : monthExpenses) {
            totalExpenses += expense;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей.");
        int minExpense = monthExpenses[0];
        int maxExpense = monthExpenses[0];
        for (int expense : monthExpenses) {
            if (expense < minExpense) {
                minExpense = expense;}
            if (expense > maxExpense) {
                maxExpense = expense;}
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");






        int[] expenses1 = new int[]{1000, 1500, 2000, 2500, 3000};
        int totalSum = 0;
        for (int expense: expenses) {
            totalSum += expense;}
        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей.");
        int minExpense1 = expenses[0];
        int maxExpense1= expenses[0];
        for (int expense : expenses) {
            if (expense < minExpense) {
                minExpense = expense;}
            if (expense > maxExpense) {
                maxExpense = expense;}}
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");
        double averageExpense = totalSum / 4.0;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей.");





        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverseArray(reverseFullName);
        System.out.println(reverseFullName);
    }


    public static void reverseArray(char[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;



        }
    }

}

