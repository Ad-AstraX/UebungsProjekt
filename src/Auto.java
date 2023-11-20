public class Auto {
    protected String herstellungsJahr; //TODO 01: Warum ist dieses Attribut protected?
    protected String besitzer;
    protected final double maxGeschwindigkeit; //TODO 02: wird dieses Attribut deklariert oder initialisiert?
    protected double tankFuellung;

    public Auto(String herstellungsJahr, String besitzer, double maxGeschwindigkeit) {
        //TODO 03: Schreibe den Konstruktor
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public String Info() {
        //TODO 04: Schreibe diese Methode so, dass ein String mit allen Angaben zurückgegeben wird.
        return null;
    }

    //TODO 05: Schreibe alle getter und setter
}
