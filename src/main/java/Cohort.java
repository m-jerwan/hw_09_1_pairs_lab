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
//        names.add("Molly");
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

//under constr - if size of array unknown
    public static ArrayList<ArrayList> randomPairsUnknownSizeArray(){
        Cohort cohort = new Cohort();
        int howBigArray = cohort.getNames().size();
        int counter = howBigArray/2;
        ArrayList<ArrayList> randomPairs = new ArrayList<>();
        Collections.shuffle(cohort.getNames());

        for ( int counterInLoop = 0 ; counterInLoop < counter; counterInLoop ++){

            ArrayList<String> tempArray = new ArrayList<>();

            tempArray.add(cohort.getNames().get(0));
            cohort.getNames().remove(0);
            tempArray.add(cohort.getNames().get(0));
            cohort.getNames().remove(0);

            randomPairs.add(tempArray);
        }

        if (cohort.getNames().size() == 1){
            ArrayList<String> tempArray = new ArrayList<>();
            tempArray.add(cohort.getNames().get(0));
            randomPairs.add(tempArray);
        }
        return randomPairs;
    }








}
