import java.util.Random;

public class DogBreed {

    public static void main(String[] args) {
        String[] Dogbreeds = {"golden retriever", "german shepard", "labrador", "poodle", "chawawa", "egyptian", "boxer", "doberman", "rockwhiler", "puppy" };
        String[] Used = new String[5];
        int i = 0;
        boolean test;
        Random randomizer = new Random();
        int total = 100;
        while (total != 0 && i < 5) {
            int dogbreed = randomizer.nextInt(total) + 1;

            String new_Dogbreed;
            do {
                test = false;
                int ran_num = randomizer.nextInt(Dogbreeds.length);
                new_Dogbreed = Dogbreeds[ran_num];
                for (String element : Used) {
                    if (element == new_Dogbreed) {
                        test = true;
                        break;
                    }
                }
            } while (test == true);
            Used[i] = new_Dogbreed;
            System.out.println(new_Dogbreed);
            total = total - dogbreed;
            System.out.println(dogbreed + "%");
            i++;
        }


    }
    }



