package Task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> channelsOfTv = new ArrayList<>();

        channelsOfTv.add("DR1");
        channelsOfTv.add("DR2");
        channelsOfTv.add("Tv3");
        channelsOfTv.add("Tv2");
        channelsOfTv.add("Eurosport");



        Tv aTv = new Tv(channelsOfTv);

        aTv.programStart();
        aTv.turnOn();
        //aTv.watchingTV();


    }
}
