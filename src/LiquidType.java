
// Enum för olika vätsketyper
public enum LiquidType {
    TAP_WATER("kranvatten"),
    MINERAL_WATER("mineralvatten"),
    PROTEIN_DRINK("proteindryck");

    private final String description; // Inkapsling - Privat variabel med getter för att hämta värdet

    // Konstruktor
    LiquidType(String description) {
        this.description = description;
    }
    // Inkapsling - Getter för att hämta beskrivningen
    public String getDescription() {
        return description;
    }
}
