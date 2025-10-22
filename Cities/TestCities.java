package Cities;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class TestCities {
    public static ArrayList<RankedCity> list_cities = new ArrayList<>();

    

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.printf("How many cities will you rank? ");
        int n_cities = input.nextInt();

        if (n_cities < 2) {
            System.out.println("Need at least two cities to compare.");
        } else {

            for (int i = 0; i < n_cities; i++){
                System.out.printf("Enter city %d name ", i + 1);
                String name = input.nextLine();
                name = input.nextLine();

                System.out.printf("Enter city %d area ", i + 1);
                double area = input.nextDouble();

                list_cities.add(new RankedCity(name, area));
            }

            Collections.sort(list_cities);

            System.out.println(list_cities.get(1));
        }
        input.close();


    }
}
