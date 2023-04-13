package Task3;

/*
 Spørgsmål:

         Afsluttende spørgsmål:

         * Hvad gør metoden instanceof?
            MIT SVAR: Tjekker om et objekt er en instans af en klasse, som har arvet fra en bestemt klasse eller
            som har implementeret et bestemt interface.

            I det her tilfælde tjekkes der om de forskellige objekter er instanser af klasser, der har arvet fra Animal
            (en abstrakt klasse) eller som har implementeret Edible (et interface).


         * Hvad vil det sige at en metode er abstrakt?
            MIT SVAR: Metoden skrives i interfaces eller abstrakte klasser. Alle klasser, der har arvet eller
            implementeret den abstrakte klasse eller det interface metoden er skrevet i, SKAL overskrive denne metode.


         * Kan man have en ikke-abstrakt klasse med en abstrakt metode? Hvis ikke, hvorfor ikke?
            MIT SVAR: Nej. Det giver ikke helt mening at have en abstrakt metode i en ikke-abstrakt klasse. I så fald
            en ikke-abstrakt klasse KUNNE have en abstrakt metode, ville instanser af denne klasse ikke kunne
            gøre brug af den metode, da en abstrakt metode ikke har nogen 'body' (den kan ikke indeholde noget kode).
            Hvorfor have en metode i en klasse, der kan laves instanser af, uden at disse instanser kan gøre brug af
            den metode?

         * Hvad betyder @override?
            MIT SVAR: At koden i en metode fra et implementeret interface eller en arvet klasse, overskrives i den klasse,
            som har implementeret eller arvet. Metoden gør altså noget andet end det, den gør i det interface eller den
            klasse, som metoden er implementeret/arvet fra.

 */

public class TestEdible {

    public static void main(String[] args) {

        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible)
                System.out.println(((Edible)objects[i]).howToEat());
            if (objects[i] instanceof Animal) {
                System.out.println(((Animal)objects[i]).sound());
            }
        }
    }



}

