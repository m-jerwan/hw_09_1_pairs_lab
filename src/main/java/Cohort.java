import java.util.ArrayList;
import java.util.Collections;

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


    public static ArrayList<String> randomTwoNames() {

        ArrayList<String> randomNames = new ArrayList<String>();
        Cohort cohort = new Cohort();

        Collections.shuffle(cohort.getNames());
        randomNames.add(cohort.getNames().get(0));
        randomNames.add(cohort.getNames().get(1));
        return randomNames;
    }








}
