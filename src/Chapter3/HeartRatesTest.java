package Chapter3;

public class HeartRatesTest {
    public static void main( String [] args){
        HeartRates person1  = new HeartRates("Alina", "Test", 3,20,1990);
        System.out.printf("Maximum heart rate: %s bpm%n",person1.getMaximumHeartRate(),person1.getFirstName(),person1.getLastName(),person1.getBirthMonth(),person1.getBirthDate(),person1.getBirthYear());

    }
}


