public class DemoLoopApp2 {

    public static void main(String[] args) {

        int vorgaenger = 0;
        int counter = 0;

        for( int i= 1; i <100_000; i++) { //den Wertebereich definieren
            if((i + vorgaenger)%351 ==0) { //if-Abfrage, keine Schleife //mit rechter Maustaste auf den roten Bug bei Debugger
                //-> Condition stellen (wann soll er stehen bleiben)
                System.out.println("Der Vorgänger von " + i + " lautet " + vorgaenger);
                counter++;

                if (counter ==10) {
                    return;
                    //oder break
                }
            }
            vorgaenger = i;
        }
    }
}
