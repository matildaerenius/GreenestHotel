
// Arv - Palm ärver från Plant-klassen
public class Palm extends Plant {

    // Konstant för hur mycket vatten en palm behöver per dag
    private static final double WATER_PER_METER = 0.5;

    // Konstruktor
    public Palm(String name, double height) {
        super(name, height); // Arv - Anropar superklassens konstruktor
    }
    // Polymorfism - Returnerar mängden vatten Palm ska ha, vilket skiljer sig från andra plantor
    @Override
    public double getDailyWaterAmount(){
        return getHeight() * WATER_PER_METER;
    }
    // Polymorfism - Returnerar en annan vätsketyp (kranvatten) än de andra växterna
    @Override
    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }
}
