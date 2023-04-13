package Task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tv {

    Scanner aScanner = new Scanner(System.in);


    private boolean onOrOff = false;
    private int volume = 0;
    private int maxVolume = 50;
    private int minVolume = 0;
    private ArrayList<String> channels;

    private String currentChannel;

/*
    public Tv(int maxVolume, int minVolume, ArrayList<String> channels) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.channels = channels;
    }

 */

    public Tv(ArrayList<String> channels) {

        this.channels = channels;

        currentChannel = channels.get(0);

    }



    public void stateOfTV() {

        System.out.println("You're watching " + currentChannel + "" +
        " The volume is " + volume + ".");



    }



    public String textUIGettingUserInput(String msg){

        System.out.println(msg);

        String userInput = aScanner.nextLine();

        return userInput;
    }



    public void programStart() {

        System.out.println("This program is simulating what you can do with a TV");


    }

    public void turnOn () {


        String inputFromUser = textUIGettingUserInput("The TV is off. \n" +
                "To turn on the TV type 'on'. " +
                "To turn off the TV type 'off' \n" +
                "Press 'Q' to quit program");

        if (inputFromUser.equalsIgnoreCase("on")) {


            onOrOff = true;


            System.out.println("TV is now turned on");
            stateOfTV();
            watchingTV();


        }




        else if (inputFromUser.equalsIgnoreCase("Q")){

            System.out.println("You quitted the program");
        }


        else {

            turnOn();

        }


    }



public void changeVolume(){

    String userInput = textUIGettingUserInput("You can now change the volume. Type the volume you want the TV " +
            "to be on. Max volume is 50. Min volume is 0");

    if (userInput.equalsIgnoreCase("q"))
    {
        System.out.println("You quitted the program");

    } else if (userInput.equalsIgnoreCase("off")) {

        turnOn();

    }


    try {


        int newVolume = Integer.parseInt(userInput);

        if (newVolume <= 50 && newVolume >= 0) {


            setVolume(newVolume);
            System.out.println("The volume is now " + volume);
            watchingTV();
        }
        else {
            System.out.println("You didn't type a number between 0 and 50. Try again");
            changeVolume();
        }


    }
    catch (Exception e)  {

        System.out.println("You didn't type a number. Try again");
        changeVolume();



    }





}

public void changeChannel(){

    int counter = 0;

    while (counter < channels.size()) {

        System.out.println("Press " + (counter+1) + " to change to " + channels.get(counter));

        counter++;
    }

    String newUserInput = textUIGettingUserInput("Press the number of the channel you want to watch");

    switch (newUserInput){

        case "1":
            currentChannel = channels.get(0);
            System.out.println("You're now watching " + currentChannel);
            watchingTV();
            break;
        case "2":
            currentChannel = channels.get(1);
            System.out.println("You're now watching " + currentChannel);
            watchingTV();
            break;
        case "3":
            currentChannel = channels.get(2);
            System.out.println("You're now watching " + currentChannel);
            watchingTV();
            break;
        case "4":
            currentChannel = channels.get(3);
            System.out.println("You're now watching " + currentChannel);
            watchingTV();
            break;
        case "5":
            currentChannel = channels.get(4);
            System.out.println("You're now watching " + currentChannel);
            watchingTV();
            break;

        case "off":
            turnOn();
            break;



        case "Q":
            System.out.println("You quitted the program");
            break;

        default:
            changeChannel();
            break;

    }


}

    public void watchingTV(){

        if (onOrOff==true) {

            String userInput = textUIGettingUserInput("By typing 'ch' you get an overview of the " +
                    "channels you can watch and instructions on how to change channel. By typing 'v' you can " +
                    "set the volume of the TV. \nYou turn off the tv by typing 'off'" );


            if (userInput.equalsIgnoreCase("ch")) {

                changeChannel();



            } else if (userInput.equalsIgnoreCase("v")) {

                changeVolume();






            } else if (userInput.equalsIgnoreCase("off")) {

                turnOn();





            } else if (userInput.equalsIgnoreCase("Q")) {
                System.out.println("You quitted the program");


                }

            else {
                watchingTV();
            }
        }


        else {

            turnOn();

        }

    }


    public void setVolume(int volume) {
        this.volume = volume;
    }


}
