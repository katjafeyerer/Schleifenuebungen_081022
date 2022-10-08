public class DemoApp {

    public static void main(String[] args) {
        boolean shouldRun = true;
        int counter = 0;

        //Endlosschleifen (z.B. bei Serveranwendungen):
        //while (shouldRun ==true) { (= wie das Nachfolgende)
        while(shouldRun) {
            System.out.println("Die Schleife läuft");
            counter++;

            //bei großen Zahlen kann man auch einen Underscore machen
            if(counter ==10_000) {
                //shouldRun = false;

                //abbrechen:
                //shouldRun = false; (oder das folgende)

                //break;
                //geht sofort an das Ende der Schleife (alles, was danach ist, wird ignoriert)
                     /*beendet hier die Schleife,
                        Vorteil: Signalwort
                        Alternative: return*/
                //return;
                // beendet die Methode an dieser Stelle

                continue;
                //ich breche den aktuellen Schleifendurchlauf ab und fange oben an
                //sobald ich einen bestimmten Zustand erreicht habe
                //man sieht am Anfang, wenn was dahinter steht, aber dann nur mehr das, was in der Schleife ist
            }
        }
    }
}
