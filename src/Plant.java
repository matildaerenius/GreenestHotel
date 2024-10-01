// Abstrakt klass som representerar en växt och fungerar som superklass för växttyperna
// Den implementerar interface WaterRequirement och LiquidTypeRequirement för att säkerställa att alla underklasser
// definierar metoderna för dagligt vattenbehov och vätsketyp
public abstract class Plant implements WaterRequirement, LiquidTypeRequirement {

    // Inkapsling - Variablerna är privata och kan endast nås via getters
    private final String name;
    private final double height;

    // Konstruktor
    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }
    // Inkapsling - Getter för att hämta växtens namn
    public String getName() {
        return name;
    }
    // Inkapsling - Getter för att hämta växtens höjd
    public double getHeight() {
        return height;
    }
}
