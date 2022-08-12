import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        System.out.println("----welcome----\n");
        int age = 0;
        do {
            System.out.println("please enter your age: ");
            Scanner Age = new Scanner(System.in);
            try {
                age = Age.nextInt();
            } catch (Exception e){
                System.out.println("please enter a int");
            }
            if (age > 110 || age < 0) {
                System.out.println("please enter a valid age range");
            }
        } while (age > 110 || age < 0);

        int Heart_rate = 220-age;
        System.out.println("your max heart rate is: "+Heart_rate);
        healthy_range(Heart_rate);

    }

    private static void healthy_range(int heart_rate) {
        double minHeartRate = heart_rate*0.5;
        double maxHeartRate = heart_rate*0.8;
        System.out.println("a healthy heart rate zone is between: "+(int)minHeartRate+" - "+(int)maxHeartRate+" beats per minute");
    }


}
