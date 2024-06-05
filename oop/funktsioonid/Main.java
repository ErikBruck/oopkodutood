public class Main {
    public static void main(String[] args) {
        // f1 ujumiskõlblikkus olenevalt vee temperatuurist
        double swimmingRating1 = swimmingRating(18);
        System.out.println("Swimming rating with temperature 18°C: " + swimmingRating1);
        double swimmingRating2 = swimmingRating(25);
        System.out.println("Swimming rating with temperature 25°C: " + swimmingRating2);

        // f2 bmi kalkulatsioon
        double bodyBMI1 = bodyMassIndex(70, 1.75);
        System.out.println("Body Mass Index with weight 70kg and height 1.75m: " + bodyBMI1);
        double bodyBMI2 = bodyMassIndex(90, 1.80);
        System.out.println("Body Mass Index with weight 90kg and height 1.80m: " + bodyBMI2);

        // f3 tunnid ja minutid minutiteks
        int minutesCount1 = calculateMinutes(2, 30);
        System.out.println("Total minutes with 2 hours and 30 minutes: " + minutesCount1);
        int minutesCount2 = calculateMinutes(1, 15);
        System.out.println("Total minutes with 1 hour and 15 minutes: " + minutesCount2);

        // f4 fitness level olenevalt trenni intensiivsusest
        String fitnessLevel1 = fitnessLevel("Strong");
        System.out.println("Fitness level 'Strong': " + fitnessLevel1);
        String fitnessLevel2 = fitnessLevel("Moderate");
        System.out.println("Fitness level 'Moderate': " + fitnessLevel2);

        // f5 kontrollib kas on koeratõug
        boolean isDog1 = isDog("Labrador");
        System.out.println("Is the breed a dog? " + isDog1);
        boolean isDog2 = isDog("Cat");
        System.out.println("Is the breed a dog? " + isDog2);

        // f6 jäätise söömise rating olenevalt kui soe on, mida soem seda parem reiting
        int iceCreamRating1 = iceCreamRating(25);
        System.out.println("Ice cream rating with temperature 25°C: " + iceCreamRating1);
        int iceCreamRating2 = iceCreamRating(10);
        System.out.println("Ice cream rating with temperature 10°C: " + iceCreamRating2);

        // f7 kohvi valmistamise aeg läbi appi olenevalt kas on hommik või ei, kui on hommik valmista 10 min kui ei siis 5 minutiga.
        int coffeeTime1 = coffeePreparationTime(true);
        System.out.println("Coffee preparation time in the morning: " + coffeeTime1 + " minutes");
        int coffeeTime2 = coffeePreparationTime(false);
        System.out.println("Coffee preparation time in the evening: " + coffeeTime2 + " minutes");

        // f8 telefoni aku estimation, ehk kui kasutatud vähem kui 5h annab 8 tundi jäänud, kui üle 5 siis annab 4 tundi jäänud.
        int batteryLife1 = batteryLife(3);
        System.out.println("Mobile phone battery life with 3 hours of active usage: " + batteryLife1 + " hours");
        int batteryLife2 = batteryLife(8);
        System.out.println("Mobile phone battery life with 8 hours of passive usage: " + batteryLife2 + " hours");

        // f9 arvutab kui kaugele oled autoga sõitnud, korrutab tunnid ja sõidetud kilomeetrid
        double distance1 = calculateDistance(60, 2);
        System.out.println("Distance traveled with speed 60 km/h in 2 hours: " + distance1 + " km");
        double distance2 = calculateDistance(80, 1.5);
        System.out.println("Distance traveled with speed 80 km/h in 1.5 hours: " + distance2 + " km");

        // f10 arvutab kui tervislik päev sul on olenevalt mitu toidukorda sööd, kui 4 siis oled tervislik, kui 3 siis veidi vähem jne.
        String mealRating1 = mealRating(5);
        System.out.println("Meal rating with 5 meals per day: " + mealRating1);
        String mealRating2 = mealRating(2);
        System.out.println("Meal rating with 2 meals per day: " + mealRating2);
    }

    // f1
    public static double swimmingRating(double temperature) {
        if (temperature >= 20) {
            return 10.0;
        } else if (temperature >= 10) {
            return 7.5;
        } else {
            return 5.0;
        }
    }

    // f2
    public static double bodyMassIndex(double weight, double height) {
        return weight / (height * height);
    }

    // f3
    public static int calculateMinutes(int hours, int minutes) {
        return hours * 60 + minutes;
    }

    // f4
    public static String fitnessLevel(String intensity) {
        switch (intensity.toLowerCase()) {
            case "strong":
                return "Excellent";
            case "moderate":
                return "Good";
            case "light":
                return "Satisfactory";
            default:
                return "Unknown";
        }
    }

    // f5
 public static boolean isDog(String breed) {
    String[] dogBreeds = {"Labrador", "Poodle", "German Shepherd"};
    for (String dog : dogBreeds) {
        if (dog.equalsIgnoreCase(breed)) {
            return true;
        }
    }
    return false;
}

// f6
public static int iceCreamRating(double temperature) {
    if (temperature >= 20) {
        return 10;
    } else if (temperature >= 10) {
        return 7;
    } else {
        return 5;
    }
}

// f7
public static int coffeePreparationTime(boolean isMorning) {
    if (isMorning) {
        return 10;
    } else {
        return 5;
    }
}

// f8
public static int batteryLife(int usedHours) {
    if (usedHours <= 5) {
        return 8;
    } else {
        return 4;
    }
}

// f9
public static double calculateDistance(double speed, double time) {
    return speed * time;
}

// f10
public static String mealRating(int mealsPerDay) {
    if (mealsPerDay >= 4) {
        return "Healthy";
    } else if (mealsPerDay >= 3) {
        return "Moderately Healthy";
    } else {
        return "Unhealthy";
    }
}
}
