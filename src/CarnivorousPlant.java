
// Arv - CarnivorousPlant ärver från Plant-klassen
public class CarnivorousPlant extends Plant {

    // Konstanter för bas vattenmängd och extra vatten per meter höjd
    private static final double BASE_WATER_AMOUNT = 0.1;
    private static final double EXTRA_WATER_PER_METER = 0.2;

    // Konstruktor
    public CarnivorousPlant(String name, double height) {
        super(name, height); // Arv - Anropar superklassens konstruktor
    }

    //Polymorfism - Metoden är överskriven för att ta med logik specifik för köttätande växt
    @Override
    public double getDailyWaterAmount() {
        return BASE_WATER_AMOUNT + (getHeight() * EXTRA_WATER_PER_METER);
    }
    // Polymorfism - Returnerar en annan vätsketyp än de andra plantorna
    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }
}
