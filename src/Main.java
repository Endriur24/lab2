public class Main {

    public static void main(String[] args) {



        Walec walec = new Walec(2,4,3);
        Kula kula = new Kula(2,3);
        Pret pret = new Pret(2,4);
        walec.opis();
        kula.opis();
        pret.opis();

        Punkt[] obiekt = new Punkt [6];
        obiekt[0] = new Walec(2,3,4);
        obiekt[1] = new Walec(3,2,4);
        obiekt[2] = new Kula(3,2);
        obiekt[3] = new Kula(4,2);
        obiekt[4] = new Pret(3,6);
        obiekt[5] = new Pret(6,3);

        for(int i=0 ;i<6; i++){
            obiekt[i].opis();
        }

        System.out.println("\n\n  Momenty bezwładność dla elementów tablicy względem nowej osi oddalonej o '3' :");

        for(int i=0 ;i<6; i++){
            obiekt[i].opis();
            System.out.println("moment bezwladnosci ze steinera: " + obiekt[i].momBezSt(3));

        }




    }
}
