public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {3, 5, 234, 564, 34, 547, 4, 43, 645, 67, 88, 69, 457, 87, 1, 780, 8, 6, 4};
        int index = searchForNumber(34, array);
        //TODO 08: Prüfe, ob -1 zurückgegeben wurde, oder nicht. Wenn ja, schreibe "die Zahl wurde nicht gefunden", wenn ja schreibe den Index auf
        int index2 = searchForNumber(54645, array);
        //TODO 09: Mache genau dasselbe hierfür

        //TODO 10: TODO 08 und 09 ähneln sich...schreibe sie in eine Methode um, die den Index entgegennimmt und dann prüft!
    }

    //TODO 07: Schreibe diese Methode, die in einem array nach einer Zahl sucht und den Index zurückgibt. Wenn die Zahl nicht existiert, gebe -1 zurück
    public static int searchForNumber(int number, int[] array) {
        return -1;
    }
}