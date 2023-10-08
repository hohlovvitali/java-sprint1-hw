class Converter {
    double stepLength = 0.75;
    int caloriesPerStep = 50;
    int caloriesPerKilocalories = 1000;

    int convertToKm(int steps){
        return  (int) (steps * stepLength / 1000);
    }

    int convertStepsToKilocalories(int steps){
        return steps * caloriesPerStep / caloriesPerKilocalories;
    }
}
