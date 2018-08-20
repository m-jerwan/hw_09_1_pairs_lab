import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cohort {
    private ArrayList<String> names;

    public Cohort(){
        this.names = new ArrayList<String>();
        names.add("Stuart");
        names.add("Patrycja");
        names.add("Mike");
        names.add("Tahnee");
        names.add("Molly");
        names.add("Robbie");
        names.add("Beata");
        names.add("Joanna");
        names.add("Euan");
        names.add("Vicky");
        names.add("Marcin");
        names.add("Garry");
        names.add("Gemma");
        names.add("Digory");
        names.add("Ricardo");
        names.add("Kirstin");
        names.add("Mark");
        names.add("Raphael");
        names.add("Emil");
        names.add("Mellinda");
    }


    public ArrayList<String> getNames() {
        return names;
    }

    public static String randomName() {
        Cohort cohort = new Cohort();
        Collections.shuffle(cohort.getNames());
        return cohort.getNames().get(0);
    }


    public static ArrayList<String> randomNames() {
        Cohort cohort = new Cohort();

        Collections.shuffle(cohort.getNames());
        return cohort.getNames();
    }


    public static ArrayList<ArrayList> randomPairs(){
        Cohort cohort = new Cohort();
        ArrayList<ArrayList> randomPairs = new ArrayList<>();
        Collections.shuffle(cohort.getNames());
        for (int counter5 = 0; counter5 < 10; counter5 ++){

            ArrayList<String> tempArray = new ArrayList<>();

            tempArray.add(cohort.getNames().get(0));
            cohort.getNames().remove(0);
            tempArray.add(cohort.getNames().get(0));
            cohort.getNames().remove(0);

            randomPairs.add(tempArray);
        }
        return randomPairs;
    }







}
