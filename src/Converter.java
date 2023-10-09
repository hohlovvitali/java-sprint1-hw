class Converter {
    static double stepLength = 0.75;
    static int caloriesPerStep = 50;
    static int caloriesPerKilocalories = 1000;
    static int metresPerKilometre = 1000;

    static int convertToKm(int steps){
        return  (int) (steps * stepLength / metresPerKilometre);
    }

    static int convertStepsToKilocalories(int steps){
        return steps * caloriesPerStep / caloriesPerKilocalories;
    }
}
