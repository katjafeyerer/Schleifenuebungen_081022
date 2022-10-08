public class TwoDimArrayDemoApp {

    public static void main(String[] args) {

        int[] matrix = new int[5];               //1-Dimension
        int[][] twoDim = new int[5][3];         //2-Dimensionen
        //int[][][] threeDim = new int[3][3][3];  //3-Dimensionen

        twoDim[0][0] = 1;    //das ist 0/0 (4 Spalten, 0-2 Reihen)
        twoDim[0][1] = 7;   //x = 1.Wert (wird zuerst abgehandelt), y= 2.Wert (wird als zweites abgehandelt)
        twoDim[3][2] = 9;   //zuerst 3 waagrecht, dann 2 senkrecht

        //wie kann man das ausgeben? - was brauche ich dafür?
        //--> man braucht Schleifen, um einmal nach x und einmal nach y zu gehen

        for (int dimX = 0; dimX < twoDim.length; dimX++) { //length liefert uns die Länge von erster Dimension
            for (int dimY = 0; dimY < twoDim[dimX].length; dimY++) {
                System.out.print(twoDim[dimX][dimY] + "|");
            }
            System.out.println();


        /*for (int dimX = 0; dimX < twoDim.length; dimX++) { //length liefert uns die Länge von erster Dimension
            System.out.print(twoDim[dimX][0] + "|");}
        System.out.println();
        for (int dimX = 0; dimX < twoDim.length; dimX++) { //length liefert uns die Länge von erster Dimension
            System.out.print(twoDim[dimX][1] + "|");}
        System.out.println();
        for (int dimX = 0; dimX < twoDim.length; dimX++) { //length liefert uns die Länge von erster Dimension
            System.out.print(twoDim[dimX][2] + "|"); }*/
        }
        /*for (int dimY = 0; dimY < twoDim[0].length; dimY++) { //length liefert uns die Länge von erster Dimension
            for (int dimX = 0; dimX < twoDim.length; dimX++) {
                System.out.print(twoDim[dimX][dimY] + "|");
            }
            System.out.println();*/
    }

    int[][] screen = new int[3840][2160]; }
//}
