public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double x,double y){

        double convertedDoubleX = x*1000;
        double convertedDoubleY = y*1000;
        int convertedX = (int) convertedDoubleX;
        int convertedY = (int) convertedDoubleY;
        if(convertedX == convertedY){
            return true;
        } else {
            return false;
        }

    }

}
