import com.woc.covid.pojo.CovidData;
import com.woc.covid.pojo.Data;
import com.woc.covid.pojo.Regional;
import com.woc.covid.pojo.Summary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static io.restassured.RestAssured.given;

public class Covid19 {

    public static void main(String[] args) {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://api.rootnet.in/covid19-in/stats/latest");
        CovidData covidData = response.as(CovidData.class);
        System.out.println(covidData);
        Data data = covidData.getData();
        List<Regional> regional = data.getRegional();
        int totalDeathInAllRegion = 0;
        for( Regional regionalData  : regional){
            totalDeathInAllRegion= totalDeathInAllRegion + regionalData.getDeaths();
        }
        System.out.println("totalDeathInAllRegion = "+ totalDeathInAllRegion);

        Summary summary = data.getSummary();
        Integer summaryDeathData = summary.getDeaths();
        if(summaryDeathData==totalDeathInAllRegion){
            System.out.println("Total summary death data is same as we have in total death in all region");
        }else {
            System.out.println("data not matched");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Map<String, Integer> map = new HashMap<>();
        for(Regional regionWiseconfirmedCasesForeign : regional){
            if(regionWiseconfirmedCasesForeign.getConfirmedCasesForeign() > 0){
                map.put(regionWiseconfirmedCasesForeign.getLoc(), regionWiseconfirmedCasesForeign.getConfirmedCasesForeign());
            }
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            String stateName = entry.getKey();
            Integer confirmedCasesForeign = entry.getValue();
            System.out.println(stateName + " = " + confirmedCasesForeign);
        }
    }
}
