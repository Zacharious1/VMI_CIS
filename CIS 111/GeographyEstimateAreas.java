//Help Received: none
import java.lang.Math;
public class GeographyEstimateAreas {
    private final static double ATLANTA_X1 = 33.7489954;
    private final static double ATLANTA_Y1 = -84.3879824;
    private final static double CHARLOTTE_X1 = 35.2270869;
    private final static double CHARLOTTE_Y1 = -80.8431267;
    private final static double SAVANNAH_X1 = 32.0835407;
    private final static double SAVANNAH_Y1 = -81.0998342;
    private final static double ORLANDO_X1 = 28.5383355;
    private final static double ORLANDO_Y1 = -81.3792365;

    public static void main(String[] args) {
        double AXRadians = Math.toRadians(ATLANTA_X1);
        double AYRadians = Math.toRadians(ATLANTA_Y1);
        double CXRadians = Math.toRadians(CHARLOTTE_X1);
        double CYRadians = Math.toRadians(CHARLOTTE_Y1);
        double SXRadians = Math.toRadians(SAVANNAH_X1);
        double SYRadians = Math.toRadians(SAVANNAH_Y1);
        double OXRadians = Math.toRadians(ORLANDO_X1);
        double OYRadians = Math.toRadians(ORLANDO_Y1);
        double radius = 6371.01;
        double distanceBetweenAtlantaAndCharlotte = radius * Math.acos(Math.sin(AXRadians) * Math.sin(CXRadians) + Math.cos(AXRadians) * Math.cos(CXRadians) * Math.cos(AYRadians - CYRadians));
        double distanceBetweenAtlantaAndOrlando = radius * Math.acos(Math.sin(AXRadians) * Math.sin(OXRadians) + Math.cos(AXRadians) * Math.cos(OXRadians) * Math.cos(AYRadians - OYRadians));
        double distanceBetweenSavannahAndCharlotte = radius * Math.acos(Math.sin(SXRadians) * Math.sin(CXRadians) + Math.cos(SXRadians) * Math.cos(CXRadians) * Math.cos(SYRadians - CYRadians));
        double distanceBetweenSavannahAndOrlando = radius * Math.acos(Math.sin(SXRadians) * Math.sin(OXRadians) + Math.cos(SXRadians) * Math.cos(OXRadians) * Math.cos(SYRadians - OYRadians));
        double distanceBetweenOrlandoAndCharlotte = radius * Math.acos(Math.sin(OXRadians) * Math.sin(CXRadians) + Math.cos(OXRadians) * Math.cos(CXRadians) * Math.cos(OYRadians - CYRadians));

        double sACO = ((distanceBetweenAtlantaAndCharlotte + distanceBetweenOrlandoAndCharlotte + distanceBetweenAtlantaAndOrlando) / 2.0);
        double sCSO = ((distanceBetweenSavannahAndCharlotte + distanceBetweenSavannahAndOrlando + distanceBetweenOrlandoAndCharlotte) / 2.0);

        double areaOfACO = Math.sqrt(sACO*(sACO - distanceBetweenAtlantaAndCharlotte)* (sACO - distanceBetweenOrlandoAndCharlotte)* (sACO - distanceBetweenAtlantaAndOrlando));
        double areaOfCSO = Math.sqrt(sCSO*(sCSO - distanceBetweenSavannahAndCharlotte)* (sCSO - distanceBetweenOrlandoAndCharlotte)* (sCSO - distanceBetweenSavannahAndOrlando));
        double areaBetweenCities = areaOfACO + areaOfCSO;

        System.out.print("The area between the cities is " + areaBetweenCities);

    }
}
