import java.util.Scanner;
class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StepTracker steptracker = new StepTracker(scanner);

        while (true){
            printMenu();

            System.out.println("Выберите команду");
            int command = scanner.nextInt();

            switch (command){
                case 1:
                    steptracker.addNewNumberStepsPerDay();
                    break;
                case 2:
                    steptracker.changeStepGoal();
                    break;
                case 3:
                    steptracker.printStatistic();
                    break;
                case 4:
                    System.out.println("До встречи");
                    scanner.close();
                    return;
                default:
                    System.out.println("Такой команды пока нет\n");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Команды меню:");
        System.out.println("1 - Изменение количества шагов за определенный день");
        System.out.println("2 - Изменение целевого значения шагов в день");
        System.out.println("3 - Вывод статистики за месяц");
        System.out.println("4 - Выход");
    }
}
