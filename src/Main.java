public class Main {
    public static void main(String[] args) {

        /*  Wake up bro function!!
            if(shouldWakeUp(false,5)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        */

        /*  Teen finder function!!
            if(hasTeen(14)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        */

        /* My little cat Şira s playing function!!
            if(isCatPlaying("springs",45)){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        */

       /* Rectangle area calculate function!!
            System.out.println("Rectangle area:"+ area(-5,30));
       */

        /* Rectangle area calculate function!!
            System.out.println("Circle area:"+ area(5.0));
        */
    }

    /**
     * Wake up bro function!!
     *
     * @param bark
     * @param hour
     * @return
     */
    private static boolean shouldWakeUp(boolean bark, int hour) {
        return (bark) && ((hour <= 8) || ((hour >= 20) && (hour <= 23)));
    }

    /**
     * Teen finder function!!
     *
     * @param age
     * @return
     */
    private static boolean hasTeen(int... age) {
        for (int j : age) {
            if (j >= 13 && (j <= 19)) {
                return true;
            }
        }
        return false;
    }

    /**
     * My little cat Şira s playing function!!
     *
     * @param season
     * @param heat
     * @return
     */
    private static boolean isCatPlaying(String season, double heat) {
        double minHeat = 25;
        double maxHeat = 35;
        if (season.equalsIgnoreCase("spring")) {
            maxHeat = 45;
        }
        if ((heat >= minHeat) && (heat <= maxHeat)) {
            return true;
        }
        return false;
    }

    /**
     * Rectangle area calculate function!!
     *
     * @param aSide
     * @param bSide
     * @return
     */
    private static double area(double aSide, double bSide) {
        if (aSide < 0 || bSide < 0) {
            return -1;
        } else {
            return aSide * bSide;
        }
    }

    /**
     * Circle area calculate function!!
     *
     * @param radius
     * @return
     */
    private static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            return radius * radius * Math.PI;
        }
    }

}