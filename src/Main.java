import javax.swing.*;

public class Main {

    // Konstanter för meddelanden som används i programmet.
    private static final String PROMPT_WATERING = "Which plant should get liquid? \n" +
            "(type 'exit' to close the program)";
    private static final String MESSAGE_PLANT_NOT_FOUND = "The plant '%s' is not in the hotel. Please try again!";
    private static final String MESSAGE_PROGRAM_EXIT = "Exits the program!";
    private static final String MESSAGE_PLANT_WATERING = " The %s should have %.2f liters of %s per day";

    public static void main(String[] args) {
        // Polymorfism - Skapar och lagrar alla växter i en array och tilldelar dom namn & höjd.
        Plant[] plants = {
                new Cactus("Igge", 0.2),
                new Palm("Laura", 5.0),
                new CarnivorousPlant("Meatloaf", 0.7),
                new Palm("Olof", 1.0)
        };

        // Loopar programmet tills användaren avslutar
        while (true) {
            String input = JOptionPane.showInputDialog(null,
                    PROMPT_WATERING);

            // Kontroll för att se om användaren klickat cancel eller skrivit exit
            if (input == null || input.equalsIgnoreCase("exit")) {
                // Användaren har klickat "avbryt" eller skrivit "exit"
                JOptionPane.showMessageDialog(null, MESSAGE_PROGRAM_EXIT);
                break; // Avbryter loopen och avslutar programmet
            }

            // Hitta växten med namnet, inkapsling - för att skydda datan i växtklassen
            Plant plant = findPlantByName(plants, input); // Hitta växten med namnet

            if (plant != null) {
                // Polymorfism - Använder getDailyWaterAmount och getLiquidType som implementeras olika beroende på växten
                String message = String.format(MESSAGE_PLANT_WATERING,
                        plant.getClass().getSimpleName() + " " + plant.getName(),
                        plant.getDailyWaterAmount(),
                        plant.getLiquidType().getDescription());
                JOptionPane.showMessageDialog(null, message);
            } else {
                // Felmeddelande om växten inte hittas
                JOptionPane.showMessageDialog(null, String.format(MESSAGE_PLANT_NOT_FOUND, input));
            }
        }
    }
    // Metod för att hitta en växt baserat på namn
    private static Plant findPlantByName(Plant[] plants, String name) {
        for (Plant plant : plants) {
            if (plant.getName().equalsIgnoreCase(name)) {
                return plant; // Returnera växten om den hittas
            }
        }
        return null; // Returnera null om ingen växt med det namnet hittas
    }
}