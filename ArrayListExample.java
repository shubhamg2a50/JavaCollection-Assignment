package pscsess;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        
        ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bengaluru");
        cities.add("Kolkata");
        cities.add("Chennai");
        
        for (String city : cities) {
            System.out.println(city);
        }
    }
}

