
// Interface - Deklarerar metod för att hämta dagligt vattenbehov
public interface WaterRequirement {
    // Polymorfism - Alla klasser som implementerar detta interface måste ge implementationer för denna metod
    double getDailyWaterAmount();
}
