import spark.ModelAndView;
import spark.Spark;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.SparkBase.staticFileLocation;


public class CohortController {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("public");

        ArrayList<ArrayList> testing = new ArrayList<>();



        Spark.get("/random", (req, res) -> {
            String randomName = Cohort.randomName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("randomName", randomName);
            model.put("template", "randomName.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


        Spark.get("/pair",(req, res) ->{
            HashMap<String, Object> model = new HashMap<>();
            model.put("randomNames",Cohort.randomNames());
            model.put("template", "randomNames.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


        Spark.get("/pairs",(req, res) ->{
            HashMap<String, Object> model = new HashMap<>();
            model.put("randomNames",Cohort.randomPairsUnknownSizeArray());
            model.put("template", "randomNamesPairs.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);





    }
}
