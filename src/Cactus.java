
// Arv - Cactus ärver egenskaper & metoder från Plant
public class Cactus extends Plant {

    // Konstant för att veta hur mycket vatten en kaktus behöver per dag
    private static final double WATER_AMOUNT = 0.02;

    // Konstruktor
    public Cactus(String name, double height) {
        super(name, height); // Arv - Anropar superklassens konstruktor
    }

    // Polymorfism - Metoden är överskriven från abstrakta klassen Plant
    @Override
    public double getDailyWaterAmount() {
        return WATER_AMOUNT;
    }
    // Polymorfism - Överskriven metod som returnerar en specifik vätsketyp för Cactus
    @Override
    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }
}

