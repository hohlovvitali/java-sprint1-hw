import java.util.Scanner;
class StepTracker {
    Scanner scanner;
    int goalByStepsPerDay = 10000;
    MonthData[] monthToData = new MonthData[12];

    StepTracker(Scanner scan){
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++){
            monthToData[i] = new MonthData();
        }
    }


    void changeStepGoal(){
        System.out.println("Введите новую цель по количеству шагов за день:");
        int stepGoal;
        while (true){
            stepGoal = scanner.nextInt();
            if (stepGoal > 0){
                break;
            }
            System.out.println("Недопустимое количество шагов. Нужно больше 0. Введите еще раз.");
        }

        goalByStepsPerDay = stepGoal;
    }
    void addNewNumberStepsPerDay(){
        System.out.println("Введите номер месяца:");
        int monthNumber;
        while (true){
            monthNumber = scanner.nextInt();
            if (monthNumber >= 1 && monthNumber <= 12){
                break;
            }
            System.out.println("Недопустимое значение месяца. Нужно от 1 до 12 (включительно). Введите еще раз.");
        }

        System.out.println("Введите номер дня от 1 до 30 (включительно):");
        int dayNumber;
        while (true){
            dayNumber = scanner.nextInt();
            if (dayNumber >= 1 && dayNumber <= 30){
                break;
            }
            System.out.println("Недопустимое значение дня. Нужно от 1 до 30 (включительно). Введите еще раз.");
        }

        System.out.println("Введите количество пройденных шагов за день:");
        int stepNumber;
        while (true){
            stepNumber = scanner.nextInt();
            if (stepNumber > 0){
                break;
            }
            System.out.println("Недопустимое количество шагов. Нужно больше 0. Введите еще раз.");
        }

        MonthData monthData = monthToData[monthNumber - 1];
        monthData.days[dayNumber - 1] = stepNumber;
    }

    void printStatistic(){
        System.out.println("Введите номер месяца:");
        int monthNumber;
        while (true){
            monthNumber = scanner.nextInt();
            if (monthNumber >= 1 && monthNumber <= 12){
                break;
            }
            System.out.println("Недопустимое значение месяца. Нужно от 1 до 12 (включительно). Введите еще раз.");
        }

        MonthData monthData = monthToData[monthNumber - 1];
        int sumSteps = monthData.sumStepsFromMonth();

        monthData.printDaysAndStepsFromMonth();
        System.out.println( "Общее количество шагов за месяц: " + sumSteps);
        System.out.println( "Максимальное пройденное количество шагов в месяце: " + monthData.maxSteps());
        System.out.println( "Среднее количество шагов: " + sumSteps / 30);
        System.out.println( "Пройденная дистанция (в км): " + Converter.convertToKm(sumSteps));
        System.out.println( "Количество сожжённых килокалорий: " + Converter.convertStepsToKilocalories(sumSteps));
        System.out.println( "Лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));
        System.out.println();
    }
}
